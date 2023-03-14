package Exam;

public class Wand {
    private String name; // 지팡이 이름
    double power; // 지팡이 마력
    
    public double getPower() {
        return power;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPower(double power) {
        this.power = power;
    }
}
