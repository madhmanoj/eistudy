package exercise2;

import java.util.ArrayList;
import java.util.List;

public class Grid {
    int width, height;
    List<int[]> obstacles = new ArrayList<>();

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addObstacle(int x, int y) {
        obstacles.add(new int[]{x, y});
    }

    public boolean isValidMove(Position position) {
        // Check if within bounds
        int newX = position.x;
        int newY = position.y;

        for (int[] obstacle : obstacles) {
            if (newX == obstacle[0] && newY == obstacle[1]) {
                return false; // Obstacle detected
            }
        }

        // Check if within bounds
        return newX >= 0 && newX < width && newY >= 0 && newY < height;
    }
}
