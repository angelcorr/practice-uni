public class RipplingAdapter implements Payment {
  private Rippling rippling;

  public RipplingAdapter(Rippling rippling) {
    this.rippling = rippling;
  }

  @Override
  public boolean doPayment() {
    rippling.payWithRippling();
  }
}
