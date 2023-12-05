public class RewardValue {

    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = convertMilesToCash(milesValue);
        } else {
            // Handle the case where isMiles is false (for example, set default values)
            this.milesValue = 0;
            this.cashValue = 0;
        }
    }

    // Getter method for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter method for miles value
    public double getMilesValue() {
        return milesValue / 0.0035;
    }

    // Convert cash to miles at a rate of 0.0035
    private double convertCashToMiles(double cashValue) {
        return cashValue * 0.0035;
    }

    // Convert miles to cash at a rate of 0.0035
    private double convertMilesToCash(double milesValue) {
        return milesValue / 0.0035;
    }
}
