package appService.messagesApps;
import appService.InstantMessagingService;

public class MSNMesseger extends InstantMessagingService {
    @Override
    public void sendMessage() {
        validateConnectedInternt();
        System.out.println("Sending message for MSN");
        saveMessageHistoric();
    }

    @Override
    public void receiveMessage() {
        System.out.println("Receiving message for MSN");
    }
}
