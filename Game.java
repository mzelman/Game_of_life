public class Game {
    private Board gameBoard;
    private int size;

    public Game(int size) {
        this.size = size;
        this.gameBoard = new Board(size);
    }

    public void populateBoard(int numberOfCells) {
        int randomNum1 = random(size);
        int randomNum2 = random(size);
        for (int i = 0; i < numberOfCells; i++) {
            while (gameBoard.getCell(randomNum1, randomNum2).isAlive()) {
                randomNum1 = random(size);
                randomNum2 = random(size);
            }
            gameBoard.getCell(randomNum1, randomNum2).birth();
        }
    }

    public void countNeighbours() {
        for (int i = 1; i < size + 1; i++) {
            for (int j = 1; j < size + 1; j++) {
                int count = 0;
                if (gameBoard.getCell(i - 1, j - 1).isAlive()) {
                    count ++;
                }
                if (gameBoard.getCell(i - 1, j).isAlive()) {
                    count ++;
                }
                if (gameBoard.getCell(i - 1, j + 1).isAlive()) {
                    count ++;
                }
                if (gameBoard.getCell(i, j - 1).isAlive()) {
                    count ++;
                }
                if (gameBoard.getCell(i, j + 1).isAlive()) {
                    count ++;
                }
                if (gameBoard.getCell(i + 1, j - 1).isAlive()) {
                    count ++;
                }
                if (gameBoard.getCell(i + 1, j).isAlive()) {
                    count ++;
                }
                if (gameBoard.getCell(i + 1, j + 1).isAlive()) {
                    count ++;
                }
                gameBoard.getCell(i, j).setNumOfNeighbours(count);
            }
    }
}

public void updateBoard() {
    for (int i = 1; i < size + 1; i++) {
        for (int j = 1; j < size + 1; j++) {
            if (gameBoard.getCell(i, j).getNumOfNeighbours() == 3) {
                gameBoard.getCell(i, j).birth();
            }
            else if (gameBoard.getCell(i, j).isAlive() && (gameBoard.getCell(i, j).getNumOfNeighbours() < 2 || gameBoard.getCell(i, j).getNumOfNeighbours() > 3 )) {
                gameBoard.getCell(i, j).die();
            }
        }
    }
}

    static int random(int size) {
        return 1 + (int)(Math.random() * (size));
    } 

    @Override
    public String toString() {
        String temp = "";
        for (int i = 1; i < size + 1; i++) {
            for (int j = 1; j < size + 1; j++) {
                if (this.gameBoard.getCell(i, j) == null) {
                    continue;
                }
                else {
                temp += this.gameBoard.getCell(i, j).isAlive() ? "O " : "* "; 
                }
            }
            temp += "\n";
        }
        return temp;
    }

}
