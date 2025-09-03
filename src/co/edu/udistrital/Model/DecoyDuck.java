package co.edu.udistrital.Model;

import co.edu.udistrital.FlyBehavior.FlyNoWay;
import co.edu.udistrital.QuackBehavior.MuteQuack;

/**
 *
 * @author Estudiantes
 */
public class DecoyDuck extends Duck{
    public DecoyDuck() {
        super();
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Decoy Duck");
    }
    
    
}
