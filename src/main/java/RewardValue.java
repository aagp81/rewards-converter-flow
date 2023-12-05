public class RewardValue {

    private double cashValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        this.cashValue = convertMilesToCash(milesValue);
       
    }

    // Getter method for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter method for miles value
    public double getMilesValue() {
        return convertCashToMiles(this.cashValue);
    }

    // Convert cash to miles at a rate of 0.0035
    private int convertCashToMiles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }

    // Convert miles to cash at a rate of 0.0035
    private double convertMilesToCash(int milesValue) {
        return milesValue * 0.0035;
    }
}
