import com.rfoliveira.dominio.Bootcamp;
import com.rfoliveira.dominio.Curso;
import com.rfoliveira.dominio.Dev;
import com.rfoliveira.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        curso1.setTitulo("Curso de java");
        curso1.setDescricao("Curso de Java inicante e avançado");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso de JS");
        curso2.setDescricao("Curso de Java Script inicante e avançado");
        curso2.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Aprenda com especialistas");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp desenvolvendo APIs Java com Spring-Boot");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev rodrigo = new Dev();
        rodrigo.setNome("Rodrigo");
        rodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscrito de Rodrigo: "+rodrigo.getConteudosInscritos());
        rodrigo.progredir();
        rodrigo.progredir();
        System.out.println("Progrediu");
        System.out.println("Conteudo Inscrito de Rodrigo: "+rodrigo.getConteudosInscritos());
        System.out.println("Conteudo Concluido de Rodrigo: "+rodrigo.getConteudosConcluidos());
        System.out.println("XP de Rodrigo: "+rodrigo.calcularTotalXp());

        System.out.println("*********************");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscrito de João: "+devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Progrediu");
        System.out.println("Conteudo Inscrito de João: "+devJoao.getConteudosInscritos());
        System.out.println("Conteudo Concluido de João: "+devJoao.getConteudosConcluidos());
        System.out.println("XP de João: "+devJoao.calcularTotalXp());

    }
}
