import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashMap;

public class Account implements Serializable {
    String name;
    int sortCode=000000;
    int accountNumber=00000000;
    double balance;

    public LocalDateTime openingTime;
    private   HashMap<LocalDateTime,Double> statement;


    public Account(String name, int sortCode, int accountNumber, double balance, LocalDateTime openingTime) {
        this.name = name;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.openingTime=LocalDateTime.now();
        statement= new HashMap<>();
        statement.put(openingTime,balance);
    }
    public String toString(){
        return "Account Name: " + this.name+ ". Account Type: " + this.getClass()+ ". Balance: " +this.getBalance();
    }
    public LocalDateTime getOpeningTime() {
        return openingTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSortCode() {
        return sortCode;
    }

    public void setSortCode(int sortCode) {
        this.sortCode = sortCode;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addMoney(double amount){
        balance+=amount;
    }
    public void withdrawMoney(double amount){
        if (balance<=0|| amount>balance){
            System.out.println("Can't Withdraw due to low balance");
        }
        else balance -= amount;
    }
    public HashMap<LocalDateTime,Double> getStatement(){
        //return Arrays.asList(statement);
        //System.out.println();

        return statement;
    }
    public void setStatement(LocalDateTime time,Double balance){
        statement.put(time, balance);
    }
}
