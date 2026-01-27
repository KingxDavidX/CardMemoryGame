package Controller;

import Model.Card;
import Model.Difficulty;
import Model.Point;
import View.Console;

import java.io.IOException;
import java.util.*;

public class GameController {
    private Card[][] userView;
    private Card[][] solution;
    private int guesses = 0;

    public void run() {
        Difficulty[] difficulties = Difficulty.values();
        Difficulty difficulty = Console.getEnumValue("What difficulty would you like?", difficulties, false, Console.TextColor.DEFAULT, Console.TextColor.DEFAULT );
        initializeGame(difficulty);
        do {
            clearConsole();
            takeTurn();
        } while(!isWin());
        System.out.println("You win! You beat the game in '" + guesses + "' guesses !");
    }
    
    // sets up all game values
    private void initializeGame(Difficulty difficulty) {
        int width = 0;
        int height = 0;
        guesses = 0;
        switch (difficulty) {
            case EASY:
                width = 4;
                height = 2;
                break;
            case NORMAL:
                width = 6;
                height = 2;
                break;
            case HARD:
                width = 6;
                height = 3;
                break;
        }
        userView = new Card[height][width];
        solution = new Card[height][width];
        int total = (width * height) / 2;
        Set<Integer> cardsIdx = new HashSet<>();
        Random rand = new Random();

        while (cardsIdx.size() < total) {
            int randCard = rand.nextInt( 22);
            cardsIdx.add(randCard);
        }

        // create list to shuffle values before assigning on grid
        List<Integer> pool = new ArrayList<>();
        for (int val : cardsIdx ) {
            pool.add(val);
            pool.add(val);
        }
        // shuffle method from stack overflow
        Collections.shuffle(pool);
        // randomly convert and assign card values to answer grid
        int idx = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                solution[i][j] = Card.values()[pool.get(idx++)];
                userView[i][j] = Card.HIDDEN;
            }
        }
    }
    
    // lets player make two guesses, reverts user view if not a match
    private void takeTurn() {
        Point[] hand = new Point[2];
        printUserView();
        // take turn TWICE
        for (int i = 0; i < 2; i++) {
            int x;
            int y;
            while (true) {
                x = Console.getIntInput("Enter x index: ",0,solution.length -1 );
                y = Console.getIntInput("Enter y index: ",0,solution[0].length - 1);

                if (userView[x][y] != Card.HIDDEN) {
                    System.out.println("Cannot select already flipped card!");
                    continue;
                }
                break;
            }

            userView[x][y] = solution[x][y];
            printUserView();
            hand[i] = new Point(x, y);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // User guessed WRONG, revert cards
        if (userView[hand[0].x][hand[0].y] != userView[hand[1].x][hand[1].y]) {
            userView[hand[0].x][hand[0].y] = Card.HIDDEN;
            userView[hand[1].x][hand[1].y] = Card.HIDDEN;
        }
        guesses++;
    }
    
    private void printUserView() {
        int rows = solution.length;
        int columbs = solution[0].length;
        int cardHeight = 4;
        
        for (int r = 0; r < rows; r++) {
            // 2d card splitting suggested by ChatGPT
            String[][] split = new String[columbs][];
            for (int c = 0; c < columbs; c++) {
                split[c] = userView[r][c].toString().split("\n");
            }

            // print row by row
            for (int l = 0; l < cardHeight; l++) {
                for (int c = 0; c < columbs; c++) {
                    System.out.print(split[c][l]);
                }
                System.out.println();
            }
        }
    }

    private boolean isWin() {
        for (int i = 0; i < userView.length; i++) {
            for (int j = 0; j < userView[0].length; j++) {
                if (userView[i][j] != solution[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    private void clearConsole() {
        for (int i = 0; i < 1000; i++) {
            System.out.println();
        }
    }
}
