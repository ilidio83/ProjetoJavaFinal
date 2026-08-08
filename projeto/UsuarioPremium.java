package projeto;

import java.util.Date;

public class UsuarioPremium extends UsuarioComum implements Monetizavel{
    private Date dataInicioPremio;
    private Date dataFimPremio;

    /// construtor
    public UsuarioPremium(long id, String nome, String email, String senha, Date dataCadastro, Date dataInicioPremio, Date dataFimPremio) {
        super(id, nome, email, senha, dataCadastro);
        this.dataInicioPremio = dataInicioPremio;
        this.dataFimPremio = dataFimPremio;
    }

    public UsuarioPremium() {
        super();
    }

    /// get end set
    public Date getDataInicioPremio() {
        return dataInicioPremio;
    }

    public void setDataInicioPremio(Date dataInicioPremio) {
        this.dataInicioPremio = dataInicioPremio;
    }

    public Date getDataFimPremio() {
        return dataFimPremio;
    }

    public void setDataFimPremio(Date dataFimPremio) {
        this.dataFimPremio = dataFimPremio;
    }
    /// implementacao m
    public UsuarioPremium(long id, String nome, String email, String senha, Date dataCadastro) {
        super(id, nome, email, senha, dataCadastro);
    }

    @Override
    public void atualizarDados() {
        super.atualizarDados();
    }

    @Override
    public void exibirPerfil() {
        super.exibirPerfil();
    }

    @Override
    public void visualizarConteudo() {
        super.visualizarConteudo();
    }

    @Override
    public void setDataCadastro(Date dataCadastro) {
        super.setDataCadastro(dataCadastro);
    }

    @Override
    public Date getDataCadastro() {
        return super.getDataCadastro();
    }

    @Override
    public void ativarMonetizacao() {

    }

    @Override
    public void desativarMonetizacao() {

    }
}
