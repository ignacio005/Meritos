package dominio;

import static java.lang.Math.pow;

public class Catedratico extends Profesor{

    public Catedratico(String nombre){
        super(nombre);
    }

    public double valorar(){
        float suma=0;
        for(Meritos m: meritos){
            suma+=pow(m.valorar(),2);

        }
        return Math.pow(suma/4,0.5);
    }
}
