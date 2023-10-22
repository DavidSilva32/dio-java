package appService;
public abstract class InstantMessagingService {
    public abstract void sendMessage();
    public abstract void receiveMessage();

    protected void saveMessageHistoric() {
        System.out.println("Saving the message historic");
    }

    protected void validateConnectedInternt() {
        System.out.println("Validating if be connected internet");
    }
}
