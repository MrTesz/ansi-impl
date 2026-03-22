package de.mrtesz.ansi_impl;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class AnsiParser {

    private static final Map<Character, String> PARAGRAPH_MAP = new HashMap<>();

    static {
        try {
            for (Field f : NamedAnsi.class.getDeclaredFields()) {
                if (!Modifier.isStatic(f.getModifiers())) continue;
                if (!(f.get(null) instanceof ParagraphAnsi p)) continue;

                PARAGRAPH_MAP.put(
                        p.getParagraphCode().charAt(0),
                        p.getCode()
                );
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static String replaceParagraphAnsi(String in) {
        StringBuilder out = new StringBuilder(in.length());

        for (int i = 0; i < in.length(); i++) {
            char c = in.charAt(i);

            if (c == '§' && i + 1 < in.length()) {
                char code = in.charAt(++i);

                String ansi = PARAGRAPH_MAP.get(code);

                if (ansi != null) {
                    out.append(ansi);
                    continue;
                }

                out.append('§').append(code);
                continue;
            }

            out.append(c);
        }

        return out.toString() + NamedAnsi.RESET;
    }
}
