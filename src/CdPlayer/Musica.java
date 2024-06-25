package CdPlayer;

public class Musica extends CD {

    String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuração() {
        return duração;
    }

    public void setDuração(float duração) {
        this.duração = duração;
    }

    float duração;
}
