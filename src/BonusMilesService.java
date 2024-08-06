public class BonusMilesService {

    public int calculate(int price) {
        int milesPerRuble = 20;
        return price / milesPerRuble;


    }
}
