package com.study_enum.study_two.pt4;

public enum Color {
    RED("#0000D"),
    BLUE("00001");
    private String code;

    Color(String code) {
        this.code = code;
    }
    public String getCode(){
        return code;
    }
}
