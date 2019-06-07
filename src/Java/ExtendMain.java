package Java;




public class ExtendMain {

    public static void main(String[] args) {



        StudyExtend SE = new StudyExtend();
        FishRobt fish1 = new FishRobt();
        DroneRobot drone1 = new DroneRobot();


        SE.mySituation();

        drone1.x=100;
        drone1.y=200;
        drone1.altitude=1500;
        drone1.mySituation();
        drone1.fly();

        fish1.x=100;
        fish1.y=300;
        fish1.depth=500;
        fish1.mySituation();
        fish1.swim();




    }

}
