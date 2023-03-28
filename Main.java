import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfSimulations = 1000;
        int numberOfCells = 500;
        int size = 30;
        Game game = new Game(size);
        game.populateBoard(numberOfCells);
        System.out.println(game);

        for (int i = 0; i < numberOfSimulations; i++) {
            System.out.println("Press enter to continue.");
            scan.nextLine();
            game.countNeighbours();
            game.updateBoard();
            System.out.println(game);
        }

    }
}
