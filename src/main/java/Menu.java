import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;


public class Menu implements Serializable {

    //Over-riding the toString




    public void WriteObjectToFile(Object serObj) {

        try {

            FileOutputStream fileOut = new FileOutputStream(new File("myObjects.txt"));
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
            System.out.println("The Object  was successfully written to a file");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args){
        PersonalAccount pc=new PersonalAccount("Jon Smith",010506,87654321,1000.00,  LocalDateTime.now());
        BusinessAccount ba=new BusinessAccount("Jon Smith",323536,78965322,1000.0,LocalDateTime.now());
        ISAAccount ia=new ISAAccount("John Smith",070302,73498251,1050.0,LocalDateTime.now());
        ArrayList<Account> Acc=new ArrayList<>();
        Acc.add(pc) ;
        Acc.add(ba);
        Acc.add(ia);
        System.out.println(Acc.get(0).getBalance());
        Acc.get(0).addMoney(1000.0);
        System.out.println(Acc.get(0).getBalance());

        try{
            FileOutputStream writeData = new FileOutputStream("accData.ser");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);



            writeStream.writeObject(Acc);
            writeStream.flush();
            writeStream.close();

        }catch (IOException e) {
            e.printStackTrace();
        }


        try{
            FileInputStream readData = new FileInputStream("accData.ser");
            ObjectInputStream readStream = new ObjectInputStream(readData);

            ArrayList<Account> Acc2 = (ArrayList<Account>) readStream.readObject();



            System.out.println(Acc2.get(0).toString());
            System.out.println(Acc2.get(0).getStatement());
            readStream.close();
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    }















