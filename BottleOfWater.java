public class BottleOfWater extends Product{
    /**
    * Объем бутылки с водой
    */
    private double volume;

    public double getVolume() {
        return volume;
    }

    public BottleOfWater(String name, String brand, double price, double volume) {
        super(name, brand, price);
        this.volume = volume;
    }

    @Override
    String displayInfo() {
        return String.format("[Бутылка с водой]\n%s - %s - %.2f руб.  \nОбъем: %.1f л",
                brand, name, price, volume);
    }
}
