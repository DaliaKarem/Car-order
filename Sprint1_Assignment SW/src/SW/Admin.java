package SW;
import java.util.Scanner;

public class Admin {
    boolean check=true;
    Driver d;
    Scanner i=new Scanner(System.in);
    public void pendingAccount()
    {  System.out.println(" Wating.....");

    }
    public boolean suspend()
    {
        System.out.println(" Do you want to suspend this account ? (T/F)");

        char c=i.next().charAt(0);
        if(c=='T')
        { d.suspend();

        }
        else{
           // l.setUserName(d.user_Name);
            //l.setPass(d.pass);
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
        }
        return check;
    }
}
