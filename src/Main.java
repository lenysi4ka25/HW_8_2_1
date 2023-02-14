import java.util.*;

public class Main {
    static Set<Product> productFruits = new HashSet<>();
    static Set<Product> productVegetable = new HashSet<>();

    static Set<Product> product = new HashSet<>();
    static Map<Product, Integer> recipeSet = new HashMap();
        public static void main(String[] args) {

            List<Integer> numbers = new ArrayList<>(20);
            Random random = new Random();
            while (numbers.size() < 10) {
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

        Recipe fruitSalad = new Recipe("Фруктовый салат", Set.of(apple, banan), 250);
        Recipe vegetableSalad = new Recipe("Овощной салат", Set.of(cucumber, tomat), 200);


            addProduct(product, apple);
            addProduct(product,banan);
            addProduct(product,cucumber);
            addProduct(product,tomat);
            addProduct(productFruits, apple);
            addProduct(productFruits, banan);
            addProduct(productVegetable, tomat);
            addProduct(productVegetable, cucumber);
//            addRecipe(recipeSet, fruitSalad);
//            addRecipe(recipeSet, vegetableSalad);
            recipeSet.put(banan, 2);
            recipeSet.put(apple, 0);
            addCountProduct(recipeSet.put(banan, 0));


            for (Product product : product) {
                System.out.println(product);
            }

            for (Map.Entry<Product, Integer> productIntegerEntry : recipeSet.entrySet()) {
                System.out.println(productIntegerEntry);
            }
//            //for (Recipe recipe : recipeSet) {
//                System.out.println(recipe);
//            }
    }

    public static void addProduct (Set<Product> products, Product product){
        if(!products.add(product)){
            throw new IllegalArgumentException("Продукт уже есть!");
        }
        }

    public static void addRecipe(Set<Recipe> recipes, Recipe recipe) {
        if (!recipes.add(recipe)) {
            throw new IllegalArgumentException("Рецепт уже есть!");
        }
    }

    public static void addCountProduct(Integer productMap) {
        if (!productMap.intValue()) {
            throw new IllegalArgumentException("1");
        }
    }

    }
