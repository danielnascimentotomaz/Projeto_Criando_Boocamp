import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();

        curso.setTitulo("Curso de java");
        curso.setDescricao("Descrição de curso de java");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new  Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria java");
        mentoria.setData(LocalDate.now());

        Boocamp boocampJava = new Boocamp();

        boocampJava.getConteudos().add(curso);
        boocampJava.getConteudos().add(mentoria);



       Devs daniel = new Devs();


       daniel.inscreverBootcamp(boocampJava);

       // Lista de conteudo do Boocamp de java

        System.out.println("Lista de conteudo do Boocamp de java:");
        for (Conteudo i : boocampJava.getConteudos()){
            System.out.println(i);
        }

        System.out.println("______________________________________________-------------------------------------------");





       /// Total de devs Escritos no boocamp de Java
        System.out.print("Total de devs Escritos no boocamp de Java: ");
        System.out.println(boocampJava.getDevsInscritos().size());

       System.out.println("______________________________________________-------------------------------------------");

       //Lista de conteudo escrito pelo dev daniel
        System.out.println("Lista de conteúdo escrito pelo dev daniel:");
        for (Conteudo u : daniel.getConteudosEscritos()){
            System.out.println(u);
        }

        System.out.println("______________________________________________-------------------------------------------");

       // Total de contúdo conluido pelo dev daniel
        System.out.println("Total de contúdo conluido pelo dev daniel");

        for (Conteudo x : daniel.getConteudosConcluidos()){
            System.out.println(x);
        }

        System.out.println("______________________________________________-------------------------------------------");

        // Total de contúdo conluido pelo dev daniel
        daniel.progredir();

        System.out.println("Total de contúdo conluido pelo dev daniel");

        for (Conteudo x : daniel.getConteudosConcluidos()){
            System.out.println(x);
        }

        // Total de XP
        System.out.println("______________________________________________-------------------------------------------");

        System.out.println("Total de XP do dev Daniel: " + daniel.calcularTotalXp());























    }
}