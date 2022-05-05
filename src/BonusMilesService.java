public class BonusMilesService {
    public int calculate(int cost) {
        int oneMileBonus = 20;
        int miles = cost / oneMileBonus;
        return miles;
    }
}
