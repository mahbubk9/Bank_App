import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashMap;


public class ISAAccount extends Account implements Serializable {

    private HashMap<LocalDateTime,Double> statement;
    public ISAAccount(String name, int sortCode, int accountNumber, double balance, LocalDateTime openingTime) {
        super(name, sortCode, accountNumber, balance, openingTime);
        this.name=name;
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.openingTime=LocalDateTime.now();
        this.setStatement(openingTime,balance);

    }
    public void addInterest(){
        double ints=balance*0.2;
        balance+=ints;
        this.setStatement(LocalDateTime.now(),balance);


    }


}
