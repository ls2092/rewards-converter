public class RewardValue {
    private double cashValue;
    private double milesValue;
    private final double milesToCash =0.0035;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / milesToCash;

    }

    public RewardValue(double milesValue, boolean isMile){
        if (isMile){
            this.milesValue = milesValue;
            this.cashValue = milesValue * milesToCash;
        }
    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return milesValue;
    }
}
