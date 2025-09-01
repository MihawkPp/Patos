/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.Model;
import co.edu.udistrital.FlyBehavior.FlyBehavior;
import co.edu.udistrital.FlyBehavior.FlyWithWings;
import co.edu.udistrital.QuackBehavior.Quack;
import co.edu.udistrital.QuackBehavior.QuackBehavior;

/**
 *
 * @author Jose Cucanchon 20241020038
 * Está raro pero creo que va a funcionar todo si dios quiere :D
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    
    public Duck() {
    }

    public abstract void display();

    public void swim() {
        System.out.println("All ducks can swim normally");
    }
    
    public void performFly() {
        flyBehavior = new FlyWithWings();
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior = new Quack();
        quackBehavior.quack();
    }
}
