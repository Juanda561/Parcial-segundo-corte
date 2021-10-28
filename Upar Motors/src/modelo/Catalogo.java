
package modelo;

import java.util.ArrayList;


public class Catalogo {
    
     private ArrayList<Motor> motors = new ArrayList<Motor>();

    public ArrayList<Motor> getMotors() {
        return motors;
    }

    public void setMotors(ArrayList<Motor> motors) {
        this.motors = motors;
    }
    
     
     
     public void registrarMotor(Motor m){
                
        if (m instanceof MotorElectrico) {
            System.out.println("Se ha añadido un Motor Electrico a la lista ");
        }else if (m instanceof MotorMecanico) {
                    System.out.println("Se ha añadido un Motor Mecanico a la lista ");
                }else{
                    System.out.println("Se ha añadido un Motor Hibrido a la lista ");
                }
       
        motors.add(m);
    }
     
     public String getCatalogo(){
         return "";
     }
     
}
