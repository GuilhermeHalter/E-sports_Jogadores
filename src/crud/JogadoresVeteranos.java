package crud;

public class JogadoresVeteranos extends Jogadores{

    public JogadoresVeteranos(int id, String nome, int anoTreino, float salario){
        super(id, nome, anoTreino, salario);
    }

    // Metodos

    public float aumentarSalario(){
        this.setSalario(getSalario() + (this.getSalario() * 0.10f)); // Adiciona 10% ao salário atual
        return getSalario(); // Retorna o novo salário atualizado
    }
}
