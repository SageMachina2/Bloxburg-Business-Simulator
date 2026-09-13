public class BloxburgGame {
    public static void main(String[] args) {

        System.out.println("Welcome to Bloxburg Busines Simulator!");
        System.out.println();

        Business pizzaPlace = new Business("Pizza Palace", "Alex", 5000);
        Business burgerPlace = new Business("Blox Burger", "Nicholas Stewart", 4000);

        pizzaPlace.hireEmployee("Joe Bartolozzi", "Cashier", 13);
        pizzaPlace.hireEmployee("Case", "Cook", 15);

        burgerPlace.hireEmployee("Jeremy Elbertson", "Cashier", 12);
        burgerPlace.hireEmployee("Jeremy Webber", "Cook", 14);

        System.out.println(
            "Total businesses created: "
            + Business.getTotalBusinesses()
        );

        System.out.println();

        System.out.println("Business: " + pizzaPlace.getName());
        System.out.println("Owner: " + pizzaPlace.getOwner());

        System.out.println(
            "Funds before taxes: $"
            + pizzaPlace.getFunds()
        );
 
        pizzaPlace.payTaxes();

        System.out.println(
            "Funds after taxes: $"
            + pizzaPlace.getFunds()
        );

        System.out.println();

        pizzaPlace.displayEmployees();
    }
}
