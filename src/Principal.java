public class Principal {

    public static void main(String[] args) {
//        Conta c1 = new Conta("Tatiana", "123456", "123X", 500); foi bloqueada para instaciar com abstract
//        Conta c2 = new Conta("Manuela", "789012", "123X", 300);
//
//        c1.mostrarDados();
//        c2.mostrarDados();

//        ContaCorrente c1 = new ContaCorrente("Tatiana", "123456", "123X", 500);
//        ContaCorrente c2 = new ContaCorrente("Manuela", "789012", "123X", 550);
//
//        c1.mostrarDados();
//        c2.mostrarDados();
//
//
//        c1.sacar(100);
//        c2.sacar(200);
//
//        c1.depositar(50);
//        c2.depositar(90);
//
//        ContaEspecial ce1 = new ContaEspecial("Bia", "2345", "0001", 200, 500);
//
//        ce1.mostrarDados();
//        ce1.sacar(300);
//
//        ce1.depositar(100);

        ContaCorrente cc1 = new ContaCorrente("Zé", "123456", "0001", 500);
        ContaPoupanca cp1 = new ContaPoupanca("Olga", "123456", "0001", 500);
        ContaEspecial ce1 = new ContaEspecial("Lia", "2345", "0001", 200, 500);


        cc1.sacar(200);
        cc1.sacar(150);

        cp1.depositar(100);

        ce1.sacar(400);

    }
}
