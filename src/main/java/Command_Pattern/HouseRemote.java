
package Command_Pattern;


public class HouseRemote {

   private final String name;
    private final Command command;

    public HouseRemote(String name, Command command) {
        this.name = name;
        this.command = command;
    }

    public void execute() {
        command.execute();
    }

    public String getName() {
        return name;
    }
    
}
