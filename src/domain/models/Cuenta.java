package domain.models;

public class Cuenta {

    private  String NCuenta;
    private  String titulo;
    private  String transacciones;
    private  String productoContratado;
    private  double saldo;


    public String getNCuenta() {
        return NCuenta;
    }

    public void setNCuenta(String NCuenta) {
        this.NCuenta = NCuenta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(String transacciones) {
        this.transacciones = transacciones;
    }

    public String getProductoContratado() {
        return productoContratado;
    }

    public void setProductoContratado(String productoContratado) {
        this.productoContratado = productoContratado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
