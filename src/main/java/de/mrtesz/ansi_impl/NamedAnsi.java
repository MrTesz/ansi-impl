package de.mrtesz.ansi_impl;

public class NamedAnsi {
    
    public final static ParagraphAnsi RESET = new ParagraphAnsi("0", "r");

    public final static ParagraphAnsi BOLD = new ParagraphAnsi("1", "l");
    public final static Ansi DIM = new Ansi("2");
    public final static ParagraphAnsi ITALIC = new ParagraphAnsi("3", "o");
    public final static ParagraphAnsi UNDERLINE = new ParagraphAnsi("4", "n");
    public final static Ansi BLINK = new Ansi("5");
    public final static Ansi REVERSE = new Ansi("7");
    public final static Ansi HIDDEN = new Ansi("8");
    public final static ParagraphAnsi STRIKETHROUGH = new ParagraphAnsi("9", "m");

    public final static ParagraphAnsi BLACK = new ParagraphAnsi("30", "0");
    public final static ParagraphAnsi RED = new ParagraphAnsi("31", "4");
    public final static ParagraphAnsi GREEN = new ParagraphAnsi("32", "2");
    public final static ParagraphAnsi ORANGE = new ParagraphAnsi("33", "6");
    public final static ParagraphAnsi BLUE = new ParagraphAnsi("34", "1");
    public final static ParagraphAnsi MAGENTA = new ParagraphAnsi("35", "5");
    public final static ParagraphAnsi CYAN = new ParagraphAnsi("36", "3");
    public final static ParagraphAnsi DARK_WHITE = new ParagraphAnsi("37", "7");

    public final static Ansi BG_BLACK = new Ansi("40");
    public final static Ansi BG_RED = new Ansi("41");
    public final static Ansi BG_GREEN = new Ansi("42");
    public final static Ansi BG_YELLOW = new Ansi("43");
    public final static Ansi BG_BLUE = new Ansi("44");
    public final static Ansi BG_MAGENTA = new Ansi("45");
    public final static Ansi BG_CYAN = new Ansi("46");
    public final static Ansi BG_DARK_WHITE = new Ansi("47");

    public final static ParagraphAnsi BRIGHT_BLACK = new ParagraphAnsi("90", "8");
    public final static ParagraphAnsi BRIGHT_RED = new ParagraphAnsi("91", "c");
    public final static ParagraphAnsi BRIGHT_GREEN = new ParagraphAnsi("92", "a");
    public final static ParagraphAnsi YELLOW = new ParagraphAnsi("93", "e");
    public final static ParagraphAnsi BRIGHT_BLUE = new ParagraphAnsi("94", "9");
    public final static ParagraphAnsi BRIGHT_MAGENTA = new ParagraphAnsi("95", "d");
    public final static ParagraphAnsi BRIGHT_CYAN = new ParagraphAnsi("96", "b");
    public final static ParagraphAnsi WHITE = new ParagraphAnsi("97", "f");

    public final static Ansi BG_BRIGHT_BLACK = new Ansi("100");
    public final static Ansi BG_BRIGHT_RED = new Ansi("101");
    public final static Ansi BG_BRIGHT_GREEN = new Ansi("102");
    public final static Ansi BG_BRIGHT_YELLOW = new Ansi("103");
    public final static Ansi BG_BRIGHT_BLUE = new Ansi("104");
    public final static Ansi BG_BRIGHT_MAGENTA = new Ansi("105");
    public final static Ansi BG_BRIGHT_CYAN = new Ansi("106");
    public final static Ansi BG_WHITE = new Ansi("107");
}
