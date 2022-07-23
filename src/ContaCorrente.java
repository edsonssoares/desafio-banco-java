public class ContaCorrente extends Conta {
    // ContaCorrente é uma subclasse e herdou tudo da Super Class Conta porque foi inserido o extends

    private final String atendimento = "Sem prioridades"; // final é uma const e por isso não entra no construtor

    public ContaCorrente(String titularConta, String numeroConta, String numeroAgencia, double saldo) {
        super(titularConta, numeroConta, numeroAgencia, saldo); // atributos herdados da super class
    }
    public void mostrarDados() {
        super.mostrarDados(); // super significa que está trazendo dados da super class conta
        System.out.println("Essa conta tem atendimento do tipo: " + getAtendimento());
    }

    public String getAtendimento() {

        return atendimento;
    }


}
