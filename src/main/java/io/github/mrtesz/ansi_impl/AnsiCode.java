package io.github.mrtesz.ansi_impl;

public class AnsiCode {

    private final String code;

    public AnsiCode(int code) {
        this.code = "\u001B[" + code + "m";
    }
    public AnsiCode(String code) {
        this.code = "\u001B[" + code + "m";
    }

    @Override
    public String toString() {
        return code;
    }

    public String parse() {
        return code;
    }
}
