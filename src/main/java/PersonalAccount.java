import java.time.LocalDateTime;
import java.util.HashMap;

public class PersonalAccount extends Account {
    private HashMap<LocalDateTime,Double> statement;
    public PersonalAccount(String name, int sortCode, int accountNumber, double balance, LocalDateTime openingTime) {
        super(name, sortCode, accountNumber, balance,openingTime);
        this.name=name;
        this.sortCode=sortCode;
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.setStatement(openingTime,balance);
    }


}
