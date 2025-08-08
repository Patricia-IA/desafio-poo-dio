import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPatricia = new Dev();
        devPatricia.setNome("Patricia");
        devPatricia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Patricia" + devPatricia.getConteudosInscritos());
        devPatricia.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Patricia" + devPatricia.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Patricia" + devPatricia.getConteudosConcluidos());
        System.out.println("XP:" + devPatricia.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joao" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Joao" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Joao" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());







    }
}
