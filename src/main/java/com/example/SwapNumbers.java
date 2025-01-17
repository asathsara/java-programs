package com.example;

public class SwapNumbers {

    private int first;
    private int second;

    public SwapNumbers(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public void swap() {
        this.first = this.first + this.second;
        this.second = this.first - this.second;
        this.first = this.first - this.second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

}
