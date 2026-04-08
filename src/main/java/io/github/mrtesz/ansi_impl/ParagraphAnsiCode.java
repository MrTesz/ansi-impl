package io.github.mrtesz.ansi_impl;

public class ParagraphAnsiCode extends AnsiCode {

    private final String paragraphCode;

    protected ParagraphAnsiCode(int code, String paragraphCode) {
        super(code);
        this.paragraphCode = paragraphCode;
    }

    public String getParagraphCode() {
        return paragraphCode;
    }
}
