package co.edu.udistrital.QuackBehavior;

/**
 *
 * @author Estudiantes
 */
public class MuteQuack implements QuackBehavior{
    public MuteQuack() {
        
    }
    
    @Override
    public void quack() {
        System.out.println("This Duck makes no sound");
    }
}
