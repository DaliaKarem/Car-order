package SW;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    boolean check=true;
    ArrayList<Driver> a=new ArrayList<>();
    Scanner i=new Scanner(System.in);
    public boolean suspend()
    {
        System.out.println(" Do you want to suspend this account ? (T/F)");

        char c=i.next().charAt(0);
        if(c=='T')
        {
            synchronized (a)
                {
                    System.out.println("Waiting..");
                    try {
                        a.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }
        else{
          //enter on the system
        }
        return check;
    }
    public boolean verify()
    {
        System.out.println("Do you want to verify this Account?(T/F) ") ;
        char c=i.next().charAt(0);
        if(c=='F')
        { System.out.println(" Sorry, sign up again");
            check=false;
        }
        else{
            System.out.println("successfully registered ");
            //enter on the System

        }
        return check;
    }
}
