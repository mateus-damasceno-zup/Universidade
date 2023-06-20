public class Funcionaro_Administrativo extends Funcionario{

    String funcaoAdministrativa;
    String senioridade;

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    public Funcionaro_Administrativo(String nome, int cpf, int nRegistro, String orgao_lotacao,
                                     double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, cpf, nRegistro, orgao_lotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }


}
