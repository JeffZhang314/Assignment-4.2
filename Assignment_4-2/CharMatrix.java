/*
 * Implements a 2-D array of characters
 */

public class CharMatrix {
    // Fields:
    char[][] m;  // this is the grid

    /*
     * Constructor: creates a grid with dimensions rows, cols,
     * and fills it with spaces
     */
    public static void CharMatrix(int rows, int cols) {
        m = new char [rows] [cols];
        fillRect(0, 0, rows - 1, cols - 1, ' ');
    }

    /*
     * Constructor: creates a grid with dimensions rows , cols ,
     * and fills it with the fill  character
     */
    public static void CharMatrix(int rows, int cols, char fill) {
        m = new char [rows] [cols];
        fillRect(0, 0, rows - 1, cols - 1, fill);
    }

    /*
     * Returns the number of rows in grid
     */
    public static int numRows() {
        return m.length; //
    }

    /*
     * Returns the number of columns in grid
     */
    public static int numCols() {
        return m [0].length; //
    }

    /*
     * Returns the character at the indexes [row, col]
     */
    public static char charAt(int row, int col){
        return m [row] [col];
    }

    /*
     * Sets the character at index [row, col] to ch
     */
    public static void setCharAt(int row, int col, char ch) {
        m [row] [col] = ch;
    }

    /*
     * Returns true if the character at row, col is a SPACE,
     * false otherwise
     */
    public static boolean isEmpty(int row, int col) {
        return m [row] [col] == ' ';
    }

    /*
     * Fills the given rectangle with the fill characters.
     * row0, col0 is the upper left corner and row1, col1 is the
     * lower right corner of the rectangle.
     */
    public static void fillRect(int row0, int col0, int row1, int col1, char fill) {
        for (int r = row0; r <= row1; r ++) {
            for (int c = col0; c <= col1; c ++) {
                m [r] [c] = fill;
            }
        }
    }

    /*
     * Fills the given rectangle with the SPACE characters.
     * row0, col0 is the upper left corner and row1, col1 is the
     * lower right corner of the rectangle.
     */
    public static void clearRect(int row0, int col0, int row1, int col1) {
        fillRect(row0, col0, row1, col1, ' ');
    }

    /*
     * Returns the count of all non-SPACE characters in row.
     */
    public static int countInRow(int row) {
        int output = 0;
        for (int c = 0; c < numCols(); c ++) {
            if (charAt(row, c) != ' ') {
                output ++;
            }
        }
        return output;
    }

    /*
     * Returns the count of all non-SPACE characters in col.
     */
    public static int countInCol(int col) {
        int output = 0;
        for (int r = 0; r < numRows(); r ++) {
            if (charAt(r, col) != ' ') {
                output ++;
            }
        }
        return output;
    }

    /*
     * Displays the contents of the matrix m
     */
    public static void display () {
        for (int r = 0; r < m.length; r++) {
            for (int c = 0; c < m[0].length; c++) {
                System.out.print(m[r][c]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main (String[] args) {
        CharMatrix matrix = new CharMatrix(3, 4, 'm');

        //program in your test cases here. Invoke methods from the
        //object called matrix, like this:

        matrix.display();
    }

}





