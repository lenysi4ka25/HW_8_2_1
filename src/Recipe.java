import java.util.*;

public class  Recipe {


    public String nameRecipe;                          //название рецепта
    private Set<Product> structure;                    //состав, множество продуктов
    public int cost;                                  //общая стоимость продуктов используемых в рецепте

        public Recipe(String nameRecipe, Set<Product> structure, int cost) {
        if (nameRecipe == null || structure.size() == 0) {
            throw new IllegalArgumentException("Заполните все поля!");
        }
        this.nameRecipe = nameRecipe;
        this.structure = structure;
        this.cost = cost;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public Set<Product> getStructure() {
        return structure;
    }

//    private void setStructure(Set<Product> structure) {
  //      this.structure = structure;
   // }

    public int getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Recipe recipe = (Recipe) o;
        return  Objects.equals(nameRecipe, recipe.nameRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipe);
    }

//    private Set<Product> pattern(Product... products) {
//       HashSet <Product> set = (HashSet<Product>) this.getStructure();
//       set.addAll(Arrays.asList(products));
//       setStructure(set);
//                return structure;
//    }

    @Override
    public String toString() {
        return
                "Название рецепта: " +
                 nameRecipe +
                ", состав: " + structure +
                ", стоимость: " + cost +
                " руб.";
    }
}
