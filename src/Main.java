public class Main {
    public static void main(String[] args) {
        int ticketPrice = 200;
        int bonusMiles;
        int ostatok = ticketPrice % 20;

        if  (ostatok == 0) {
            bonusMiles = ticketPrice / 20;
            System.out.println("Вам начислено " + bonusMiles + " бонусных милей.");

        } else {
            System.out.println("Поставьте стоимость билета кратным 20");
        }


    }
}
