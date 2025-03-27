public class Livro extends Produto {

    private String autor;

    public Livro(String nomeLoja, int preco, String descricao, String autor){
        super(nomeLoja, preco, descricao);
        this.autor = autor;
    }


    @Override
    public String getDescricao() {
        return super.getDescricao() + autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
