package ro.mycode.Character;

import ro.mycode.Magic.Fire;
import ro.mycode.Magic.Wind;
import ro.mycode.Weapon.Sword;

public class Human extends Races {

    @Override
    public void display() {
        System.out.println("Im from human race");
    }

    @Override
    public int healt() {
        return 1000;
    }

    @Override
    public int armmor() {
        return 400;
    }

    @Override
    public int mana() {
        return 800;
    }

    @Override
    public void move() {
        System.out.println("Move: One step ahead");
    }

    public Human (){
        display();
        System.out.println("Healt: " + healt());
        System.out.println("Armmor: " + armmor());
        System.out.println("Mana: " + mana());
        move();
        weapon = new Sword();
        displayWeapons();
        magic = new Fire();
        displayMagic();
        magic = new Wind();
        displayMagic();
    }
}
