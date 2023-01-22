import java.util.*;

public class  Recipe {


    public final String nameRecipe;                          //название рецепта
    public final Set<String> structure;                    //состав, множество продуктов

    public final int cost;                                  //общая стоимость продуктов используемых в рецепте


    public Recipe(String nameRecipe, Set<String> structure, int cost) {
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

    public Set<String> getStructure() {
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
        return /*cost == recipe.cost &&*/ Objects.equals(nameRecipe, recipe.nameRecipe) && Objects.equals(structure, recipe.structure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(/*super.hashCode(), */nameRecipe, structure /*, cost*/);
    }

    @Override
    public String toString() {
        return
                "Название рецепта: " +
                 nameRecipe +
                ", состав: " + structure +
                ", стоимость: " + cost +
                " руб."/* + super.toString()*/;
    }
}
