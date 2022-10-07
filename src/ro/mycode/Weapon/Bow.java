package ro.mycode.Weapon;

public class Bow implements Weapon{


    @Override
    public void name() {
        System.out.println("Name: Blue Light Bow");
    }

    @Override
    public void damage() {
        System.out.println("Damage: 200-250");
    }

    @Override
    public void bonus() {
        System.out.println("Bonus: Critic change +5%");
    }
}
