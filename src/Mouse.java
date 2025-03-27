public class Mouse extends Produto {

    private String tipo;

    public Mouse(String nomeLoja, int preco, String descricao, String tipo){
        super(nomeLoja, preco, descricao);
        this.tipo = tipo;
    }


    @Override
    public String getDescricao() {
        return super.getDescricao() + tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
