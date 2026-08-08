package projeto;

public class Empresa extends Usuario{
    protected String cnpj;
    protected String razaoSocial;

    /// construtor
    public Empresa(long id, String nome, String email, String senha, String cnpj, String razaoSocial) {
        super(id, nome, email, senha);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public Empresa() {

    }

    /// get end set
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public void exibirInformacao(){

    }

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
}
