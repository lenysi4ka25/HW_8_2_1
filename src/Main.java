import java.util.*;

public class Main {
        static Set<Product> product = new HashSet<>();
        public static void main(String[] args) {

            List<Integer> numbers = new ArrayList<>(20);
            Random random = new Random();
            while (numbers.size() < 20) {
                numbers.add(random.nextInt(4));
            }
            System.out.println(numbers);
            Iterator<Integer> numberIterator = numbers.iterator();
            while (numberIterator.hasNext()) {
                int number = numberIterator.next();{
                    if (number % 2 != 0) {
                        numberIterator.remove();
                    }
                }
                System.out.println(numbers);
            }

        Product banan = new Product("Бананы",70,5);
        Product apple = new Product("Яблоки", 90, 3);
        Product cucumber = new Product("Огрурцы", 209, 2);
        Product tomat = new Product("Томаты", 370, 1);
       // Recipe fruitSalad = new Recipe("Фруктовый салат", recipes.add(banan, apple, ), 200);
        Recipe fruitSalad1 = new Recipe("Фруктовый салат", Collections.singleton(apple), 200);
        Recipe vegetableSalad = new Recipe("Овощной салат", Collections.singleton(tomat), 250);
        Recipe vegetableSalad1 = new Recipe("Овощной салат", Collections.singleton(cucumber), 250);


            addProduct(product, apple);
            addProduct(product, banan);
            addProduct(product, tomat);
            addProduct(product, cucumber);
         //   addRecipe(recipes, fruitSalad);
            addRecipe(recipes, fruitSalad1);
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
