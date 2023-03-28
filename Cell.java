public class Cell {
    private boolean alive;
    private int numOfNeighbours;

    public Cell() {
        this.alive = false;
        this.numOfNeighbours = 0;
    }

    public Cell(Cell source) {
        this.alive = source.alive;
        this.numOfNeighbours = source.numOfNeighbours;
    }

    public int getNumOfNeighbours() {
        return this.numOfNeighbours;
    }

    public void setNumOfNeighbours(int number) {
        this.numOfNeighbours = number;
    }

    public boolean isAlive() {
        return this.alive;
    }

    public void birth() {
        this.alive = true;
    }

    public void die() {
        this.alive = false;
    }

}