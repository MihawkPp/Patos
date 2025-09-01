/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    }

    @Override
    public void display() {
        
    }
    
    public void performFly() {
        flyBehavior = new FlyRocketPowered();
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior = new Quack();
        quackBehavior.quack();
        
    }
}
