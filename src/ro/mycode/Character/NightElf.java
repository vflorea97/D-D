package ro.mycode.Character;

import ro.mycode.Magic.Fire;
import ro.mycode.Magic.Water;
import ro.mycode.Magic.Wind;
import ro.mycode.Weapon.Bow;

public class NightElf extends Races {
    @Override
    public void display() {
        System.out.println("Im from NightElf race");
    }

    @Override
    public int healt() {
        return 400;
    }

    @Override
    public int armmor() {
        return 100;
    }

    @Override
    public int mana() {
        return 1500;
    }

    @Override
    public void move() {
        System.out.println("Move: Two steps diagonally");
    }

    public NightElf(){
        display();
        System.out.println("Healt: " + healt());
        System.out.println("Armmor: " + armmor());
        System.out.println("Mana: " + mana());
        move();
        weapon = new Bow();
        displayWeapons();
        magic = new Water();
        displayMagic();
        magic = new Wind();
        displayMagic();
    }
}
