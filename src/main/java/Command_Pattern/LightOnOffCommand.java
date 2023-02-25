
package Command_Pattern;


public class LightOnOffCommand implements Command {
    private final House house;
    
    public LightOnOffCommand(House house){
        this.house = house;
    }
    
    @Override
    public void execute() {
        house.setLightsOn(!house.LightsOn());
        System.out.println("Luces estan  " + (house.LightsOn() ? "on" : "off"));
    }
    
}
