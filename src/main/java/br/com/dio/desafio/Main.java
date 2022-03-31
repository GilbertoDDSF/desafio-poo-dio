package br.com.dio.desafio;


import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descricao curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("descricao curso Js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());


/*        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGiba = new Dev();
        devGiba.setNome("Giba");
        devGiba.inscreverBotcamp(bootcamp);
        System.out.println("Conteudos Inscritos Giba" + devGiba.getConteudosInscritos());
        devGiba.progredir();
        devGiba.progredir();

        System.out.println("---");
        System.out.println("Conteudos Inscritos Giba" + devGiba.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Giba" + devGiba.getConteudosConcluidos());
        System.out.println("XP: "+ devGiba.calcularTotalXP());


        System.out.println("--------------------");


        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBotcamp(bootcamp);
        System.out.println("Conteudos Inscritos Jao" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("---");
        System.out.println("Conteudos Inscritos Jao" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Jao" + devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularTotalXP());


    }

}
