import java.util.*;

public class Main {
        static Set<Product> product = new HashSet<>();
        public static void main(String[] args) {

        Product banan = new Product("Бананы",70,5);
        Product apple = new Product("Яблоки", 90, 3);
        Product cucumber = new Product("Огрурцы", 209, 2);
        Product tomat = new Product("Томаты", 370, 1);
        Recipe fruitSalad = new Recipe("Фруктовый салат", Collections.singleton("яблоки и бананы"), 200);
        Recipe vegetableSalad = new Recipe("Овощной салат", Collections.singleton("томаты и огурцы"), 250);
        Recipe vegetableSalad1 = new Recipe("Овощной салат", Collections.singleton("томаты и огурцы"), 250);


//        Set<Recipe> recipes = new HashSet<>();
//        recipes.add(fruitSalad);
//        recipes.add(vegetableSalad);


            addProduct(product, apple);
            addProduct(product, banan);
            addProduct(product, tomat);
            addProduct(product, cucumber);
            addRecipe(recipes, fruitSalad);
            addRecipe(recipes, vegetableSalad);
            addRecipe(recipes, vegetableSalad1);


        for (Product product : product) {

            System.out.println(product);

        }

            for (Recipe recipe : recipes) {
                System.out.println(recipe);

            }
    }


    public static void addProduct (Set<Product> products, Product product){
        if(!products.add(product)){
            throw new IllegalArgumentException("Продукт уже есть!");
        }
        }
    private static final Set<Recipe> recipes = new HashSet<>();

    public static void addRecipe(Set<Recipe> recipes, Recipe recipe) {
        if (Main.recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже есть");
        } else {
            Main.recipes.add(recipe);
        }
    }
   }