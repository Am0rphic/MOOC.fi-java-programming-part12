
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    // implement these three methods
    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> sumRows = new ArrayList<>();
        for (int[] i: square) {
            int sum = 0;
            for (int j: i) {
                sum+=j;
                System.out.println(j);
            }
            sumRows.add(sum);
        }
        return sumRows;
//        ArrayList<Integer> sumRows = new ArrayList<>();
//        int rows = square.length;
//        int columns = rows;
        
    }

    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> sumCols = new ArrayList<>();
        for (int test = 0; test<square.length; test++) {
            int sum = 0;
            for (int[] i: square) {
//                for (int j: i) {
                sum+=i[test];
//                }
            }
            sumCols.add(sum);
        }
        return sumCols;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> sumDiag = new ArrayList<>();
        int sum1=0;
        int sum2=0;
        for (int rows = 0; rows < square.length; rows++) {
            sum1+=square[rows][rows];
        }
        sumDiag.add(sum1);
        int i=0;
        for (int rows=0; rows<square.length; rows++) {            
        //    for (int cols=square.length-1; cols>=0; cols--) {
                sum2+=square[rows][square.length-1-rows];
         //       System.out.println("added number in diag 2 is"+sum2);
         //   }
        }
        sumDiag.add(sum2);
        System.out.println(sumDiag);
        return sumDiag;
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[x][y];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[x][y] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
