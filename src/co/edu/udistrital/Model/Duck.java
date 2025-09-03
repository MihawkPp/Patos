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
    
    /**
     * Esta función va a activar el metodo fly() para todos los patos hijos
     * depende entonces de como se instancie en cada uno el comportamiento 
     * adecuado utilizando sustitucion de liskov
     */
    public void performFly() { 
        flyBehavior.fly();
    }
    
    /**
     * Esta función va a activar el metodo fly() para todos los patos hijos
     * depende entonces de como se instancie en cada uno el comportamiento 
     * adecuado utilizando sustitucion de liskov
     */
    public void performQuack() {
        quackBehavior.quack();
    }
    
    /**
     * Este metodo set nos permite cambiar el comportamiento de vuelo en tiempo
     * de ejecucion
     * @param fb Este parametro recibe el nuevo tipo de comportamiento
     */
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }
    
    /**
     * Este metodo set nos permite cambiar el comportamiento de sonido en tiempo
     * de ejecucion
     * @param qb Este parametro recibe el nuevo tipo de comportamiento
     */
    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}
