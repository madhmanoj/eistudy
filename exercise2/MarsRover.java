package exercise2;

import java.util.List;

public class MarsRover {
    Position position;
    Grid grid;

    public MarsRover(int x, int y, Direction direction, Grid grid) {
        this.position = new Position(x, y, direction);
        this.grid = grid;
    }

    public void executeCommands(List<Command> commands) {
        for (Command command : commands) {
            command.execute(position, grid);
        }
    }

    public String reportStatus() {
        return "Rover is at (" + position.x + ", " + position.y + ") facing " + position.direction + ".";
    }
}
