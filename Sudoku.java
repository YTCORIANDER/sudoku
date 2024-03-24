/*
 * Author: Yuqi Tang 
 * ytang492
 */

//Represent a sudoku containing integers in a 2D array
public class Sudoku {
    private int size;
    private int[][] grid;

    //Initialize the instance variables size and grid
    public Sudoku (int[][] numbers){
        size = numbers.length;
        grid = numbers;
    }

    //Return size
    public int getSize(){
        return size;
    }

    //Return grid
    public int[][] getGrid(){
        return grid;
    }

    //Return the digit stored in the grid, otherwise return -1
    public int getDigitAt(int row, int col){
        if (row<0 || col<0 && row>=size-1 || col>=size-1){
            return -1;
        }
            return grid[row][col];
    }

    //If the row at index row in the sudoku is valid return true, otherwise return false
    public boolean isValidRow(int row){
        //Use k to check all digits only being once
        boolean[] k = new boolean[size+1];
        for(int i = 0; i<size; i++) {
            int value = grid[row][i];
                if (value<1 || value>size || k[value]){
                    return false;
                }
                //Check digitals repeated or not, if k[value] is true means word repeated 
                    k[value] = true;
        }
            if(row<0 && row>=size){
                return false;
            }
                return true;
    }

    //If the column at index col in the sudoku is valid return true, otherwise return false
    public boolean isValidCol(int col){
        //Use k to check all digits only being once
        boolean[] k = new boolean[size+1];
        for(int i = 0; i<size; i++) {
            int value = grid[i][col];
                if (value<1 || value>size || k[value]){
                    return false;
                }
                //Check digitals repeated or not, if k[value] is true means word repeated 
                    k[value] = true;
        }
            if(col<0 && col>=size){
                return false;
            }
                return true;
    }

    //If the 3x3 box whose top-left corner is at index row, col in the sudoku is valid return true, otherwise return false
    public boolean isValidBox(int row, int col){
        //Use k to check all digits only being once
        boolean[] k = new boolean[getSize()+1];
        for(int i = row; i<row+3; i++){
            for(int j = col; j<col+3; j++){
                int value = grid[i][j];
                if(value<1 || value>getSize() || k[value]){
                    return false;
                }   
                //Check digitals repeated or not, if k[value] is true means word repeated 
                    k[value] = true;
            }
        }
            if(row<0 || col<0 && col>getSize() || row>getSize()){
                return false;
            }
                return true;
    }

    //If every row and column and ensuring they are all true return true, otherwise return false
    public boolean isValidSolution(){
        boolean ValidSolution = true;
        boolean validbox = true;
        for(int i = 0; i<getSize(); i++){
            if(isValidRow(i)==false || !isValidCol(i)){
                ValidSolution = false;
            }
        }
        if(size==9){
            for(int x = 0; x<getSize(); x+=3){
                for(int y = 0; y<getSize(); y+=3){
                    if(isValidBox(x, y)==false){
                        validbox = false;
                    }
                }
            }
                return ValidSolution && validbox;
        }
            return ValidSolution;
    }   

    //If the 'this' sudoku is equal to the other Sudoku return true, otherwise return false
    public boolean equals(Sudoku other){
        if (this.size != other.size) {
            return false;
        }
        Sudoku[] result = new Sudoku[getSize()];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < this.getSize(); j++) {
                if (other.grid[i][j] != grid[i][j]){
                    return false;
                }
            }
        }
            return true;
    }

    //Return a string containing all the digits in the grid
	public String toString() {
		StringBuilder output = new StringBuilder();
		for(int i = 0; i < getSize(); i++) {
			for (int j = 0; j < getSize(); j++) {
				output.append(grid[i][j] + " ");
			}
                output.append("\n");
		}
		    return output.toString();
	}
}



