
package Command_Pattern;


public class DoorCloseOpenCommand implements Command{
    private final House house;
    
    public DoorCloseOpenCommand(House house){
        this.house = house;
    }
    
    @Override
    public void execute() {
     house.setDoorOpen(!house.DoorOpen());
        System.out.println("La puerta esta" + (house.DoorOpen() ? "open" : "closed"));
    
    }
    
}
