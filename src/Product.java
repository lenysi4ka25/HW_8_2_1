import java.util.Objects;

public class Product {

    private  String productName;

    private  int price;
    private int amount;

    private boolean checked;

    public Product(String productName, int price, int amount) {
        this.productName = productName;
        if (price == 0) {
            this.price = Integer.parseInt("Заполните все поля!");
        } else {
            this.price = price;
        }
        if (amount == 0) {
            this.amount = Integer.parseInt("Заполните все поля!");
        }else {
            this.amount = amount;
        }
        this.checked = false;
    }

//    public Product(String productName) {
//    }


    public void setChecked() {
        this.checked = true;
    }

    public boolean isChecked() {
        return checked;
    }

    public String getProductName() {
        return productName;
    }


    public int getPrice() {
        return price;
    }


    public int getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName);
    }

    @Override
    public String toString() {
        String checkedString = this.isChecked() ? "Да" : "Нет";
        return "Продукт - " +
                productName +
                ", цена: " + price +
                " руб., вес: " + amount +
                " кг.";
    }
}