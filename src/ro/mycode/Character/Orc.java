package ro.mycode.Character;

import ro.mycode.Magic.Fire;
import ro.mycode.Magic.Water;
import ro.mycode.Magic.Wind;
import ro.mycode.Weapon.Staff;
import ro.mycode.Weapon.Sword;

public class Orc extends Races {
    @Override
    public void display() {
        System.out.println("Im from Orc race");
    }

    @Override
    public int healt() {
        return 1000;
    }

    @Override
    public int armmor() {
        return 1000;
    }

    @Override
    public int mana() {
        return 200;
    }

    @Override
    public void move() {
        System.out.println("Move: One step diagonally");
    }

    public Orc(){
        display();
        System.out.println("Healt: " + healt());
        System.out.println("Armmor: " + armmor());
        System.out.println("Mana: " + mana());
        move();
        weapon = new Staff();
        displayWeapons();
        weapon = new Sword();
        displayWeapons();
        magic = new Fire();
        displayMagic();
    }
}
