package br.com.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição de curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso JS");
        curso2.setDescricao("descrição de curso js");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1.toString());
        System.out.println(curso2.toString());

        System.out.println(mentoria.toString());*/

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEricklis = new Dev();
        devEricklis.setNome("Ericklis");
        devEricklis.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ericklis" + devEricklis.getConteudosInscritos());
        devEricklis.progredir();
        devEricklis.progredir();
        System.out.println("Conteúdos Inscritos Ericklis" + devEricklis.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Ericklis" + devEricklis.getConteudosConcluidos());
        System.out.println("XP:" + devEricklis.calcularTotalXp());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

    }
}
