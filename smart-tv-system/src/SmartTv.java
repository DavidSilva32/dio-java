public class SmartTv {
    boolean status = false;
    int channel = 1;
    int volume = 25;

    public void turnOn() {
        status = true;
        System.out.println("New Status -> TV is on");
    }

    public void turnOff() {
        status = false;
        System.out.println("New Status -> TV is off");
    }

    public void volumeUp() {
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("Volume: " + volume);
    }

    public void changeChannel(int newChannel) {
        channel = newChannel;
        System.out.println("Current Channel: " + channel);
    }

    public void channelUp() {
        channel++;
        System.out.println("Current Channel: " + channel);
    }

    public void channelDown() {
        channel--;
        System.out.println("Current Channel: " + channel);
    }
}