package banco;

/**
 *
 * @author guilhermepontes
 */
interface iBanco {
    public Banco addCC(ContaCorrente c);
    public boolean remover (int conta);
    public void mostrarContas();
}
