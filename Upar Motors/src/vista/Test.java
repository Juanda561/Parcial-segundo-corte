
package vista;

import modelo.*;

public class Test {
    
    public static void main(String[] args) {
        
        Catalogo c1 = new Catalogo();
        
        Motor m1 = new MotorElectrico(12, 112233, "Skill");
        c1.registrarMotor(m1);
       
        Motor m2 = new MotorMecanico((float) 1.8, "Gasolina", 222222, "DeWalt");
        c1.registrarMotor(m2);
                
    }
    
}
