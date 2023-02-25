
package Command_Pattern;

import java.util.Scanner;


public class Main {
   public static void main(String[] args){
        int num=0;
        House house = new House();
        
        Command LightOnOffCommand  = new LightOnOffCommand(house);
        Command DoorCloseOpenCommand = new DoorCloseOpenCommand(house);
        
        
        HouseRemote toggleLightsMenuItem = new HouseRemote("Light", LightOnOffCommand);
        HouseRemote toggleDoorMenuItem = new HouseRemote("Door",DoorCloseOpenCommand);
        
        Menu menu = new Menu();
        menu.addMenuItem(toggleLightsMenuItem);
        menu.addMenuItem(toggleDoorMenuItem);
     
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            menu.print();
            int selection = scanner.nextInt();
            menu.select(selection).execute();
        }
  
    }
}

