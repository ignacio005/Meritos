package dominio;

import static java.lang.Math.pow;

public class Catedratico extends Profesor{

    public Catedratico(String nombre){
        super(nombre);
    }

    @Override
    public double calcularValoracion() {
        return 0;
    }

    public double valorar(){
        double suma=0;
        for(Meritos m: meritos){
            suma+=pow(m.valorar(),2);

        }
        return Math.pow(suma/4,0.5);
    }
}
