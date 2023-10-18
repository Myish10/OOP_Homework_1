import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
//        product1.name = "Продукт №1";
//        product1.brand = "Производитель №1";
//        product1.price = 200;
        System.out.println(product1.displayInfo());

        Product product2 = new Product();
        System.out.println(product2.displayInfo());

        Product product3 = new Product("Продукт №3", "Производитель №3", 150);
        System.out.println(product3.displayInfo());

        Product product4 = new Product("Продукт №4", "Производитель №4", 400);
        product4.setBrand("1");
        System.out.println(product4.displayInfo());
        System.out.println();

        BottleOfWater bottleOfWater1 =
                new BottleOfWater("Вода1", "ООО Источник", 220, 2.0);
        BottleOfWater bottleOfWater2 =
                new BottleOfWater("Вода2", "ООО Источник", 130, 1.5);
        System.out.println(bottleOfWater1.displayInfo());
        System.out.println();

        BottleOfMilk bottleOfMilk1 =
                new BottleOfMilk("Молоко1", "ООО Буренка", 108, 1.5, 2.5);
        BottleOfMilk bottleOfMilk2 =
                new BottleOfMilk("Молоко2", "ООО Буренка", 190, 1.0, 3.2);
        System.out.println(bottleOfMilk1.displayInfo());
        System.out.println();

        Biscuit biscuit1 =
                new Biscuit("Шоколадное", "ООО Фабрика Печенья", 350, 110, 505);
        Biscuit biscuit2 =
                new Biscuit("Юбилейное", "ООО Фабрика Печенья", 270, 80, 490);
        Biscuit biscuit3 =
                new Biscuit("Утреннее", "ООО Фабрика Печенья", 430, 250, 485);
        System.out.println(biscuit1.displayInfo());
        System.out.println();

        ArrayList<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(biscuit1);
        products.add(biscuit2);
        products.add(biscuit3);

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk("Молоко1", 1.5);
        if (bottleOfMilk == null) {
            System.out.println("Такой бутылки с молоком в автомате нет!");
        }
        else {
            System.out.println("Вы купили: ");
            System.out.println(bottleOfMilk.displayInfo());
        }
        System.out.println();

        Biscuit biscuit = vendingMachine.getBiscuit("Юбилейное", 80);
        if (biscuit == null) {
            System.out.println("Такого печенья в автомате нет");
        }
        else {
            System.out.println("Вы купили: ");
            System.out.println(biscuit.displayInfo());
        }

    }
}