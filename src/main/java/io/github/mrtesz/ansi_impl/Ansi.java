package io.github.mrtesz.ansi_impl;

public class Ansi {

    private final String code;

    protected Ansi(String code) {
        this.code = "\u001B[" + code + "m";
    }

    @Override
    public String toString() {
        return getCode();
    }

    public String getCode() {
        return code;
    }
}
