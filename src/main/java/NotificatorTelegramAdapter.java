public class NotificatorTelegramAdapter implements Notificator {
  private final Telegram telegram;

  public NotificatorTelegramAdapter(Telegram telegram) {
    this.telegram = telegram;
  }

  @Override
  public void send(String number, String message) {
    String subject = "System notification";

    telegram.sendMessage(number, subject);
  }
}
