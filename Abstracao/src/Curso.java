import java.util.ArrayList;

public class Curso extends Evento{

    public ArrayList<String> getAtividades() {
        return atividades;
    }

    public void setAtividades(ArrayList<String> atividades) {
        this.atividades = atividades;
    }

    private ArrayList<String> atividades;

    @Override
    public void contabilizarHoras() {
        System.out.println("Contabilizando horas de curso");
    }
}
