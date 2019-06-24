package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        this.board = buildBoard();
    }

    private String[][] buildBoard() {
        return new String[][]{{"","",""},{"","",""},{"","",""}};
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        return new String[]{board[0][value], board[1][value], board[2][value]};
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        return row[0].equals(row[1]) && row[1].equals(row[2]);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] col = getColumn(columnIndex);
        return col[0].equals(col[1]) && col[1].equals(col[2]);
    }

    public Boolean isDiagonalHomogeneous(String[] diagonal) {
        return diagonal[0].equals(diagonal[1]) && diagonal[1].equals(diagonal[2]);
    }

    public String getWinner() {
        String[] upToDown = {board[0][0], board[1][1], board[2][2]};
        String[] downToUp = {board[2][0], board[1][1], board[0][2]};
        if (isDiagonalHomogeneous(upToDown) && !upToDown[0].equals("")) return upToDown[0];
        if (isDiagonalHomogeneous(downToUp) && !downToUp[0].equals("")) return downToUp[0];
        for (int i = 0; i < 3; i++) {
            String[] row = getRow(i);
            String[] col = getColumn(i);
            if (isRowHomogenous(i) & !row[0].equals("")) return row[0];
            if (isColumnHomogeneous(i) & !col[0].equals("")) return col[0];
        }
        return "";
    }

    public String[][] getBoard() {
        return this.board;
    }
}
