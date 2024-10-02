package exercise2;

import java.util.ArrayList;
import java.util.List;

public class MarsRoverSimulation {
    public static void main(String[] args) {
        // Create a grid with dimensions 10x10
        Grid grid = new Grid(10, 10);
        grid.addObstacle(2, 2);
        grid.addObstacle(3, 5);

        // Initialize the rover with starting position and direction
        MarsRover rover = new MarsRover(0, 0, new North(), grid);

        // List of commands to execute
        List<Command> commands = new ArrayList<>();
        commands.add(new MoveCommand());
        commands.add(new MoveCommand());
        commands.add(new TurnRightCommand());
        commands.add(new MoveCommand());
        commands.add(new TurnLeftCommand());
        commands.add(new MoveCommand());

        // Execute the commands
        rover.executeCommands(commands);

        // Report the final position and status
        System.out.println(rover.reportStatus());
    }
}
