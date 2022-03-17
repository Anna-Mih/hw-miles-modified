public class Main {
    public static void main(String[] args) {
        int ticketPrice = 200;
        int bonusRub = 20;
        int bonusMiles;

        if (ticketPrice >= 0) {

            if (ticketPrice % bonusRub == 0) {
                bonusMiles = ticketPrice / bonusRub;
                System.out.println("Вам начислено " + bonusMiles + " бонусных милей.");

            } else {
                System.out.println("Поставьте стоимость билета кратным " + bonusRub);
            }
        } else {
            System.out.println("Введите стоимость билета больше 0");
        }

    }
}
