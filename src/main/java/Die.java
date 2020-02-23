import java.util.Random;

class Die {
    private int sides;
    private int[] probabilities = new int[sides];
    int value ;
    // fair die
    Die(int sides) {
        this.sides = sides;
    }
    // loaded die
    Die(int sides, int[] probabilities) {
        this.probabilities = probabilities;
        this.sides = sides;
    }

    void roll() throws Exception{
        // declare and initialise a variable to compute the cumulative sum of probabilities
        int sumProbabilities = 0;

        for (int probability: probabilities) {
            // check the 3 possible exceptions defined
            sumProbabilities += probability;
            if(probability < 0){
                throw new Exception("Negative probabilities not allowed");
            }
            if(sumProbabilities < 1){
                throw new Exception("Probability sum must be greater than 0");
            }
            if(sides < 1){
                throw new IllegalArgumentException("Sides should be greater than 1");
            }

        }
        Random random = new Random();
        value = random.nextInt(sumProbabilities) + 1;
        // generating numbers with a built in statistical bias
        int index = 0;
        for (int p: probabilities) {
            value -= p;
            if(value <= 0){
                setProbabilities(++index);
            }
        }
    }
    private void setProbabilities(int initialValue){
        value = initialValue;
    }

}
