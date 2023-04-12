public class Animal {

    private String nome;
    private String alimentacao;
    private Double peso;

    public Animal(String nome, String alimentacao, Double peso) {
        this.nome = nome;
        this.alimentacao = alimentacao;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
