public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Is TV on ? " + smartTv.status);
        System.out.println("Current channel: " + smartTv.channel);
        System.out.println("Current channel: " + smartTv.volume);

        smartTv.turnOn();
        smartTv.turnOff();

        smartTv.volumeUp();
        smartTv.volumeDown();

        smartTv.channelUp();
        smartTv.channelDown();

        smartTv.changeChannel(30);
    }
}
