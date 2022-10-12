package org.example;

import java.util.Random;

public class Noble extends Character{
    public Noble(int from, int to){
        super(new Random().nextInt(from+to+1)+from, new Random().nextInt(from+to+1)+from);
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getPower()-(new Random().nextInt(getPower())));
    }
}
