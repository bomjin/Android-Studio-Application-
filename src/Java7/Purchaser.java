package Java7;

public class Purchaser {



   // int money = 20000;
   // Purchaser(StudyPoly2 s) {
     //   money = money - s.price;
   //  }

    int money = 200000;

   void purchase(FishRobot f) {
        money -= f.price;

    }
    void purchase(DroneRobot d) {
        money -= d.price;
    }

        void purchase(TankRobot t) {
           money -= t.price;
   }




        }
