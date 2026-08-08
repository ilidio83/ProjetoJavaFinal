package projeto;

public abstract class Usuario {
    protected long id;
    protected String nome;
    protected String email;
    protected String senha;

    /// construtor
    public Usuario(long id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Usuario() {

    }

    /// get end set
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    /// metodods
    public abstract void exibirPerfil();
    public abstract void atualizarDados();

    public abstract void visualizarConteudos();

    public abstract void ativarPremium();
}
