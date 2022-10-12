package org.example;

public class GameManager {
    void fight(Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()){
            c1.kick(c2);
            c2.kick(c1);
            System.out.println(c1.getClass().getSimpleName()+
                    " and " + c2.getClass().getSimpleName() + " are exchanging blows...");
        }
        if (c1.isAlive()){
            System.out.println(c2.getClass().getSimpleName()+" has died");
        }
        else{
            System.out.println(c1.getClass().getSimpleName()+" has died");
        }
    }
    }
