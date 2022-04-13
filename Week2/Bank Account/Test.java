public class Test
{
    public static void main(String[] args)
    {
        BankAccount ethan = new BankAccount();

        ethan.depositMoney(52.60, "Checking");
        ethan.depositMoney(60.42, "Savings");

        ethan.withdrawMoney(60.0, "Checking");

        System.out.println(BankAccount.numOfAccounts);

        System.out.println(ethan.getChecking() +  " " + ethan.getSavings());

        ethan.accountBalance();
    }
}