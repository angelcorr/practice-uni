public class NotificatorTelegramAdapter implements Notificator {
  private final Telegram telegram;

  public NotificatorTelegramAdapter(Telegram telegram) {
    this.telegram = telegram;
  }

}
