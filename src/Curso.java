public class Curso  extends Conteudo{

    private int cargaHoraria;



    @Override
    public double calcularXP() {
        return XP * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo = " + getTitulo() +
                " Descrição =" + getDescricao() +
                " TotalXp = " + calcularXP() +
                " CargaHoraria =" + cargaHoraria +
                '}';
    }
}
