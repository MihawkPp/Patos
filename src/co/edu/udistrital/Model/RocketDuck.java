package co.edu.udistrital.Model;

import co.edu.udistrital.FlyBehavior.FlyRocketPowered;
import co.edu.udistrital.QuackBehavior.Quack;

/**
 *
 * @author Estudiantes
 */
public class RocketDuck extends Duck{
    
    public RocketDuck() {
        super();
        flyBehavior = new FlyRocketPowered();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rocket Duck");
    }
    
}
