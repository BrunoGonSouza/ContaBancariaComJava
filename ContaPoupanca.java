public class ContaPoupanca {
    //atributos     definição da classe
    String agencia;
    String numero;
    double saldo;
    double taxa;

    //construtor
    //padrão
    public ContaPoupanca(){
    


    }
    //com parametros
    public ContaPoupanca(String a, String n, double s, double t){
        agencia = a;
        numero = n;
        saldo = s;
        taxa = t;
    }

    //metodos
    //sem retorno e sem parametro
    public void imprimeDados(){
        System.out.println("Agência: " + agencia + "\nNúmero: " + numero + "\nSaldo: " + saldo + "\nTaxa: " + taxa);
    }
    
    //Sem retorno e com parametro
    public void depositar(double valor){
        saldo += valor;
    }

    //com retorno e sem parametro
    public double calculaRendimento(){
        double rendimento;
        rendimento = saldo * taxa / 100;
        return rendimento; //retorno do metodo deve ser do mesmo tipo definido na assinatura
    }
}
