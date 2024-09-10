class CuentaBancaria {

    private String titular;
    private double saldo;
    private String numeroCuenta;

    public CuentaBancaria() {

    }

    public CuentaBancaria(String titular, String numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                '}';
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
            System.out.println("Se han depositado: $" + cantidad + " en la cuenta.");
        } else {
            System.out.println("La cantidad a depositar debe ser mayor a 0.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo = saldo - cantidad;
            System.out.println("Se han retirado: $" + cantidad + " de la cuenta.");
        } else if (cantidad > saldo) {
            System.out.println("Fondos insuficientes para realizar el retiro.");
        } else {
            System.out.println("La cantidad a retirar debe ser mayor a 0.");
        }
    }

    public void mostrarInformacion() {
        System.out.println(this.toString());
    }

}