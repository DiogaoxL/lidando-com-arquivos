package ex02;

public class Titulo {
    String nome;
    String duracao;
    int anoLancamento;

    public Titulo(String nome, String duracao, int anoLancamento){
        this.nome = nome;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public String getDuracao() {
        return duracao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
}
