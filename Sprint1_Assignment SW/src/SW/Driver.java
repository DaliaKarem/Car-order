package SW;

import java.util.ArrayList;

public class Driver extends FavArea implements Notification{
   passenger p;
   TripPrice t;
 ArrayList<RegisterAsDriver> drivers=new ArrayList<RegisterAsDriver>();
   void ArrOfDriv(RegisterAsDriver r){
      drivers.add(r);
   }
   void res_area(String area )//response request area from passenger
   {
       if(p.getSource()==search(area)){
           t.offer();
       }

}
//should search about email and pass
void SearchDriv(RegisterAsDriver r){//if driver registered already on system and want to login
      if(drivers.contains(r)) {
          //enter on the system
      }else {
          System.out.println("you 'r not on the system ,please Sign UP ");
      }
}

    @Override
    public void update() {

    }
    @Override
    public void Notify() {

    }
}

