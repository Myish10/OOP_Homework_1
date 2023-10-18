public class Biscuit extends Product {
    /**
     * Вес пачки печенья
     */
    private int weight;

    /**
     * Калорийность в 100 граммах
     */
    private int calories;

    public int getWeight() {
        return weight;
    }

    public int getCalories() {
        return calories;
    }

    public Biscuit(String name, String brand, double price, int weight, int calories) {
        super(name, brand, price);
        this.weight = weight;
        this.calories = calories;
    }

    @Override
    String displayInfo() {
        return String.format("[Печенье]\n%s - %s - %.2f руб.\nВес: %d гр.\nКалорийность в 100гр.: %d Ккал",
                brand, name, price, weight, calories);
    }
}
