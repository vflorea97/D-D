package ro.mycode.Character;

import ro.mycode.Magic.Magic;
import ro.mycode.Weapon.Weapon;

public abstract class Races {

    Magic magic;
    Weapon weapon;

    public abstract void display();

    public abstract int healt();
    public abstract int armmor();
    public abstract int mana();

    public abstract void move();

    public void displayMagic(){
        System.out.println("\nMagic: ");
        magic.name();
        magic.damage();
        magic.cost();
    }
    public void displayWeapons(){
        System.out.println("\nWeapons: ");
        weapon.name();
        weapon.damage();
        weapon.bonus();
    }

    public Magic getMagic() {
        return magic;
    }

    public void setMagic(Magic magic) {
        this.magic = magic;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
