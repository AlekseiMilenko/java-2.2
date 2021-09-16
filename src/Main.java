public class Main {
    public static void main(String[] args) {
    int accountBalance = 500 ;
    int refillSum = 1600;
    int bonusAmount;
    if (refillSum < 1000){
        bonusAmount = 0;
    } else {
        bonusAmount = refillSum / 100;
    }
        int accountBalanceAfterRefill = accountBalance + refillSum + bonusAmount;
        System.out.println(accountBalanceAfterRefill);
    }

}
