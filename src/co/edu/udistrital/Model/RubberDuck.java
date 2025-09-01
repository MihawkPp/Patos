/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    }

    @Override
    public void display() {

    }

    public void performFly() {
        flyBehavior = new FlyNoWay();
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior = new Squeak();
        quackBehavior.quack();
    }
}
