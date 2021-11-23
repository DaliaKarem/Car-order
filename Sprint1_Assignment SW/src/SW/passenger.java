package SW;

import java.util.*;

public class passenger implements Notification{
    Driver D1;
    Scanner in=new Scanner(System.in);
    Map<String,String> area=new HashMap<String,String>() ;
Driver d;
    String source,dest;
    ArrayList<Register> Pass=new ArrayList<>();
    void setSource(String source){this.source=source;}
    String getSource(){return source;}
    void setDest(String dest){this.dest=dest;}
    String getDest(){return dest;}

    void req_aride(String source,String Dest){
        setDest(source);
        setDest(Dest);
        area.put(source,dest);
        D1.res_area(source);
    }


    @Override
    public void update() {

    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {

    }

    @Override
    public void Notify() {

    }
}
