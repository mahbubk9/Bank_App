import java.time.LocalDateTime;
import java.util.HashMap;

public class App {
    private HashMap<LocalDateTime,Double> statement;
    public static void main(String[] args) {
        PersonalAccount pc=new PersonalAccount("Jon Smith",010506,87654321,1000.00,  LocalDateTime.now());
        BusinessAccount ba=new BusinessAccount("Jon Smith",323536,78965322,1000.0,LocalDateTime.now());
        ISAAccount ia=new ISAAccount("John Smith",070302,73498251,1050.0,LocalDateTime.now());
        pc.setStatement(pc.openingTime,pc.balance);
        System.out.println(pc.getName());
        System.out.println(pc.getOpeningTime());

        System.out.println(pc.getOpeningTime());
        pc.addMoney(100);
        System.out.println("Your balance is "+pc.getBalance());
        pc.withdrawMoney(20);
        System.out.println("Your balance is "+pc.getBalance());
        pc.setStatement(LocalDateTime.now(), pc.balance);
        System.out.println("Your balance is " + pc.getStatement());
        //adding a comment line to do new commit
        System.out.println("Printing Account Statement for "+pc.getName() +"\n  "  + pc.getStatement());
        //ba.addAccCharge(25.0);
        //System.out.println("Your Current Charges "+ba.getCharges());
        System.out.println("Printing Business Account Statement for "+ba.getName() +"\n  "  + ba.getStatement());
        System.out.println("ISA Account Statement for "+ia.getName() +"\n  "  + ia.getStatement());
        ba.addAccCharge(25.0);
        System.out.println("Business account charges"+ba.getCharges());


    }
}
