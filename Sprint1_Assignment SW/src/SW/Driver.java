package SW;

import java.util.ArrayList;

public class Driver extends FavArea implements Notification{
    Admin a;
   passenger p;
   String area;
   TripPrice t;
    private static Object lock = new Object();
 ArrayList<RegisterAsDriver> drivers=new ArrayList<RegisterAsDriver>();
   public void suspend(){
       if (a.suspend())
           synchronized (lock)
           {
               System.out.println("Waiting..");
               try {
                   lock.wait();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
   }
void  offer(){
    System.out.println("Your way is one of my favorite ways so you got an offer '50% off'  :)  ");
    t.OFFPRICE();
}
void res_area(String area )
{
if(p.getSource()==search(area)){
offer();
}

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

