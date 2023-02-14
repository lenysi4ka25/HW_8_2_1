import java.util.*;

public class  Recipe {


    private String nameRecipe;                          //название рецепта
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
