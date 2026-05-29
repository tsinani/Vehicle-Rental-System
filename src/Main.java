public class Main{
    public static void main(String[] args){
        //creating car object
        car c1 = new car("C101" , "Toyota" , "Corolla" , 2500,5);

        //creating bike object
        bike b1 = new bike("B101" , "Yamaha" , "R15" , 1200 , true);


        System.out.println("WELCOME TO VEHICLE RENTAL SYSTEM");

        //print car information
        System.out.println("-----------CAR INFORMATION-------------");

        System.out.println("Brand: " + c1.brand);
        System.out.println("Model: " + c1.model);
        System.out.println("Daily Rate: " + c1.dailyRate);
        System.out.println("Type: " + c1.getType());
        System.out.println("Seats: "+ c1.getnumberofSeats());


        //print bike information
        System.out.println("\n----- BIKE INFO -----");

        System.out.println("Brand: " + b1.brand);
        System.out.println("Model: " + b1.model);
        System.out.println("Daily Rate: " + b1.dailyRate);
        System.out.println("Bike Type: " + b1.getType());
        System.out.println("Has Cargo Box: " + b1.getHasCargoBox());
    }
}