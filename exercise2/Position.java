package exercise2;

public class Position {
    int x, y;
    Direction direction;

    public Position(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void moveForward() {
        direction.moveForward(this);
    }

    public void turnLeft() {
        direction.turnLeft(this);
    }

    public void turnRight() {
        direction.turnRight(this);
    }
}
