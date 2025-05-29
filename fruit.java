/*
Multi-line comment: This class Fruit holds data about fruits(name, price, quantity)
*/

/*
@author: Ashley Liang
*/
public class Fruit {
    
    private String name; // Name of the fruit
    private double price; // Price per fruit
    private int quantity; // Quantity of the fruit available
    
    
    public Fruit(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

     // Prints the details of the fruit (name, price, and quantity).
    public void printFruitDetails() {
        System.out.println("Fruit: " + name);
        System.out.println("Price per unit: $" + price);
        System.out.println("Quantity: " + quantity);
    }
 
    public static void main(String[] args) {
        // Create an array of Fruit objects
        Fruit[] fruits = {
            new Fruit("Apple", 2.0, 10),
            new Fruit("Banana", 1.5, 20),
        };

        // Loop through the array and print details of each fruit
        for (Fruit fruit : fruits) {
            fruit.printFruitDetails();
        }
    }
}

//new edit
