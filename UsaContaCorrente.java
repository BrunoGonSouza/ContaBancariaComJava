import javax.swing.JOptionPane;

public class UsaContaCorrente {
    public static void main(String[] args) {
        //variaveis auxiliares
        String nome;
        double saldo, limite, v,s;
        char tipo;

        //declaração dos objetos
        ContaCorrente conta1, conta2;

        //solicitação dos dados conta1
        nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta: "));
        limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta: "));
        tipo = JOptionPane.showInputDialog("Digite o tipo da conta (E = Especial / S = Simples): ").charAt(0);

        //instancia objeto 
        conta1 = new ContaCorrente(nome, saldo, limite, tipo);

        //CharAt(indice) = obtem o caracter do indice informado
        //.toUpperCase() = converte String para maiuscula
        //.toLowerCase ()= converte para minuscula


        //solicitação dos dados conta2
        nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta: "));
        tipo = JOptionPane.showInputDialog("Digite o tipo da conta (E = Especial / S = Simples): ").charAt(0);

        conta2 = new ContaCorrente(nome, saldo, tipo);


        //mostra os dados dos objetos usando metodos
        //objeto.nomeMetodo
        conta1.mostraDados();
        conta2.mostraDados();

        //deposta 500 reais na conta
        conta1.depositar(500);

        conta1.mostraDados();

        //solicita valor do deposito para conta2
        v = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito"));
        conta2.depositar(v);
        conta2.mostraDados();

        //saque da conta
        conta1.saque(100.0);
        conta1.mostraDados();

        s = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));
        conta2.depositar(s);
        conta2.mostraDados();

    }
}
