import domain.models.Cliente;
import domain.models.Cuenta;
import domain.models.hipoteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Cuenta cuenta = new Cuenta();
        cuenta.setNCuenta("7383738b");
        cuenta.setSaldo(838.2);
        cuenta.setTitulo("Maria");
        cuenta.setTransacciones("pagos");
        cuenta.setProductoContratado("hipoteca");
        hipoteca hipoteca = new hipoteca();
        hipoteca.setDescripcion("tipo1");
        hipoteca.setId("54363tr");
        hipoteca.setIntereses("45");

        Cliente cliente =new Cliente();
        cliente.setDireccion("direcion 1");
        cliente.setCodigoPostal("3234");
        cliente.setNombre("pepe");
        cliente.setDni("324r2345");



        System.out.println("Que desea ver:");
        System.out.println("Clientes introduce 1");
        System.out.println("Productos bancarios introduce 2");
        System.out.println("Hipotecas introduce 3");
        System.out.println("cuenta introduce 4");
        System.out.println("Targetas introduce 5");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        switch (numero) {
            case 1: {
                System.out.println("Cliente con el numero de cuenta: " + cliente.getNombre() + cliente.getCodigoPostal()
                + cliente.getDni());
            }
            case 2: {
                System.out.println("Productos con el numero de cuenta: " + cuenta.getNCuenta());
                System.out.println("Con el titulo:" + cuenta.getTitulo());
            }


            case 3: {
                System.out.println("Hipotecas con el numero de cuenta: " + hipoteca.getId() + hipoteca.getDescripcion());

            }
            case 4: {
                System.out.println("cuenta con el numero de cuenta: " + cuenta.getNCuenta());
                System.out.println("Con el titulo:" + cuenta.getTitulo());
            }
        }


    }
}

































