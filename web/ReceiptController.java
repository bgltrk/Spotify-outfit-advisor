package com.spotifyoutfit.web;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReceiptController {

    @PostMapping("/api/receipt/top3")
    public Map<String, Object> top3(@RequestBody Map<String, String> body) {

        String text = body.getOrDefault("text", "");

        List<String> lines = new ArrayList<>();
        for (String line : text.split("\\R")) {
            String t = line.trim();
            if (!t.isEmpty()) lines.add(t);
        }

        List<String> top3 = lines.size() <= 3 ? lines : lines.subList(0, 3);

        GenreMapper.Result r = GenreMapper.fromTop3Multi(top3);

        List<String> also = new ArrayList<>();
        for (MusicGenre g : r.alsoMatched) also.add(g.name());

        return Map.of(
                "top3", top3,
                "primary", r.primary.name(),
                "alsoMatched", also
        );
    }
}