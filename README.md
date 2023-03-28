# Game of life

Project implements Conway's Game of Life. The game simulates evolution of "cells" according to [Conway's guidelines](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life "Conway's Game of Life Wikipedia"). It is simple version run in command line that populates board randomly with set number of alive cells and shows next phases of game after pressing "Enter".

## Built with
- Java version 17

## Running

Go to **/game_of_life** directory and run:

```bash
javac Main.java
java Main
```
## Usage

In `Main.java` file basic game variables including number of simulations (numberOfSimulations), number of alive cells at the beginning of the simulation (numberOfCells) and length of side of a square game board (size) are declared. User can adjust these values to check different scenarios.
```java
int numberOfSimulations = 1000;
int numberOfCells = 500;
int size = 30;
```
