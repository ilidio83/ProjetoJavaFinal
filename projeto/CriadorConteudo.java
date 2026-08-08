package projeto;

public class CriadorConteudo extends Usuario {
    protected String descricao;
    protected int seguidores;

    /// construtor
    public CriadorConteudo(long id, String nome, String email, String senha, String descricao, int seguidores) {
        super(id, nome, email, senha);
        this.descricao = descricao;
        this.seguidores = seguidores;
    }

    public CriadorConteudo() {
        super();
    }

    /// get end set
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }
    /// implementacao m
    @Override
    public void exibirPerfil() {

    }

    @Override
    public void atualizarDados() {

    }

    @Override
    public void visualizarConteudos() {

    }

    @Override
    public void ativarPremium() {

    }

    public void criarConteudo(){

    }
    public void gerenciarConteudo(){

    }
}
