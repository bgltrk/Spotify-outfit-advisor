package com.spotifyoutfit.web;

import java.util.*;

public class GenreMapper {

    public static Result fromTop3Multi(List<String> top3) {

        Map<MusicGenre, Integer> score = new LinkedHashMap<>();
        for (MusicGenre g : MusicGenre.values()) score.put(g, 0);

        for (int i = 0; i < top3.size() && i < 3; i++) {
            String g = top3.get(i).toLowerCase().trim();
            int w = 3 - i; // 3,2,1

            // CHRISTMAS / HOLIDAY
            if (containsAny(g, "christmas", "xmas", "holiday", "noel", "yılbaşı", "yilbasi")) {
                add(score, MusicGenre.CHRISTMAS, 6 * w);
            }

            // KPOP
            if (containsAny(g, "k-pop", "kpop")) add(score, MusicGenre.KPOP, 5 * w);

            // HIPHOP / RAP
            if (containsAny(g, "hip-hop", "hip hop", "hiphop", "rap", "trap")) {
                add(score, MusicGenre.HIP_HOP_RAP_TRAP, 4 * w);
            }

            // ROCK (anatolian rock dahil)
            if (containsAny(g, "rock", "pop punk")) add(score, MusicGenre.ROCK_PUNK, 4 * w);

            // RNB
            if (containsAny(g, "r&b", "rnb")) add(score, MusicGenre.RNB, 4 * w);

            // SOUL
            if (g.contains("soul")) add(score, MusicGenre.SOUL, 3 * w);

            // ALTERNATIVE / INDIE (alternative rock gibi birleşikler için)
            if (containsAny(g, "alternative", "alt ", "indie")) add(score, MusicGenre.ALTERNATIVE_INDIE, 3 * w);

            // ELECTRONIC
            if (containsAny(g, "electronic", "edm", "house", "techno")) add(score, MusicGenre.ELECTRONIC, 3 * w);

            // POP (en genel)
            if (g.contains("pop")) add(score, MusicGenre.POP, 2 * w);
        }

        // Primary = en yüksek skor
        MusicGenre primary = score.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();

        int max = score.get(primary);

        // AlsoMatched: güçlü olanları da göster (eşik: max'in %60'ı)
        List<MusicGenre> also = new ArrayList<>();
        for (Map.Entry<MusicGenre, Integer> e : score.entrySet()) {
            if (e.getValue() <= 0) continue;
            if (e.getKey() == primary) continue;
            if (e.getValue() >= Math.ceil(max * 0.60)) {
                also.add(e.getKey());
            }
        }

        return new Result(primary, also, score);
    }

    private static boolean containsAny(String text, String... keys) {
        for (String k : keys) if (text.contains(k)) return true;
        return false;
    }

    private static void add(Map<MusicGenre, Integer> score, MusicGenre g, int v) {
        score.put(g, score.get(g) + v);
    }

    public static class Result {
        public final MusicGenre primary;
        public final List<MusicGenre> alsoMatched;
        public final Map<MusicGenre, Integer> score;

        public Result(MusicGenre primary, List<MusicGenre> alsoMatched, Map<MusicGenre, Integer> score) {
            this.primary = primary;
            this.alsoMatched = alsoMatched;
            this.score = score;
        }
    }
}