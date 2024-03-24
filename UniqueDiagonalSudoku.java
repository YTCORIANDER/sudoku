public class UniqueDiagonalSudoku extends Sudoku {
    //Call the Sudoku constructo
    public UniqueDiagonalSudoku(int[][] numbers){
        super(numbers);
    }

    //To check two diagonals and isValidSolution are vaild in the sudoka return true, otherwise return false
    public boolean isValidSolution(){
        boolean isValidSolution1 = super.isValidSolution();
        boolean q = true;
        boolean[] k = new boolean[getSize()+1];
        boolean[] k2 = new boolean[getSize()+1];
        for(int i = 0; i<getSize(); i++) {
            int value = getGrid()[i][i];
            if (value<1 || value>getSize() || k[value] || !isValidSolution1){
                return false;
            }
            //Check digitals repeated or not, if k[value] is true means word repeated 
                k[value] = q;
        }

        if (getSize()<9){
            for(int j = 0; j<getSize(); j++) {
                int value = getGrid()[j][getSize()-j-1];
                if (value<1 || value>getSize() || k2[value - 1] || !isValidSolution1){
                    return false;
                }
                //Check digitals repeated or not, if k[value - 1] is true means word repeated 
                    k2[value - 1] = q;
            }
                return q && isValidSolution1;
        }
            return q;
    }
}
