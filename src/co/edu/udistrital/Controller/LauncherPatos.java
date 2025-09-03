package co.edu.udistrital.Controller;
import co.edu.udistrital.FlyBehavior.FlyRocketPowered;
import co.edu.udistrital.Model.*;

/**
 *
 * @author Jose Cucanchon 20241020038
 */
public class LauncherPatos {

    /**
     * Metodo principal de la clase launcher que nos permitira ejecutar 
     * nuestro aplicativo
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duck mallardDuckEjemplo = new MallardDuck();
        mallardDuckEjemplo.display();
        mallardDuckEjemplo.performFly();
        mallardDuckEjemplo.performQuack();
        
        System.out.println("\nCreamos un pato decorativo \n");
        
        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        
        System.out.println("\nAhora queremos cambiar el comportamiento de vuelo "
                           + "de nuestro decoy duck\n");
        
        decoyDuck.setFlyBehavior(new FlyRocketPowered());
        decoyDuck.performFly();
    }
    
}
