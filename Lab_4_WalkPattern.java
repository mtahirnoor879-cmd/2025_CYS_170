import java.util.Random;
public class Lab_4_WalkPattern {
    public static void main(String[] args) {
        int aliX = 0, aliY = 0;
        int hasanX = 0, hasanY = 0;
        char[] aliMoves = {'v', '^', '^', '>'};
        Random rand = new Random();
        System.out.println("Starting: Ali = (0 : 0), Hasan = (0 : 0)");
        for (char move : aliMoves) {
            if (move == 'v') aliY -= 1;
            else if (move == '^') aliY += 1;
            else if (move == '<') aliX -= 1;
            else if (move == '>') aliX += 1;
            boolean valid = false;
            while (!valid) {
                int dir = rand.nextInt(4);
                int newX = hasanX;
                int newY = hasanY;
                if (dir == 0) newX++;
                else if (dir == 1) newX--;
                else if (dir == 2) newY++;
                else newY--;
                if (newX != aliX || newY != aliY) {
                    hasanX = newX;
                    hasanY = newY;
                    valid = true;
                }
            }
            System.out.println("Ali moves " + move + " -> Ali = (" + aliX + " : " + aliY + ")");
            System.out.println("Hasan -> Hasan = (" + hasanX + " : " + hasanY + ")");
        }
    }
}
