package dominio;

public abstract class Meritos {
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

    public abstract float valorar();

}
