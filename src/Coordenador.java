import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario{

    private List<Professor> professorSupervisionados;


    public Coordenador(String nome, int cpf, int nRegistro, String orgao_lotacao, double salario,
                       List<Professor> professorSupervisionados) {
        super(nome, cpf, nRegistro, orgao_lotacao, salario);
        this.professorSupervisionados = professorSupervisionados;

    }

    public List<Professor> getProfessorSupervisionados() {
        return professorSupervisionados;
    }

    public void setProfessorSupervisionados(List<Professor> professorSupervisionados) {
        this.professorSupervisionados = professorSupervisionados;
    }

    public void adicionaProfessor(Professor professor){

        professorSupervisionados.add(professor);
    }

    @Override
    public String toString() {
        return "Coordenador{" +getNome() +
                "}professorSupervisionados=" + professorSupervisionados +
                '}';
    }
}
