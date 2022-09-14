public class UsaContaPoupanca {
    public static void main(String[] args) {
        //declaração dos objetos
        ContaPoupanca p1, p2;   //variaveis

        //declaração de variavel auxiliar
        double resultado;
        
        //instanciação
        p1 = new ContaPoupanca();
        p1.imprimeDados();

        p2 = new ContaPoupanca("0001", "123", 1000.5, 10 );
        p2.imprimeDados();


        //usando os metodos
        p1.depositar(500);
        p1.imprimeDados();

        resultado = p2.calculaRendimento();
        p2.imprimeDados();
        System.out.println("Rendimento: " + resultado);

    }
}
