package startbuzz;

public abstract class CaffeinBeverage {

    abstract void brew();

    abstract void addCondiments();

    void preparedRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected void boilWater() {
        System.out.println("물 끓이기");
    }

    protected void pourInCup() {
        System.out.println("붓는다.");
    }
}
