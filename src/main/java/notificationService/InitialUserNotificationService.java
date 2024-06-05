//TODO:  Refactor the Notification Service so that it can work with a variety of different types of notifiers,
// not just email. For example, it should be able to send notifications via SMS, Slack, etc.

package notificationService;

public class InitialUserNotificationService {
    private InitialEmailNotifier emailNotifier;

    public InitialUserNotificationService() {
        this.emailNotifier = new InitialEmailNotifier();
    }

    public void notifyUser(String message) {
        emailNotifier.send(message);
    }
}
