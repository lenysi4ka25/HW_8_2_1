import java.util.HashSet;
import java.util.Set;

public class Main {

    static Set<Product> product = new HashSet<>();
    public static void main(String[] args) {

        Product banan = new Product("Бананы", 70, 2);
        Product apple = new Product("Яблоки", 90, 3);
        Product cucumber = new Product("Огрурцы", 209, 2);
        Product tomat = new Product("Томаты");

        checkproductLists(product.add(banan));
        checkproductLists(product.add(apple));
        checkproductLists(product.add(cucumber));
        checkproductLists(product.add(tomat));
        Product.checkPriceAndAmount(banan);
        Product.checkPriceAndAmount(apple);
        Product.checkPriceAndAmount(cucumber);
        Product.checkPriceAndAmount(tomat);

        for (Product product :
                product) {

            System.out.println(product);
        }
    }

    public static void checkproductLists (boolean product){
            if (!product) {
                throw new IllegalArgumentException("Продукт уже есть!");
            }
        }
  }