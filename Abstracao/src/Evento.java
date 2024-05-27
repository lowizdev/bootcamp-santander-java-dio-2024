import java.util.ArrayList;

public abstract class Evento {

    private String nome;

    private String ministrante;

    private String tema;

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    private int duracaoEmSegundos;

    private ArrayList<Dev> devsParticipantes;

    public boolean adicionarParticipante(Dev desenvolvedor){
        this.devsParticipantes.add(desenvolvedor);
        return true;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMinistrante() {
        return ministrante;
    }

    public void setMinistrante(String ministrante) {
        this.ministrante = ministrante;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public abstract void contabilizarHoras();
}
