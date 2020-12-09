
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        MagicSquare a= new MagicSquare(2);
        a.placeValue(0, 0, 1);
        a.placeValue(0,1,2);
        a.placeValue(1,0,3);
        a.placeValue(1,1,4);
        System.out.println(a);
        a.sumsOfRows();
        a.sumsOfDiagonals();
        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(3));

    }
}
