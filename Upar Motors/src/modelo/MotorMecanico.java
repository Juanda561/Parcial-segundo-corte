
package modelo;


public class MotorMecanico extends Motor implements IVendible{
    
    private float cc;
    private String tipo_gasolina;

    public MotorMecanico(float cc, String tipo_gasolina, int num_serial, String marca) {
        super(num_serial, marca);
        this.cc = cc;
        this.tipo_gasolina = tipo_gasolina;
    
        if (cc==1.8) {
        }else if (cc==1.8) {
         }else if (cc==2.5) {
          }else{
            System.out.println("El Tamaño de CC debe ser de 1.3 ó 1.8 ó de 2.5 CC");
          }
        
    }

    
    
    public float getCc() {
        return cc;
    }

    public void setCc(float cc) {
        this.cc = cc;
    }

    public String getTipo_gasolina() {
        return tipo_gasolina;
    }

    public void setTipo_gasolina(String tipo_gasolina) {
        this.tipo_gasolina = tipo_gasolina;
    }

    public double valorCombustible(){
        if (tipo_gasolina=="Gasolina") {
            return 40000;
        }else if (tipo_gasolina=="Diesel") {
            return 70000;
        }else{
            return 30000;
        }
    }
    
    public double valorCC(){
        if (cc==1.3) {
            return 50000;
        }else if (cc==1.8) {
            return 70000;
        }else{
            return 120000;
        }
    }
    
    @Override
    public double getValorVenta() {
        return valorCombustible()+valorCC();
    }

    @Override
    public String getInfoMotor() {
        return "Serial: "+getNum_serial()+"\n"
                +"Marca: "+getMarca()+"\n"
                +"Tamano CC: "+cc+"\n"
                +"Tipo Gasolina: "+tipo_gasolina;
    }

    @Override
    public String getInfoCatalogo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
