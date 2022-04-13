public class BankAccount
{
    private double checkingBalance;
    private double savingsBalance;

    public static int numOfAccounts = 0;
    public static double totalValue = 0.0;

    public BankAccount()
    {
        numOfAccounts+= 1;
        this.checkingBalance = 0;
        this.savingsBalance = 0.0;
    }

    public double getChecking()
    {
        return this.checkingBalance;
    }

    public double getSavings()
    {
        return this.savingsBalance;
    }

    public void depositMoney(double value, String account)
    {
        if(account.equals("Checking"))
        {
            this.checkingBalance += value;
        }
        else if(account.equals("Savings"))
        {
            this.savingsBalance += value;
        }

        totalValue += value;
    }

    public void withdrawMoney(double value, String account)
    {
        boolean withdraw = false;

        if(account.equals("Checking"))
        {
            if(this.checkingBalance - value >= 0)
            {
                withdraw = true;
                this.checkingBalance -= value;
            }
        }

        if(account.equals("Savings"))
        {
            if(this.savingsBalance - value >= 0)
            {
                withdraw = true;
                this.savingsBalance -= value;
            }
        }
        if(withdraw == true)
        {
            totalValue -= value;
        }
        else
        {
            System.out.println("Insufficient funds in account");
        }
    }

    public void accountBalance()
    {
        System.out.println("Checking: $" + this.checkingBalance);
        System.out.println("Savings: $" + this.savingsBalance);
        System.out.println("Total Value: $" + totalValue);
    }

}