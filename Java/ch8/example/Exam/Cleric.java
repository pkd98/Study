package com.example.Exam;

import java.util.Random;

public class Cleric {
    String name;
    int HP = 50;
    int MP = 10;
    static final int MAX_HP = 50;
    static final int MAX_MP = 10;

    void selfAid() {
        this.MP = MP - 5;
        this.HP = MAX_HP;
    }

    int pray(int sec) {
        int realAmount = 0;

        Random random = new Random();
        int oldMP = this.MP;
        int Amount = (random.nextInt(3) + sec);
        this.MP = (this.MP + Amount) <= MAX_MP ? (this.MP + Amount) : MAX_MP;
        realAmount = this.MP - oldMP;

        return realAmount;
    }
}
