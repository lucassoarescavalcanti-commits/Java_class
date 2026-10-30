public class Produto {

    String nome;
    Double valor;
    Integer quantidade;

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public Produto(String nome, Double valor, Integer quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String mostrarProduto() {

        if (this.quantidade == null) {
            return "Estoque não informado.";
        }

        if (this.quantidade == 0) {
            return "Produto esgotado.";
        }

        return "O " + nome + " com valor de " + valor +
               " com " + quantidade + " unidades disponíveis.";
    }
}