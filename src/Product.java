import java.util.Objects;

public class Product {

    private String productName;

    private int price;
    private int amount;

    public Product(String productName, int price, int amount) {
        this.productName = productName;
        this.price = price;
        this.amount = amount;

    }

    public Product(String productName) {
        this.productName = productName;
    }

    public static void checkPriceAndAmount(Product product) {
        if (product.price == 0 && product.amount == 0) {
            System.out.println("Заполните все поля!");
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && amount == product.amount && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, price, amount);
    }

    @Override
    public String toString() {
        return "Продукт - " +
                 productName +
                ", цена: " + price +
                " руб., вес: " + amount +
                " кг.";
    }
}