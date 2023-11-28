package dominio;

public class Articulo extends Meritos{
    protected double impacto;
    public Articulo(String titulo, double impacto){
        super(titulo);
        this.impacto=impacto;
    }

    public double valorar(){
        return impacto;
    }


}
