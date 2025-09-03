package co.edu.udistrital.FlyBehavior;

/**
 *
 * @author Estudiantes
 */
public class FlyNoWay implements FlyBehavior{
    public FlyNoWay() {
        
    }
    
    @Override
    public void fly() {
        System.out.println("This duck can't fly");
    }
}
