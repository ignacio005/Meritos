package dominio;

public class Proyecto extends Meritos{

    protected float financiacion;
    public Proyecto(String titulo, float financiacion){
        super(titulo);
        this.financiacion = financiacion;
    }

    public float valorar(){
        return financiacion/100000;
    }

}
