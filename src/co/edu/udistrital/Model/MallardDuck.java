/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.Model;

import co.edu.udistrital.FlyBehavior.FlyWithWings;

/**
 *
 * @author Estudiantes
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        super();
    }

    @Override
    public void display() {
        
    }
    
    public void performFly() {
        flyBehavior = new FlyWithWings();
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
