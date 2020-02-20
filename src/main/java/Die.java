import java.util.Random;

class Die {

    private int sides;
    int value;
    private int[] probabilities;
    private Random random = new Random();


    // fair die
    Die(int sides) {
        this.sides = sides;
    }
    // weighted die
    Die(int sides, int[] probabilities){
        this.sides = sides;
        this.probabilities = probabilities;
    }
    void roll() throws Exception {
        // do the checking for throwing exceptions and potentially find the cumulative sum of expected values

        int sumProbabilities = 0;
        for (int P : this.probabilities) {
            sumProbabilities += P;
            if (P < 0) {
                throw new Exception("Negative Probabilities not allowed");
            }
            if (sumProbabilities < 1) {
                throw new Exception("Probability sum must be greater than 0");
            }
            if (sides < 1) {
                throw new IllegalArgumentException("Sides should be greater than 1");
            }

            value =  Math.abs(random.nextInt() % sumProbabilities +1);
            for (int i = 0; i < this.sides; i++) {
                value -= probabilities[i];
                if(value <= 0){
                    setProbabilityBasedValue(i + 1);
                    return;
                }
            }

        }
    }
    private void setProbabilityBasedValue(int number){
        this.value = number;
    }
}
