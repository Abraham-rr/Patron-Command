
package Command_Pattern;


public class House {
    private boolean lightsOn;
    private boolean doorOpen;

    public boolean LightsOn() {
        return lightsOn;
    }

    public boolean DoorOpen() {
        return doorOpen;
    }

    public void setLightsOn(boolean lightsOn) {
        this.lightsOn = lightsOn;
    }

    public void setDoorOpen(boolean doorOpen) {
        this.doorOpen = doorOpen;
    }
}
