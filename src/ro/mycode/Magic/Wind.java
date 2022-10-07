package ro.mycode.Magic;

public class Wind implements Magic{
    @Override
    public void name() {
        System.out.println("Name: Wind Blades");
    }

    @Override
    public void damage() {
        System.out.println("Damage: 100-150");
    }

    @Override
    public void cost() {
        System.out.println("Cost: 40 Mana");
    }
}
