import java.util.List;

public abstract class Funcionario implements IFuncionario {
    private String nome;
    private int cpf;
    private int nRegistro;
    private String orgao_lotacao;
    private double salario;

    public Funcionario(String nome, int cpf, int nRegistro, String orgao_lotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.nRegistro = nRegistro;
        this.orgao_lotacao = orgao_lotacao;
        this.salario = salario;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getnRegistro() {
        return nRegistro;
    }

    public void setnRegistro(int nRegistro) {
        this.nRegistro = nRegistro;
    }

    public String getOrgao_lotacao() {
        return orgao_lotacao;
    }

    public void setOrgao_lotacao(String orgao_lotacao) {
        this.orgao_lotacao = orgao_lotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double reembolsoDespesa(double despesa){
        double reembolso = getSalario()+despesa;
        setSalario(reembolso);
        return reembolso;
    }


    public double aumentoSalario(double aumento) {
        double novoSalario = getSalario() * (1+(aumento/100));
        setSalario(novoSalario);
        return novoSalario;
    }

    public double aumentoBolsa(double aumento) {
        double novoSalario = getSalario() * (1+(aumento/100));
        setSalario(novoSalario);
        return novoSalario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", nRegistro=" + nRegistro +
                ", orgao_lotacao='" + orgao_lotacao + '\'' +
                ", salario=" + salario +
                '}';
    }
}
