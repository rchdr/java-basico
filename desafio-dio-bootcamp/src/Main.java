import br.com.dio.desafio.dominio.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(5);
        curso1.setTitulo("Curso 1");
        curso1.setDescricao("Descrição Curso 1");
        Curso  curso2= new Curso();
        curso2.setTitulo("Curso 2");
        curso2.setDescricao("Descrição Curso 2");
        curso2.setCargaHoraria(2);
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria 1");
        mentoria1.setDescricao("Descrição Mentoria 1");
        mentoria1.setData(LocalDate.of(2024, 12, 15));

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Desafio Java");
        bootcamp.setDescricao("Objeto Bootcamp criado para praticar POO");
        bootcamp.setConteudos(curso1);
        bootcamp.setConteudos(curso2);
        bootcamp.setConteudos(mentoria1);
        System.out.println(bootcamp.getConteudos());

        Dev dev1 = new Dev();
        dev1.setNome("Dev 1");
        Dev dev2 = new Dev();
        dev2.setNome("Dev 2");

        dev1.inscreverBootcamp(bootcamp);
        dev2.inscreverBootcamp(bootcamp);

        System.out.println(dev1.getConteudosConcluidos());

        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos concluídos pelo dev1: " + dev1.getConteudosConcluidos());
        
        
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos concluídos pelo dev2: " + dev2.getConteudosConcluidos());



    }
}
