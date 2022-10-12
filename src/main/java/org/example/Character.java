package org.example;

public class Character {
//    - attributes: int power, in hp
//  - methods: void kick(org.example.Character c), boolean isAlive()
    private int power;
    private  int hp;

    public Character(int power, int hp){
        this.power=power;
        this.hp=hp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp>=0){this.hp = hp;}
        else{this.hp = 0;}
    }
    public void kick(Character c){
        System.out.println("Удар");
    }

    public String toString(){
        return this.getClass().getSimpleName()+"{hp="+hp+", power="+power+"}";
    }

    public boolean isAlive(){
        return getHp()>0;
    }

}

