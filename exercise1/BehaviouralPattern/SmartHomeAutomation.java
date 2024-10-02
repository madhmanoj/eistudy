// Command interface
interface Command {
    void execute();
}

// Receiver classes
class Light {
    public void turnOn() {
        System.out.println("Light is turned on");
    }
    
    public void turnOff() {
        System.out.println("Light is turned off");
    }
}

class Fan {
    public void turnOn() {
        System.out.println("Fan is turned on");
    }
    
    public void turnOff() {
        System.out.println("Fan is turned off");
    }
}

// Concrete command classes
class LightCommand implements Command {
    private Light light;
    
    public LightCommand(Light light) {
        this.light = light;
    }
    
    public void execute() {
        light.turnOn();
    }
}

class FanCommand implements Command {
    private Fan fan;
    
    public FanCommand(Fan fan) {
        this.fan = fan;
    }
    
    public void execute() {
        fan.turnOn();
    }
}

// Invoker
class RemoteControl {
    private Command command;
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void pressButton() {
        if (command != null) {
            command.execute();
        }
    }
}

// Client code
public class SmartHomeAutomation {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();
        
        Command lightCommand = new LightCommand(light);
        Command fanCommand = new FanCommand(fan);
        
        RemoteControl remote = new RemoteControl();
        
        // Control the light
        remote.setCommand(lightCommand);
        remote.pressButton();  // Output: Light is turned on
        
        // Control the fan
        remote.setCommand(fanCommand);
        remote.pressButton();  // Output: Fan is turned on
    }
}
