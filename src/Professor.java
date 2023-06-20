public class Professor extends Funcionario{

    String nivelGraduacao;
    String disciplina;
    int qtd_alunos;
    int qtd_turma;

    public Professor(String nome, int cpf, int nRegistro, String orgao_lotacao, double salario,
                     String nivelGraduacao, String disciplina, int qtd_alunos, int qtd_turma) {
        super(nome, cpf, nRegistro, orgao_lotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplina = disciplina;
        this.qtd_alunos = qtd_alunos;
        this.qtd_turma = qtd_turma;
    }



    public void adicionaTurma(){
        qtd_turma++;
    }


}
