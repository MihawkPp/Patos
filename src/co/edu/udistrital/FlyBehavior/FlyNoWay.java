/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
