public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int bonusMiles = ticketPrice / 20;
        return bonusMiles;
    }
}