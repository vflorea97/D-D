package ro.mycode.Weapon;

public class Staff implements Weapon{
    @Override
    public void name() {
        System.out.println("Name: Lava Staff");
    }

    @Override
    public void damage() {
        System.out.println("Damage: 300-400");
    }

    @Override
    public void bonus() {
        System.out.println("Bonus: Leave a small ring of fire after 10 hit");
    }
}
