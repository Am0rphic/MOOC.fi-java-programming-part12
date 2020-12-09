
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
//        for (int i=0; i<7; i++) {
//            Random rand = new Random();
//            int gen = 1+rand.nextInt(40);
//            if (this.containsNumber(gen)) {
//                i--;
//            }   else {
//                numbers.add(gen);
//            }
//        }
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random rand = new Random();
        while (numbers.size()<7) {
            int gen = 1+rand.nextInt(40);
            if (!this.containsNumber(gen)) {
                numbers.add(gen);
            }
        }

    }

    public boolean containsNumber(int number) {
        if (numbers.contains(number)) {
            return true;
        }
        return false;
    }
}

