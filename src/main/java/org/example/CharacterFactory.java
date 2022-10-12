package org.example;
import org.reflections.Reflections;

import java.util.Random;

import java.util.Set;

public class CharacterFactory {
//    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
//        System.out.println(createCharacter());
//    }
    public static Character createCharacter() throws InstantiationException, IllegalAccessException {
        Reflections reflections = new Reflections("org.example");
        Set<Class<? extends Character>> allClasses = reflections.getSubTypesOf(Character.class);
        allClasses.remove(Noble.class);
//        System.out.println(allClasses);
        Random rand = new Random();
        return allClasses.stream().skip(rand.nextInt(allClasses.size())).findFirst().orElse(null).newInstance();
    }
}
