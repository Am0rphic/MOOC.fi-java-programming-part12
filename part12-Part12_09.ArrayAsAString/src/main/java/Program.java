
public class Program {

    public static void main(String[] args) {
        int[][] matrix = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };

        System.out.println(arrayAsString(matrix));
    }
    public static String arrayAsString(int[][] array) {
        StringBuilder strings = new StringBuilder();
        String arrays ="";
        for (int[] i:array) {
            for (int j: i) {
                strings.append(j);
            }
            arrays+=strings+"\n";
            strings.delete(0, array.length+1);
        }
        return arrays;
    }
}
