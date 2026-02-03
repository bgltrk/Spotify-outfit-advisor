package com.spotifyoutfit.web;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {

    @GetMapping("/api/genres")
    public List<String> genres() {
        List<String> list = new ArrayList<>();
        for (MusicGenre g : MusicGenre.values()) list.add(g.name());
        return list;
    }

    @GetMapping("/api/recommend")
    public Map<String, Object> recommend(
            @RequestParam String genre,
            @RequestParam(required = false, defaultValue = "") String also
    ) {
        MusicGenre primary = MusicGenre.valueOf(genre);

        List<MusicGenre> pool = new ArrayList<>();
        pool.add(primary);

        // also="ALTERNATIVE_INDIE,POP" gibi gelecek
        if (also != null && !also.trim().isEmpty()) {
            for (String s : also.split(",")) {
                String t = s.trim();
                if (!t.isEmpty()) {
                    try {
                        pool.add(MusicGenre.valueOf(t));
                    } catch (Exception ignored) {}
                }
            }
        }

        // Havuzdan birleşik öneri üret
        List<String> colors = mergeDistinct(pool, g -> g.colors);
        List<String> textures = mergeDistinct(pool, g -> g.textures);

        List<String> tops = mergeDistinct(pool, g -> g.tops);
        List<String> bottoms = mergeDistinct(pool, g -> g.bottoms);
        List<String> shoes = mergeDistinct(pool, g -> g.shoes);
        List<String> accessories = mergeDistinct(pool, g -> g.accessories);

        return new LinkedHashMap<>() {{
            put("genre", primary.name());
            put("vibe", primary.vibe);
            put("alsoUsed", pool.stream().map(Enum::name).toList());

            put("colors", colors);
            put("textures", textures);

            put("tops", tops);
            put("bottoms", bottoms);
            put("shoes", shoes);
            put("accessories", accessories);
        }};
    }

    private interface ArrGetter { String[] get(MusicGenre g); }

    private List<String> mergeDistinct(List<MusicGenre> pool, ArrGetter getter) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (MusicGenre g : pool) {
            String[] arr = getter.get(g);
            if (arr == null) continue;
            for (String x : arr) if (x != null && !x.isBlank()) set.add(x);
        }
        return new ArrayList<>(set);
    }
}


