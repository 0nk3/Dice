public class DieFactory {
    public static Dice makeDie(int sides){
        if(sides == Dice.die6){
            return new Die6(6);
        }else if(sides == Dice.die20){
            return new Die20(20);
        }
        return null;
    }
}
