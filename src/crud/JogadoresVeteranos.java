package crud;

public class JogadoresVeteranos extends Jogadores implements Aumentar{

    public JogadoresVeteranos(int id, String nome, int anoTreino, float salario){
        super(id, nome, anoTreino, salario);
    }

    // Metodos

    @Override
    public float aumentarSalario() {
        this.setSalario(getSalario() + (this.getSalario() * 0.10f));
        return getSalario();
    }
}
