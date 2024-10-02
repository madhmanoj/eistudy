package exercise2;

interface Command {
    void execute(Position position, Grid grid);
}

class MoveCommand implements Command {
    @Override
    public void execute(Position position, Grid grid) {
        if (grid.isValidMove(position)) {
            position.moveForward();
        } else {
            System.out.println("Obstacle detected, can't move!");
        }
    }
}

class TurnLeftCommand implements Command {
    @Override
    public void execute(Position position, Grid grid) {
        position.turnLeft();
    }
}

class TurnRightCommand implements Command {
    @Override
    public void execute(Position position, Grid grid) {
        position.turnRight();
    }
}
