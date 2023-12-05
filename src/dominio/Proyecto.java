package dominio;

public class Proyecto extends Meritos{

    protected double financiacion;
    public Proyecto(String titulo, double financiacion){
        super(titulo);
        this.financiacion = financiacion;
    }

    public double valorar(){
        return financiacion/100000;
    }

    @Override
    public String toString() {
        return super.toString() + "Financiacion: " + financiacion;
    }
}
