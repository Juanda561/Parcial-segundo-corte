
package modelo;


public class MotorHibrido extends MotorElectrico implements IReservable,IVendible{

    public MotorHibrido(int num_kilovatios, int num_serial, String marca) {
        super(num_kilovatios, num_serial, marca);
    }

    
    

    @Override
    public double getValorReserva() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getValorVenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
