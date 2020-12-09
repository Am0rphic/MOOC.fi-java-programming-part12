
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        int cR=0;
        int cC=square.getWidth()/2;
        
        square.placeValue(cR, cC, 1);
        int maxSteps = size*size;
        int i=2;
        while (i<=size*size) {
//            int startR=cR;
//            int startC=cC;
                   
            
            cR=moveUp(cR, size);
            cC=moveRight(cC, size);
            
   
            if (square.readValue(cR, cC)>0) {
                cR=moveDown(cR,size);
                cC=moveLeft(cC,size);
                cR=moveDown(cR,size);
            }
            System.out.println("iteration"+i+"   "+cR+" "+cC);            
            if (square.readValue(cR, cC)==0) {
                square.placeValue(cR, cC, i);
                i++;
                continue;
            } 

        }

        return square;
    }
    
    //int row, int size used below because not sure if testing allows for variable declaration in MSF class?
    public int moveUp(int row, int size) {
        row--;
        if (row<0) {
            row=size-1;
        }
        return row;
    }
    public int moveRight(int col, int size) {
        col++;
        if (col>size-1) {
            col=0;
        }
        return col;
    }
    public int moveLeft(int col, int size) {
        col--;
        if (col<0) {
            col=size-1;
        }
        return col;
    }
    public int moveDown(int row, int size) {
        row++;
        if (row>size-1) {
            row=0;
        }
        return row;
    }
    
}
