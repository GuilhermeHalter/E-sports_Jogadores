package crud;

public class Jogadores {
    private int id;
    private String nome;
    private int anoTreino;
    private float salario;

    public Jogadores(int id, String nome, int anoTreino, float salario) {
        this.id = id;
        this.nome = nome;
        this.anoTreino = anoTreino;
        this.salario = salario;
    }

    // Gets

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoTreino() {
        return anoTreino;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

}
