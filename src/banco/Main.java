

package banco;

/**
 *
 * @author guilhermepontes
 * @version 0.1
 */
public class Main {

   
    public static void main(String[] args) {
        int contaGuilherme = 12345;
        int agenciaGuilherme = 1;
        double limiteGuilherme = 5000;

        ContaCorrente Guilherme = new ContaCorrente(contaGuilherme, agenciaGuilherme, limiteGuilherme);
        Banco Itau = new Banco(1, "Banco Itaú");
        Itau.addCC(Guilherme);

        int contaRenato = 54321;
        int agenciaRenato = 2;
        double limiteRenato = 2500;

        ContaCorrente Renato = new ContaCorrente(contaRenato, agenciaRenato, limiteRenato);
        Renato.depositar(4000);
        Itau.addCC(Renato);

        Itau.mostrarContas();




    }

}
