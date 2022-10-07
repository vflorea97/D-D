package ro.mycode.Character;

import ro.mycode.Magic.Fire;
import ro.mycode.Magic.Lightning;
import ro.mycode.Magic.Water;
import ro.mycode.Magic.Wind;
import ro.mycode.Weapon.Claws;

public class Undead extends Races {
    @Override
    public void display() {
        System.out.println("Im from Undead race");
    }

    @Override
    public int healt() {
        return 2000;
    }

    @Override
    public int armmor() {
        return 0;
    }

    @Override
    public int mana() {
        return 500;
    }

    @Override
    public void move() {
        System.out.println("Move: Two steps ahead");
    }

    public Undead(){
        display();
        System.out.println("Healt: " + healt());
        System.out.println("Armmor: " + armmor());
        System.out.println("Mana: " + mana());
        move();
        weapon = new Claws();
        displayWeapons();
        magic = new Lightning();
        displayMagic();
        magic = new Fire();
        displayMagic();
    }
}
