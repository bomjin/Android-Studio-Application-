package Java2;



public class OverridingMain {

    public static void main(String[] args) {

        studyOverriding OM = new studyOverriding();
        FishRobot fish1 = new FishRobot();

        OM.mySituation();

        fish1.x=100;
        fish1.y=300;
        fish1.depth=500;
        fish1.mySituatiom();


    }
}

