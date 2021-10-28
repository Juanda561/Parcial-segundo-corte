
package modelo;

public class MotorElectrico extends Motor implements IReservable{
    
    private int num_kilovatios;

    public MotorElectrico() {
    }

    public MotorElectrico(int num_kilovatios) {
        this.num_kilovatios = num_kilovatios;
    }

    public MotorElectrico(int num_kilovatios, int num_serial, String marca) {
        super(num_serial, marca);
        this.num_kilovatios = num_kilovatios;
    }

   

    public int getNum_kilovatios() {
        return num_kilovatios;
    }

    public void setNum_kilovatios(int num_kilovatios) {
        this.num_kilovatios = num_kilovatios;
    }

    @Override
    public double getValorReserva() {
        return num_kilovatios*1500; 
    }

    @Override
    public String getInfoMotor() {
        return "Numero KV: "+num_kilovatios+"\n"
               +"Serial: "+getNum_serial()+"\n"
               +"Marca: "+getMarca()+"\n" ;
    }

    @Override
    public String getInfoCatalogo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
