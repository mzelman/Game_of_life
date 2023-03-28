public class Board {
    private Cell[][] board;

    public Board(int size) {
        board = new Cell[size + 2][size + 2];
        for (int i = 0; i < size + 2; i++) {
            for (int j = 0; j < size + 2; j++) {
                board[i][j] = new Cell();
            }
        }
    }

    public Cell getCell(int x, int y) {
        return board[x][y];
    }

}
