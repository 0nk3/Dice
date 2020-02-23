public class DieDriver {
    public static void main(String[] args) throws Exception {
//        Die die6 = new Die(6);
//        die6.roll();
//
//        Die die20 = new Die(20);
//        die20.roll();
//
//        System.out.println(die6.value);
//        System.out.println(die20.value);

        // part 2 loaded die
        System.out.println("======= > Loaded Die < ===========");
        Die dieDodgy6 = new Die(6, new int[]{1,1,1,1,1,2});
        dieDodgy6.roll();
        System.out.println(dieDodgy6.value);

        Dice die20 = DieFactory.makeDie(20);
        Dice anotherDie20 = DieFactory.makeDie(20);
    }
}
