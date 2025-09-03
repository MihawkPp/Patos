package co.edu.udistrital.Model;

import co.edu.udistrital.FlyBehavior.FlyWithWings;
import co.edu.udistrital.QuackBehavior.Quack;

/**
 *
 * @author Estudiantes
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        super();
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
    
}
