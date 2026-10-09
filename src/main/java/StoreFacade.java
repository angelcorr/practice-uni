public class StoreFacade {
  private Inventory inventory;

  public StoreFacade() {
    inventory = new Inventory();
  }

  public void makeAPurchase(Payment payment, double amount) {

    if (!inventory.verifyProduct()) {
      System.out.println("Not available product");
      return;
    }

    if (!payment.doPayment()) {
      System.out.println("Declined payment");
      return;
    }

    System.out.println("Starting a purchase");
    payment.doPayment();
    System.out.println("Purchase finished");
  }
}
