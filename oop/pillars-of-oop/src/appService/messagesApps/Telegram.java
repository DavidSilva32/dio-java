package appService.messagesApps;
import appService.InstantMessagingService;

public class Telegram extends InstantMessagingService {
    @Override
    public void sendMessage() {
        validateConnectedInternt();
        System.out.println("Sending message for Telegram");
        saveMessageHistoric();
    }

    @Override
    public void receiveMessage() {
        System.out.println("Receiving message for Telegram");
    }
}
