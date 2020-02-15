import java.util.Random;

public class Die {
    public static void main(String[] args) {
        Die die6 = new Die(6);
        die6.roll();
        System.out.println(die6.value);

    }
    private int sides;
    private int value;

    public Die(int sides) {
        this.sides = sides;
    }
    public void setSides(int sides) {
        if(sides > 1){
            this.sides = sides;
        }else {
            throw new IllegalArgumentException("Sides should be greater than 1");
        }
    }

    public int roll(){
        Random random = new Random();
        value = Math.abs(random.nextInt()%sides) + 1;
        return value;
    }
}
