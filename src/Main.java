import domain.models.Cuenta;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cuenta cuenta = new Cuenta();
        cuenta.setNCuenta("7383738b");
        cuenta.setSaldo(838.2);
        cuenta.setTitulo("Maria");
        cuenta.setTransacciones("pagos");
        cuenta.setProductoContratado("hipoteca");


      System.out.println("Con las asignaturas " + cuenta.getNCuenta());
      System.out.println("Con el nombre " + cuenta.getTitulo());
}

































