package com.study_keyword_super.exp2;

public class HeavyBox1 extends Box6 {
    int weight;

    public HeavyBox1(int width, int height, int depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }
    public HeavyBox1() {
        this.weight = -1;
    }
}
