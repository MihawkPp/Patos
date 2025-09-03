package co.edu.udistrital.QuackBehavior;

/**
 *
 * @author Estudiantes
 */
public class Quack implements QuackBehavior{
    public Quack() {
        
    }
    
    @Override
    public void quack() {
        System.out.println("This Duck quacks normally");
    }
}
