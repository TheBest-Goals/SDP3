package implementor;

public class LegacyPhysicsEngine {

    public int ApplyVector(String name, double powerOC){
        System.out.println("{legacy engine} apllying:"+ name + "with power" + powerOC);

        if(powerOC<0){
            return -1;
        }
        return 0;
    }
}
