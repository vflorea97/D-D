package ro.mycode.Weapon;

public class Sword implements Weapon{
    @Override
    public void name() {
        System.out.println("Name: Common Sword");
    }

    @Override
    public void damage() {
        System.out.println("Damage: 15-45");
    }

    @Override
    public void bonus() {
        System.out.println("Bonus: -");
    }
}
