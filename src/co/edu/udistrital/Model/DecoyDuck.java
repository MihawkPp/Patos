/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    }

    @Override
    public void display() {
        
    }
    
    public void performFly() {
        flyBehavior = new FlyNoWay();
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior = new MuteQuack();
        quackBehavior.quack();
    }
}
