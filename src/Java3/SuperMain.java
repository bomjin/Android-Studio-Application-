package Java3;

public class SuperMain {
    public static void main(String[] args) {


        StudySuper ss = new StudySuper(100, 200);
        FishRobot fish1 = new FishRobot(100, 300);
        DroneRobot drone1 = new DroneRobot(200, 300);


        ss.mySituation();
        fish1.depth=1500;
        fish1.mySituation();
        fish1.swim();
        drone1.mySituation();
        drone1.altitude=1500;
        drone1.fly();



    }

}

