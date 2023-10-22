import appService.InstantMessagingService;
import appService.messagesApps.FacebookMesseger;
import appService.messagesApps.MSNMesseger;
import appService.messagesApps.Telegram;

public class JohnComputer {
    public static void main(String[] args) {
        InstantMessagingService ims = null;

        String appChoiced = "telegram";

        if (appChoiced.equals("msn")) {
            ims = new MSNMesseger();
        } else if (appChoiced.equals("facebook")) {
            ims = new FacebookMesseger();
        } else if (appChoiced.equals("telegram")) {
            ims = new Telegram();
        }

        ims.sendMessage();
        ims.receiveMessage();
    }
}
