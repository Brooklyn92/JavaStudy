package com.study_enum.study_two.pt5;

public enum Operation {
    SUM {
        public int action(int x, int y) {
            return x + y;
        }
    };
    public abstract int action ( int x, int y);
}

