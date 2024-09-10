import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.setTitular("Juan Pérez");
        cuenta1.setNumeroCuenta("34576342354");
        cuenta1.setSaldo(1000);

        CuentaBancaria cuenta2 = new CuentaBancaria("Ana García", "987654321", 500);

        Scanner scann = new Scanner(System.in);

        System.out.println("""
                ----------------------------------------
                          Cuentas Bancarias
                          
                Vamos a crear una cuenta bancaria
                Ingrese el nombre del titular: """);
        String titular = scann.nextLine();

        System.out.print("Ingrese el saldo inicial: ");
        double saldo = scann.nextDouble();

        scann.nextLine();

        System.out.print("Ingrese el número de cuenta: ");
        String numeroCuenta = scann.nextLine();

        CuentaBancaria cuenta3 = new CuentaBancaria(titular, numeroCuenta, saldo);

        cuenta1.mostrarInformacion();
        cuenta2.mostrarInformacion();
        cuenta3.mostrarInformacion();

        cuenta1.depositar(300);
        cuenta1.retirar(200);
        cuenta1.mostrarInformacion();

        cuenta2.depositar(100);
        cuenta2.retirar(600);
        cuenta2.mostrarInformacion();

        cuenta3.depositar(700);
        cuenta3.retirar(800);
        cuenta3.mostrarInformacion();

    }
}