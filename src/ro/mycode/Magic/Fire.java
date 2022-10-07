package ro.mycode.Magic;

public class Fire implements Magic{
    @Override
    public void name() {
        System.out.println("Name: Fire Ball");
    }

    @Override
    public void damage() {
        System.out.println("Damage: 70-150");
    }

    @Override
    public void cost(){
        System.out.println("Cost: 30 Mana");
    }
}
