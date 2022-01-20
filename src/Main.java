import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Abstraindo um bootcamp com Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Abstraindo um bootcamp com C#");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria do Curso Java POO");
        mentoria.setDescricao("Aprofundando em POO com Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Abstraindo um Bootcamp usando Orientação a Objetos em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLeonei = new Dev();
        devLeonei.setNome("Leonei");
        devLeonei.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Leonei:" + devLeonei.getConteudosInscritos());
        devLeonei.progredir();
        devLeonei.progredir();
        System.out.println("<********************************************************>");
        System.out.println("Conteúdos inscritos Leonei:" + devLeonei.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Leonei:" + devLeonei.getConteudosConcluido());
        System.out.println("XP: " + devLeonei.calcularTotalXp());

        System.out.println("<===========================================================>");

        Dev devLiliane = new Dev();
        devLiliane.setNome("Liliane");
        devLiliane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Liliane:" + devLiliane.getConteudosInscritos());
        devLiliane.progredir();
        devLiliane.progredir();
        devLiliane.progredir();
        System.out.println("<************************************************************>");
        System.out.println("Conteúdos inscritos Liliane:" + devLiliane.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Liliane:" + devLiliane.getConteudosConcluido());
        System.out.println("XP: " + devLiliane.calcularTotalXp());

    }
}
