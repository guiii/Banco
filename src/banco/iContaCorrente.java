/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;

/**
 *
 * @author guilhermepontes
 */
interface iContaCorrente {
    public boolean sacar( double valor );
    public boolean depositar(double valor);
    public String imprimirSaldo();
}
