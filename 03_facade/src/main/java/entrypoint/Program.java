package entrypoint;

import client.Patron;
import facade.Server;

import java.util.Optional;

public class Program {
    public static void main(String[] args) {
        var console = System.console();
        var server = new Server();

        var patronName = console.readLine("Hello! I'll be your server today. What is your name?");
        var patron = new Patron(Optional.of(patronName).orElse("Bob"));

        var appetizerId = Integer.parseInt(console.readLine("What appetizer would you like? (1-15)"));
        var entreeId = Integer.parseInt(console.readLine("What entree would you like? (1-20)"));
        var drinkId = Integer.parseInt(console.readLine("What drink would you like? (1-60)"));

        System.out.println("Thank you, " + patron.getName() + ". Your order will be ready shortly.");

        var order = server.placeOrder(patron, appetizerId, entreeId, drinkId);

        System.out.println(order.toString());

        console.readLine();

    }
}
