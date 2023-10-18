public class BottleOfMilk extends Product {
    /**
     * Объем бутылки с водой
     */
    private double volume;

    /**
     * Жирность молока
     */
    private double fat;

    public double getVolume() {
        return volume;
    }

    public double getFat() {
        return fat;
    }

    public BottleOfMilk(String name, String brand, double price, double volume, double fat) {
        super(name, brand, price);
        this.volume = volume;
        this.fat = fat;
    }

    @Override
    String displayInfo() {
        return String.format("[Бутылка с молоком]\n%s - %s - %.2f руб.  \nОбъем: %.1f л  \nЖирность: %.1f %%",
                brand, name, price, volume, fat);
    }

}
