package io.github.mrtesz.ansi_impl;

public class Ansi {
    
    public final static ParagraphAnsiCode RESET = new ParagraphAnsiCode(0, "r");

    // Special
    public final static ParagraphAnsiCode BOLD = new ParagraphAnsiCode(1, "l");
    public final static AnsiCode DIM = new AnsiCode(2);
    public final static AnsiCode RESET_INTENSITY = new AnsiCode(22);

    public final static ParagraphAnsiCode ITALIC = new ParagraphAnsiCode(3, "o");
    public final static AnsiCode RESET_ITALIC = new AnsiCode(23);

    public final static ParagraphAnsiCode UNDERLINE = new ParagraphAnsiCode(4, "n");
    public final static AnsiCode RESET_UNDERLINE = new AnsiCode(23);
    public static AnsiCode underlineColor(int r, int g, int b) {
        return new AnsiCode("58;2;" + r + ";" + g + ";" + b);
    }
    public final static AnsiCode RESET_UNDERLINE_COLOR = new AnsiCode(59);

    public final static AnsiCode SLOW_BLINK = new AnsiCode(5);
    public final static AnsiCode RAPID_BLINK = new AnsiCode(6);
    public final static AnsiCode RESET_BLINK = new AnsiCode(25);

    public final static AnsiCode INVERT = new AnsiCode(7);
    public final static AnsiCode RESET_INVERT = new AnsiCode(27);

    public final static AnsiCode HIDE = new AnsiCode(8);
    public final static AnsiCode RESET_HIDE = new AnsiCode(28);

    public final static ParagraphAnsiCode STRIKETHROUGH = new ParagraphAnsiCode(9, "m");
    public final static AnsiCode RESET_STRIKETHROUGH = new AnsiCode(29);

    public final static AnsiCode PROPORTIONAL_SPACING = new AnsiCode(26);
    public final static AnsiCode RESET_PROPORTIONAL_SPACING = new AnsiCode(50);

    // Font
    public final static AnsiCode FONT_PRIMARY = new AnsiCode(10);
    public static AnsiCode font(short font) {
        return new AnsiCode(10 + font);
    }
    public final static AnsiCode FONT_FRAKTUR = new AnsiCode(20);

    // Foreground
    public final static ParagraphAnsiCode BLACK = new ParagraphAnsiCode(30, "0");
    public final static ParagraphAnsiCode RED = new ParagraphAnsiCode(31, "4");
    public final static ParagraphAnsiCode GREEN = new ParagraphAnsiCode(32, "2");
    public final static ParagraphAnsiCode ORANGE = new ParagraphAnsiCode(33, "6");
    public final static ParagraphAnsiCode BLUE = new ParagraphAnsiCode(34, "1");
    public final static ParagraphAnsiCode MAGENTA = new ParagraphAnsiCode(35, "5");
    public final static ParagraphAnsiCode CYAN = new ParagraphAnsiCode(36, "3");
    public final static ParagraphAnsiCode DARK_WHITE = new ParagraphAnsiCode(37, "7");

    public final static ParagraphAnsiCode BRIGHT_BLACK = new ParagraphAnsiCode(90, "8");
    public final static ParagraphAnsiCode BRIGHT_RED = new ParagraphAnsiCode(91, "c");
    public final static ParagraphAnsiCode BRIGHT_GREEN = new ParagraphAnsiCode(92, "a");
    public final static ParagraphAnsiCode YELLOW = new ParagraphAnsiCode(93, "e");
    public final static ParagraphAnsiCode BRIGHT_BLUE = new ParagraphAnsiCode(94, "9");
    public final static ParagraphAnsiCode BRIGHT_MAGENTA = new ParagraphAnsiCode(95, "d");
    public final static ParagraphAnsiCode BRIGHT_CYAN = new ParagraphAnsiCode(96, "b");
    public final static ParagraphAnsiCode WHITE = new ParagraphAnsiCode(97, "f");

    public static AnsiCode foreground(int r, int g, int b) {
        return new AnsiCode("38;2;" + r + ";" + g + ";" + b);
    }

    public final static AnsiCode RESET_FOREGROUND = new AnsiCode(39);

    // Background
    public final static AnsiCode BG_BLACK = new AnsiCode(40);
    public final static AnsiCode BG_RED = new AnsiCode(41);
    public final static AnsiCode BG_GREEN = new AnsiCode(42);
    public final static AnsiCode BG_YELLOW = new AnsiCode(43);
    public final static AnsiCode BG_BLUE = new AnsiCode(44);
    public final static AnsiCode BG_MAGENTA = new AnsiCode(45);
    public final static AnsiCode BG_CYAN = new AnsiCode(46);
    public final static AnsiCode BG_DARK_WHITE = new AnsiCode(47);

    public final static AnsiCode BG_BRIGHT_BLACK = new AnsiCode(100);
    public final static AnsiCode BG_BRIGHT_RED = new AnsiCode(101);
    public final static AnsiCode BG_BRIGHT_GREEN = new AnsiCode(102);
    public final static AnsiCode BG_BRIGHT_YELLOW = new AnsiCode(103);
    public final static AnsiCode BG_BRIGHT_BLUE = new AnsiCode(104);
    public final static AnsiCode BG_BRIGHT_MAGENTA = new AnsiCode(105);
    public final static AnsiCode BG_BRIGHT_CYAN = new AnsiCode(106);
    public final static AnsiCode BG_WHITE = new AnsiCode(107);

    public static AnsiCode background(int r, int g, int b) {
        return new AnsiCode("48;2;" + r + ";" + g + ";" + b);
    }

    public final static AnsiCode RESET_BACKGROUND = new AnsiCode(49);

}
