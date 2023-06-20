import java.util.ArrayList;
import java.util.List;

public class TesteUniversidade {

    public static void main(String[] args) {

        Professor mateus = new Professor("Mateus",191,1,"facom",
                5000.00,"PHD","analise de algoritmos",50,3);
        Professor diemesleno = new Professor("diemesleno",911,2,"facom",
                10000,"PHD","sistemas distribuidoes",100,3);
        Professor karla = new Professor("Karla",911,3,"fageo",
                15000,"PHD","sensoriamento remoto",40,3);

        mateus.aumentoSalario(10);
        mateus.reembolsoDespesa(500);

        karla.aumentoSalario(10);
        karla.reembolsoDespesa(1000);


        List<Professor> profSup = new ArrayList<>();
        profSup.add(karla);
        profSup.add(diemesleno);


        Coordenador coordenadorMateus= new Coordenador(mateus.getNome(), mateus.getCpf(), mateus.getnRegistro(),
                mateus.getOrgao_lotacao(), mateus.getSalario(), profSup);

        coordenadorMateus.adicionaProfessor(karla);


        System.out.println(mateus);
        System.out.println(coordenadorMateus);

        Estagiario estagiario = new Estagiario("jaco",171,4,"facom",1000.0);
        estagiario.setBolsa(estagiario.getSalario());
        estagiario.setProfessor_responsavel(profSup);
        System.out.println(estagiario);




    }
}
