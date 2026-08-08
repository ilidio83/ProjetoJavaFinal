package projeto;

public class Fotografo extends CriadorConteudo implements Transmitivel{
    private String especialidade;

    /// construtor
    public Fotografo(long id, String nome, String email, String senha, String descricao, int seguidores, String especialidade) {
        super(id, nome, email, senha, descricao, seguidores);
        this.especialidade = especialidade;
    }

    public Fotografo() {

    }

    /// get end set
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public void publicarFotos(){

    }

    @Override
    public void iniciarLive() {

    }

    @Override
    public void encerrarLive() {

    }
}
