package Exam;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void heal(Hero hero) {
        int basePoint = 10; // 기본 회복 포인트
        int recovPoint = (int) (basePoint * this.wand.power); // 지팡이에 의한 증폭
        hero.setHp(hero.getHp() + recovPoint); // 용사의 HP를 회복
    }
}
