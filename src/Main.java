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

        cliente cliente = new cliente();



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
                System.out.println("Cliente con el numero de cuenta: " + cuenta.getNCuenta());
                System.out.println("Con el titulo:" + cuenta.getTitulo());
            }
            case 2: {
                System.out.println("Productos con el numero de cuenta: " + cuenta.getNCuenta());
                System.out.println("Con el titulo:" + cuenta.getTitulo());
            }


            case 3: {
                System.out.println("Hipotecas con el numero de cuenta: " + cuenta.getNCuenta());
                System.out.println("Con el titulo:" + cuenta.getTitulo());
            }
            case 4: {
                System.out.println("cuenta con el numero de cuenta: " + cuenta.getNCuenta());
                System.out.println("Con el titulo:" + cuenta.getTitulo());
            }
        }


    }
}

































