public class Produto {
    protected String nomeLoja; // atributos com modificador protected pois a classe Produto terá subclasses
    protected int preco;
    protected String descricao;

    public Produto(String nomeLoja, int preco, String descricao) {
        this.nomeLoja = nomeLoja;
        this.preco = preco;
        this.descricao = descricao;
    }



    // Gets and Sets
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }
}
