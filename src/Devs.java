import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Devs {

    private String nome;
    private Set<Conteudo> conteudosEscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Boocamp boocamp){
        this.conteudosEscritos.addAll(boocamp.getConteudos());
        boocamp.getDevsInscritos().add(this);

    }
    public void progredir(){
        Optional<Conteudo>  conteudo = this.conteudosEscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosEscritos.remove(conteudo.get());
        }
        else {
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }



    }

    public int calcularTotalXp(){
        return  (int) this.conteudosConcluidos.stream().mapToDouble(conteudo -> conteudo.calcularXP()).sum();

    }

    public Set<Conteudo> getConteudosEscritos() {
        return conteudosEscritos;
    }

    public void setConteudosEscritos(Set<Conteudo> conteudosEscritos) {
        this.conteudosEscritos = conteudosEscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Devs devs = (Devs) o;
        return Objects.equals(nome, devs.nome) && Objects.equals(conteudosEscritos, devs.conteudosEscritos) && Objects.equals(conteudosConcluidos, devs.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosEscritos, conteudosConcluidos);
    }
}
