
package Command_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private final List<HouseRemote> houseRemotemenuItems = new ArrayList<>();
    public void addMenuItem(HouseRemote menuItem) {
        houseRemotemenuItems.add(menuItem);
    }

    public void print() {
        for (int i = 0; i < houseRemotemenuItems.size(); i++) {
            System.out.println((i + 1) + ". " + houseRemotemenuItems.get(i).getName());
        }
        System.out.print("Selection: ");    
    }

    public HouseRemote select(int selection) {
        return houseRemotemenuItems.get(selection - 1);
    }

}
