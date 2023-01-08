import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("Первая домашка восьмого урока второго курса - готова)");

        Product banan = new Product("Бананы");
        Product apple = new Product("Яблоки");
        Product cucumber = new Product("Огрурцы");
        Product tomat = new Product("Томаты");

        Set<String> productLists = new HashSet<>();
        productLists.add("Бананы");
        productLists.add("Яблоки");
        productLists.add("Огурцы");
        productLists.add("Томаты");
        productLists.add("Томаты");
        for (String productList :
                productLists) {

            System.out.println(productList);
        }
    }
}