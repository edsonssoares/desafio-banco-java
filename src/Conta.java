
// classes com abstract não podem ser instanciadas, ou seja, não será possível criar um objeto

public abstract class Conta {

    // Attributes
    private String titularConta;
    private String numeroConta;
    private String numeroAgencia;
    private double saldo;

    // Constructor
    public Conta(String titularConta, String numeroConta, String numeroAgencia, double saldo) {
        this.titularConta = titularConta;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;

    }

    // Methods
    public void depositar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.printf("%s%s%.2f%n", getTitularConta(), ", depósito efetuado com sucesso. Seu novo saldo é: ", getSaldo());
        }
    }

    public void sacar(double valor) {
        if (getSaldo() < valor) {
            System.out.println("Saldo insuficiente para saque");
        } else {
            setSaldo(getSaldo() - valor);
            //System.out.println("Saque autorizado. Seu novo saldo é: " + getSaldo());
            System.out.printf("%s%s%.2f%n", getTitularConta(), ", saque efetuado com sucesso. Seu novo saldo é: ", getSaldo());
        }
    }

    public void mostrarDados() {
        System.out.println("---------------------------");
        System.out.println("O titular da conta é: " + getTitularConta());
        System.out.println("O número da conta é: " + getNumeroConta());
        System.out.println("O número da agência é: " + getNumeroAgencia());
        System.out.println("O saldo da conta é: " + getSaldo());
    }

    // getters e setters (encapsulamento)
    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
