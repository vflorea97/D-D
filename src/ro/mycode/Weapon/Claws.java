package ro.mycode.Weapon;

public class Claws implements Weapon{
    @Override
    public void name() {
        System.out.println("Name: Natural Claws");
    }

    @Override
    public void damage() {
        System.out.println("Damage: 50-80");
    }

    @Override
    public void bonus() {
        System.out.println("Bonus: Lifesteal 1% per hit");
    }
}
