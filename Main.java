public class Main {
    public static void main(String[] args) {
        // Create a Margherita pizza
        BasePizza margherita = new Margherita();
        System.out.println("Margherita Cost: " + margherita.cost());

        // Add Extra Cheese to Margherita
        BasePizza margheritaWithCheese = new ExtraCheese(margherita);
        System.out.println("Margherita with Extra Cheese Cost: " + margheritaWithCheese.cost());

        // Create a FarmHouse pizza with Extra Cheese and Mushroom
        BasePizza farmHouse = new FarmHouse();
        BasePizza farmHouseWithCheese = new ExtraCheese(farmHouse);
        BasePizza farmHouseWithCheeseAndMushroom = new Mushroom(farmHouseWithCheese);
        System.out.println("FarmHouse with Extra Cheese and Mushroom Cost: " + farmHouseWithCheeseAndMushroom.cost());
        
        // Let's chain it in one line
        BasePizza vegDelightUltimate = new Jalapeno(new Mushroom(new ExtraCheese(new VegDelight())));
        System.out.println("VegDelight with Extra Cheese, Mushroom, and Jalapeno Cost: " + vegDelightUltimate.cost());
    }
}
