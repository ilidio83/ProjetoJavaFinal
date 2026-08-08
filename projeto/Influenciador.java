package projeto;

public class Influenciador extends CriadorConteudo implements Patrocinado{
    private String nicho;

    /// construtor
    public Influenciador(long id, String nome, String email, String senha, String descricao, int seguidores, String nicho) {
        super(id, nome, email, senha, descricao, seguidores);
        this.nicho = nicho;
    }

    public Influenciador() {

    }

    /// get end set
    public String getNicho() {
        return nicho;
    }

    public void setNicho(String nicho) {
        this.nicho = nicho;
    }

    public void fazerParceria(){

    }
    @Override
    public void receberPatrocinio() {

    }

    @Override
    public void encerrarPatricinio() {

    }
}
