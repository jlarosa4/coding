public class SavingsAccount {
    private static float annualInterestRate = 0f;
    private float savingsBalance;

    public SavingsAccount(float balance) {
        savingsBalance = balance;
    }

    public static void setAnnualInterestRate(float t) {
        if (t >= 0 && t <= 1)
            annualInterestRate = t;
        else
            throw new IllegalArgumentException("Annual interest rate should be between 0 and 1");
    }

    private float calculateMonthlyInterest() {
        return savingsBalance * annualInterestRate / 12;
    }

    public float getSavingsBalance() {
        return savingsBalance + calculateMonthlyInterest();
    }

    public float getAnnualInterestRate(){
        return annualInterestRate;
    }

    public String toString() {
        return String.format("Balance: %.2f", getSavingsBalance());
    }

    public static void main(String[] args){

        SavingsAccount s1 = new SavingsAccount(2000);
        SavingsAccount s2 = new SavingsAccount(3000);

        SavingsAccount.setAnnualInterestRate(0.04f);
        System.out.println("Saver1 with annual interest rate of 4%: " + s1);
        System.out.println("Saver2 with annual interest rate of 4%: " + s2);

        SavingsAccount.setAnnualInterestRate(0.05f);
        System.out.println("Saver1 with annual interest rate of 5%: " + s1);
        System.out.println("Saver2 with annual interest rate of 5%: " + s2);
    }


}
