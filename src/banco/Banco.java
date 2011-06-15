package banco;

/**
 *
 * @author guilhermepontes
 */
import java.util.ArrayList;
import java.util.List;

public class Banco implements iBanco {
    private int id;
    private String descricao;
    private List<ContaCorrente> contas;

    public Banco(){
    }

    public Banco(int id, String d){
        this.id = id;
        this.descricao = d;
        this.contas = new ArrayList<ContaCorrente>();
    }


    public Banco addCC(ContaCorrente c){
        this.contas.add(c);
        return this;
    }

    public boolean remover (int conta){
          boolean r = false;

          for (int i= 0; i < this.contas.size(); i++) {
            if ( this.contas.get(i).getConta() == conta ) {
                  this.contas.remove(i);
                  r = true;
            } else
                r = false;

          } //for

          return r;
    }

    public void mostrarContas(){
          for (int i= 0; i < this.contas.size(); i++) {
              System.out.println("Banco: " + this.getDescricao());
              System.out.println("Conta: " + this.contas.get(i).getConta());
              System.out.println("Agência: " + this.contas.get(i).getAgencia());
              System.out.println("Limite: " + this.contas.get(i).getLimite());
              System.out.println("Saldo: " + this.contas.get(i).getSaldo());
              System.out.println("\n\n");
          }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


}
