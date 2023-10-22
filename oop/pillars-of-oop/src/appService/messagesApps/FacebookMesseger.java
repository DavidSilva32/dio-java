package appService.messagesApps;

import appService.InstantMessagingService;

public class FacebookMesseger extends InstantMessagingService {

    @Override
    public void sendMessage() {
        validateConnectedInternt();
        System.out.println("Sending message for Facebook");
        saveMessageHistoric();
    }

    @Override
    public void receiveMessage() {
        System.out.println("Receiving message for Facebook");
    }

}
