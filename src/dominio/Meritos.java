package dominio;

import java.io.Serializable;

public abstract class Meritos implements Serializable {
    protected String titulo;

    public Meritos(String titulo){
        this.titulo=titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract double valorar();

}
