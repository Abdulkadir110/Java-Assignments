public class transactionLog {
    private double[] deposits = new double[50];
    private double[] withdrawals = new double[50];
    private String[] transactionHistory = new String[50];
    private int depositIndex = 0;
    private int historyIndex = 0;
    private int withdrawalsIndex = 0;
    
    public double checkBalance() {
        double cummulativeDeposits = 0.0;
        double cummulativeWithdrawals = 0.0;
        for(int index = 0; index < deposits.length; index++){
            cummulativeDeposits += deposits[index];
        }
        for(int index = 0; index < withdrawals.length; index++){
            cummulativeWithdrawals += withdrawals[index];
        }
        double balance = cummulativeDeposits + cummulativeWithdrawals;
        
        return balance;
    }
    public void depositInto(double amount){
        if (amount > 0.0){
            this.deposits[depositIndex] += amount;
            depositIndex++;
            this.transactionHistory[historyIndex] = "deposited: " + amount;
            historyIndex++;
        }
    }
    public void withdrawFrom(double amount){
        if(amount > 0.0 && amount <= checkBalance()) {
            double newAmount = amount * -1;
            this.withdrawals[withdrawalsIndex] += newAmount;
            withdrawalsIndex++;
            this.transactionHistory[historyIndex] = "Withdrew: " + amount;
            historyIndex++;
        }
    }
    public double findTheLargestDepositIn(){
        double largest = deposits[0];
        for(int index = 1; index < deposits.length; index++){
            if(deposits[index] > largest) {
                largest = deposits[index];
            }
        }
        return largest;
    }
    public double findTheLargestWithdrawalIn(){
        double largest = withdrawals[0];
        for(int index = 1; index < deposits.length; index++){
            if(deposits[index] < largest) {
                largest = deposits[index];
            }
        }
        return largest * -1;
    }
    public String[] showTransactionHistory(){
    
        return transactionHistory;
    }
    
      
    
    
}
