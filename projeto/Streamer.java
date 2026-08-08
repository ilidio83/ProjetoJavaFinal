package projeto;

public class Streamer extends CriadorConteudo implements Patrocinado{
    private String plataforma;

    /// construtor
    public Streamer(long id, String nome, String email, String senha, String descricao, int seguidores, String plataforma) {
        super(id, nome, email, senha, descricao, seguidores);
        this.plataforma = plataforma;
    }

    public Streamer() {
        super();
    }

    /// get end set
    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void iniciarLive(){

    }
    public void encerrarLive(){

    }

    @Override
    public void receberPatrocinio() {

    }

    @Override
    public void encerrarPatricinio() {

    }

}
