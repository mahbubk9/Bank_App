import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashMap;

public class BusinessAccount extends Account implements Serializable {
   // double charges=0.0;
    private HashMap<LocalDateTime,Double> charges;
    private HashMap<LocalDateTime,Double> statement;
    public BusinessAccount(String name, int sortCode, int accountNumber, double balance, LocalDateTime openingTime) {
        super(name, sortCode, accountNumber, balance, openingTime);
        this.name=name;
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.openingTime=LocalDateTime.now();
        this.setStatement(openingTime,balance);
        charges=new HashMap<>();
    }
    public void addAccCharge(double amount){
        LocalDateTime time =LocalDateTime.now();
        charges.put(time, amount);
        System.out.println(charges);

    }
    public HashMap<LocalDateTime, Double> getCharges(){
        return charges;
    }
}
