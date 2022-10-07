package ro.mycode.Magic;

public class Lightning implements Magic{
    @Override
    public void name() {
        System.out.println("Name: Thunderbolt");
    }

    @Override
    public void damage() {
        System.out.println("Damage: 150-300");
    }

    @Override
    public void cost() {
        System.out.println("Cost: 70 Mana");
    }
}
