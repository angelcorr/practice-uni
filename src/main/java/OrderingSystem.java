public class OrderingSystem {
  private final Notificator notificator;

  public OrderingSystem(Notificator notificator) {
    this.notificator = notificator;
  }

  public void sendOrder(String client, String message) {
    System.out.println("Sending notification");
    notificator.send(client, message);
    System.out.println("Processed notification");
  }
}
