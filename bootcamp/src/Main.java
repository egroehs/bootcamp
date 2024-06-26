import java.time.LocalDate;

import main.java.br.com.dio.desafio.dominio.Bootcamp;
import main.java.br.com.dio.desafio.dominio.Curso;
import main.java.br.com.dio.desafio.dominio.Dev;
import main.java.br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java 2");
        curso2.setDescricao("Descricao 2");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descricao");
        bootcamp.getCoteudos().add(curso1);
        bootcamp.getCoteudos().add(curso2);
        bootcamp.getCoteudos().add(mentoria);

        Dev devEduarda = new Dev();
        devEduarda.setNome("Eduarda");
        devEduarda.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devEduarda.getConteudosInscritos());
        devEduarda.progredir();
        System.out.println("Conteudos concluidos" + devEduarda.getConteudosConcluidos());

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos concluidos" + devJoao.getConteudosConcluidos());

    }
}
