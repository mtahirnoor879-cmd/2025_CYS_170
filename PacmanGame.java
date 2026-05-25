import java.util.*;

public class PacmanGame {
    public static void main(String[] args) {
        GameBoard board = new GameBoard(10, 20);
        Pacman pacman = new Pacman(1, 1);
        Ghost ghost = new Ghost(8, 18);
        Scanner sc = new Scanner(System.in);
        boolean gameRunning = true;
        while (gameRunning) {
            board.display(pacman, ghost);
            System.out.println("Score " + pacman.getScore());
            System.out.print("Move (W/A/S/D): ");
            char move = sc.next().toLowerCase().charAt(0);
            pacman.move(move, board);

            if (pacman.getX() == ghost.getX() && pacman.getY() == ghost.getY()) {
                System.out.println("GAME OVER YOU GOT CAUGHT");
                gameRunning = false;
            } else {
                if (board.hasFood(pacman.getX(), pacman.getY())) {
                    pacman.eatFood();
                    board.removeFood(pacman.getX(), pacman.getY());}
                }

            ghost.moveSmart(pacman, board);
            if (pacman.getX() == ghost.getX() && pacman.getY() == ghost.getY()) {
                System.out.println("GAME OVER YOU GOT CAUGHT");
                gameRunning = false;
            }
            if (board.allFoodEaten()) {
                System.out.println("YOU WIN! ALL FOOD EATEN");
                gameRunning = false;
            }
        }
        System.out.println("Final Score: " + pacman.getScore());
    }
}
class GameBoard {
    private Food[][] foodGrid;
    private boolean[][] walls;
    private int rows, cols;
    private int totalFood;
    private int eatenFood;

    public GameBoard(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        foodGrid = new Food[rows][cols];
        walls = new boolean[rows][cols];
        totalFood = 0;
        eatenFood = 0;
        initializeBoard();
    }
    private void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || j == 0 || i == rows - 1 || j == cols - 1) {
                    walls[i][j] = true;
                } else {
                    foodGrid[i][j] = new Food(i, j);
                    totalFood++;}
                }
            }}

    public void display(Pacman p, Ghost g) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == p.getX() && j == p.getY())
                    System.out.print("P");
                else if (i == g.getX() && j == g.getY())
                    System.out.print("G");
                else if (walls[i][j])
                    System.out.print('#');
                else if (foodGrid[i][j] != null && !foodGrid[i][j].isEaten())
                    System.out.print(".");
                else
                    System.out.print(" ");
            }
            System.out.println();}
        }

    public boolean isWall(int x, int y) {
        return walls[x][y];
    }

    public boolean hasFood(int x, int y) {
        return foodGrid[x][y] != null && !foodGrid[x][y].isEaten();
    }
    public void removeFood(int x, int y) {
        if (foodGrid[x][y] != null) {
            foodGrid[x][y].eat();
            eatenFood++;}
        }

    public boolean allFoodEaten() {
        return eatenFood >= totalFood;
    }
}
class Pacman {
    private int x, y;
    private int score;

    public Pacman(int x, int y) {
        this.x = x;
        this.y = y;
        this.score = 0;
    }

    public void move(char direction, GameBoard board) {
        int newx = x;
        int newy = y;

        switch (direction) {
            case 'w':
                newx--;
                break;
            case 's':
                newx++;
                break;
            case 'a':
                newy--;
                break;
            case 'd':
                newy++;
                break;
        }
        if (!board.isWall(newx, newy)) {
            x = newx;
            y = newy;
        }
    }
    public void eatFood() {
        score += 10;
    }
    public int getX() { return x; }
    public int getY() { return y; }
    public int getScore() { return score; }
}
class Ghost {
    private int x, y;

    public Ghost(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public void moveSmart(Pacman p, GameBoard board) {
        int[][] moves = {
                {x - 1, y},
                {x + 1, y},
                {x, y - 1},
                {x, y + 1}
        };
        double bestDist = Double.MAX_VALUE;
        int bestX = x;
        int bestY = y;
        for (int[] m : moves) {
            int nx = m[0];
            int ny = m[1];
            if (!board.isWall(nx, ny)) {
                double d = distance(nx, ny, p.getX(), p.getY());
                if (d < bestDist) {
                    bestDist = d;
                    bestX = nx;
                    bestY = ny;}
                }
            }
        x = bestX;
        y = bestY;
    }
    public int getX() { return x; }
    public int getY() { return y; }
}
class Food {
    int x, y;
    boolean eaten;
    Food(int x, int y) {
        this.x = x;
        this.y = y;
        this.eaten = false;
    }
    void eat() {
        eaten = true;
    }
    boolean isEaten() {
        return eaten;
    }
}