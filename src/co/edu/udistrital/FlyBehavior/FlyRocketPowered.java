package co.edu.udistrital.FlyBehavior;

/**
 *
 * @author Estudiantes
 */
public class FlyRocketPowered implements FlyBehavior{
    public FlyRocketPowered() {
        
    }
    
    @Override
    public void fly() {
        System.out.println("This Duck Flies Rocket Powered");
    }
}
