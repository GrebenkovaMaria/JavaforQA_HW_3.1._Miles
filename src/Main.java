public class Main {
    public static void main(String[] args) {
        int ticketPrice = 20_99; //with penny
        int milePrice = 20;
        int totalMiles = ticketPrice / 100 / milePrice;
        System.out.println(totalMiles);
    }
}
