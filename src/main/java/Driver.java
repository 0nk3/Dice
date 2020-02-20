public class Driver {
    public static void main(String[] args) throws Exception {

//        Die die6 = new Die(6, new int[]{1, 1, 1, 1, 1, 2});
//        die6.roll();
//        System.out.println(die6.value);

        Die dieDodgy6 = new Die(6,new int[]{1, 1, 1, 1, 1, 2});
        dieDodgy6.roll();
        System.out.println(dieDodgy6.value);

    }
}
