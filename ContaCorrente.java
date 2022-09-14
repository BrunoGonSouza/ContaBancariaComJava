import javax.swing.JOptionPane;

public class ContaCorrente {
    //atributos
    String nome;
    double saldo;
    double limite;
    char tipo;

    //construtores
    public ContaCorrente(String n, double s, double l, char t){
        this.nome = n;
        this.saldo = s;
        this.limite = l;
        this.tipo = t;
    }
    public ContaCorrente(String n, double s, char t){
        nome = n; //construtor e parametros
        saldo = s;
        tipo = t;
    }

    //metodo
    //void = retorno vazio
    public void mostraDados(){
        //exibir os dados dos atributos
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome + "\nSaldo: " + this.saldo + "\nLimite: " + this.limite + "\nTipo: " + this.tipo);
    }

    public void depositar(double valor){
        //atualiza o saldo da conta, somando o valor informado
        this.saldo = this.saldo + valor;
    }
    public void saque(double valor){
      //atualiza o saldo da conta, subtraindo o valor informado
        saldo = saldo - valor;
        //saldo -= valor
    }
}
