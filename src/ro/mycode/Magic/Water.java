package ro.mycode.Magic;

public class Water implements Magic{
    @Override
    public void name() {
        System.out.println("Name: Waves");
    }

    @Override
    public void damage() {
        System.out.println("Damage: 100-200");
    }

    @Override
    public void cost() {
        System.out.println("Cost: 40 Mana");
    }
}
