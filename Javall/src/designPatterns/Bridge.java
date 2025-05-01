package designPatterns;
/*
The Bridge Design Pattern is a structural pattern that decouples an abstraction from its implementation, so that both can evolve independently.
It separates what is done (abstraction) from how it is done (implementation), using composition instead of inheritance.
You want to avoid a class explosion due to many combinations of abstractions and implementations.
You want to vary both abstraction and implementation independently.
 */
interface Device {
    void turnOn();
    void turnOff();
}
class TV implements Device {
    public void turnOn() {
        System.out.println("TV turned ON");
    }

    public void turnOff() {
        System.out.println("TV turned OFF");
    }
}

class Radio implements Device {
    public void turnOn() {
        System.out.println("Radio turned ON");
    }

    public void turnOff() {
        System.out.println("Radio turned OFF");
    }
}
abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    abstract void pressPowerButton();
}
class BasicRemote extends RemoteControl {
    private boolean isOn = false;

    public BasicRemote(Device device) {
        super(device);
    }

    public void pressPowerButton() {
        if (isOn) {
            device.turnOff();
            isOn = false;
        } else {
            device.turnOn();
            isOn = true;
        }
    }
}

public class Bridge {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl tvRemote = new BasicRemote(tv);

        tvRemote.pressPowerButton(); // TV turned ON
        tvRemote.pressPowerButton(); // TV turned OFF

        Device radio = new Radio();
        RemoteControl radioRemote = new BasicRemote(radio);

        radioRemote.pressPowerButton(); // Radio turned ON
    }
    /*
    A remote control (abstraction) can work with any device (implementation) like a TV or Radio. You can extend remotes or devices independently.
     */
}
