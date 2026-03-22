package io.github.mrtesz.ansi_impl;

public class ParagraphAnsi extends Ansi {

    private final String paragraphCode;

    protected ParagraphAnsi(String code, String paragraphCode) {
        super(code);
        this.paragraphCode = paragraphCode;
    }

    public String getParagraphCode() {
        return paragraphCode;
    }
}
