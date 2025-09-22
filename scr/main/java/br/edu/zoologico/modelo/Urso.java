package br.edu.seuprojeto.modelo;

public class Urso extends Animal {
    private String tipoPelo;

    // Construtor
    public Urso(String nome, int idade, String tipoPelo) {
        super(nome, idade);
        this.tipoPelo = tipoPelo;
    }

    // Getter e Setter
    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

    // Método sobrescrito
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está rugindo alto como um urso!");
    }

    // Método próprio
    public void pescarPeixe() {
        System.out.println(getNome() + " está pescando peixes no rio.");
    }

    @Override
    public String toString() {
        return "Urso{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", tipoPelo='" + tipoPelo + '\'' +
                '}';
    }
}
