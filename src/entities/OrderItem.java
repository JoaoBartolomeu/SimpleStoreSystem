package entities;

public class OrderItem {
    private Double price;
    private int quantity;
    private Product product;

    public OrderItem() {}
    public OrderItem(Double price, int quantity, Product product) {
        this.price = price;
        this.quantity = quantity;
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal() {
        return this.quantity * price;
    }

    @Override
    public String toString() {
        return  product +
                ", quantity: " + quantity +
                ", subTotal: " + subTotal();
    }
}
