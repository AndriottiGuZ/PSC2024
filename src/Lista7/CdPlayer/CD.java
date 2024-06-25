package Lista7.CdPlayer;

import java.util.ArrayList;

public class CD {

    public String getNomeDaBanda() {
        return nomeDaBanda;
    }

    public void setNomeDaBanda(String nomeDaBanda) {
        this.nomeDaBanda = nomeDaBanda;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLançamento() {
        return anoLançamento;
    }

    public void setAnoLançamento(int anoLançamento) {
        this.anoLançamento = anoLançamento;
    }

    public int getNumeroDeMusicas() {
        return numeroDeMusicas;
    }

    public void setNumeroDeMusicas(int numeroDeMusicas) {
        this.numeroDeMusicas = numeroDeMusicas;
    }

    public float getTempoTotalDoCD() {
        return tempoTotalDoCD;
    }

    public void setTempoTotalDoCD(float tempoTotalDoCD) {
        this.tempoTotalDoCD = tempoTotalDoCD;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    String nomeDaBanda;
    String titulo;
    int anoLançamento;
    int numeroDeMusicas = 20;
    float tempoTotalDoCD;
    ArrayList<Musica> musicas;
}
