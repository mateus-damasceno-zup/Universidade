import java.util.List;

public class Estagiario extends Funcionario{

    private List<Professor> professor_responsavel;
    private double bolsa;

    public Estagiario(String nome, int cpf, int nRegistro, String orgao_lotacao, double salario) {
        super(nome, cpf, nRegistro, orgao_lotacao, salario);
        salario = this.bolsa;
    }


    public List<Professor> getProfessor_responsavel() {
        return professor_responsavel;
    }

    public void setProfessor_responsavel(List<Professor> professor_responsavel) {
        this.professor_responsavel = professor_responsavel;
    }

    public double getBolsa() {

        return bolsa;
    }

    public void setBolsa(double bolsa) {

        this.bolsa = bolsa;
    }



    @Override
    public String toString() {
        return "Estagiario{" + getNome()+
                "}professor_responsavel=" + professor_responsavel +
                ", bolsa=" + bolsa +
                '}';
    }
}
