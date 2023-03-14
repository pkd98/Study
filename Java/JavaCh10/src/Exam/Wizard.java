package Exam;

public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;
    
    public int getHp() {
        return hp;
    }
    
    public int getMp() {
        return mp;
    }
    
    public String getName() {
        return name;
    }
    
    public Wand getWand() {
        return wand;
    }
    
    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public void setMp(int mp) {
        this.mp = mp;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public void heal(Hero hero) {
        int basePoint = 10; // 기본 회복 포인트
        int recovPoint = (int) (basePoint * this.wand.power); // 지팡이에 의한 증폭
        hero.setHp(hero.getHp() + recovPoint); // 용사의 HP를 회복
    }
}
