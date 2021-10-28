
package modelo;

public abstract class Motor {
    private int num_serial;
    private String marca;

    public Motor() {
    }

    public Motor(int num_serial, String marca) {
        this.num_serial = num_serial;
        this.marca = marca;
    }

    public int getNum_serial() {
        return num_serial;
    }

    public void setNum_serial(int num_serial) {
        this.num_serial = num_serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public abstract String getInfoMotor();
    public abstract String getInfoCatalogo();
       
    
    
    
}
