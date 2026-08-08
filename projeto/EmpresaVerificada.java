package projeto;

import java.util.Date;

public class EmpresaVerificada extends Empresa{
    private Date dataVerificao;

    /// construtor
    public EmpresaVerificada(long id, String nome, String email, String senha, String cnpj, String razaoSocial, Date dataVerificao) {
        super(id, nome, email, senha, cnpj, razaoSocial);
        this.dataVerificao = dataVerificao;
    }

    public EmpresaVerificada() {
        super();
    }

    ///get end set
    public Date getDataVerificao() {
        return dataVerificao;
    }

    public void setDataVerificao(Date dataVerificao) {
        this.dataVerificao = dataVerificao;
    }

    public void selarVerificao(){

    }

}
