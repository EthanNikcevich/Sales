class Sales // each object contains details of one sale
{
    private String itemId;
    private double value;
    private int quantity;
    // constructor missing
    public Sales(String itemId, double value, int quantity){
        this.itemId = itemId;
        this.value = value;
        this.quantity = quantity;
    }
    public double getValue() {
        return value;
    }
    public int getQuantity() {
        return quantity;
    }
}
