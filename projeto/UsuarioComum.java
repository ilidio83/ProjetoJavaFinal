package projeto;

import java.util.Date;

public class UsuarioComum extends Usuario{
    protected Date dataCadastro;

    /// construtor
    public UsuarioComum(long id, String nome, String email, String senha, Date dataCadastro) {
        super(id, nome, email, senha);
        this.dataCadastro = dataCadastro;
    }

    public UsuarioComum() {

    }

    /// get end set
    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    ///
    public void visualizarConteudo(){
        System.out.println("conteudo");
    }

    ///implemetar metodods
    @Override
    public void exibirPerfil() {
        System.out.println(nome + "\n"  );
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
