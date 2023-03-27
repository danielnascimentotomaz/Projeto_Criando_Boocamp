import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;


public class Boocamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial= LocalDate.now();

    private final LocalDate dataFinal= dataInicial.plusDays(45);

    private Set<Devs> devsInscritos = new HashSet<>();

    // Poderia criar uma lista separada EX: Uma lista para Mentoria e uma Lista Para Curso mais resolve criar uma lista só.
    private  Set<Conteudo> conteudos = new LinkedHashSet<>();



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }



    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Devs> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Devs> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boocamp boocamp = (Boocamp) o;
        return Objects.equals(nome, boocamp.nome) && Objects.equals(descricao, boocamp.descricao) && Objects.equals(dataInicial, boocamp.dataInicial) && Objects.equals(dataFinal, boocamp.dataFinal) && Objects.equals(devsInscritos, boocamp.devsInscritos) && Objects.equals(conteudos, boocamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
