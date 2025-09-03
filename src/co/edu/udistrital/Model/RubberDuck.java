package co.edu.udistrital.Model;

import co.edu.udistrital.FlyBehavior.FlyNoWay;
import co.edu.udistrital.QuackBehavior.Squeak;

/**
 *
 * @author Estudiantes
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        super();
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }

}
