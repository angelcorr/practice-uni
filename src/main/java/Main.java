public class Main {
  public static void main(String[] args) {
    StoreFacade store = new StoreFacade();
    Rippling rippling = new Rippling();
    Payment ripplingPayment = new RipplingAdapter(rippling);
    store.makeAPurchase(ripplingPayment, 12);
  }


}
