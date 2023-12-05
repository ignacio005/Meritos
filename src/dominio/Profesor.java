package dominio;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Profesor implements Serializable {
    protected ArrayList<Meritos> meritos = new ArrayList<>();
    protected String nombre;

    public Profesor(String nombre){
        meritos=new ArrayList<>();
        this.nombre=nombre;
    }

    public abstract double calcularValoracion();
    public Profesor annadirMerito(Meritos m){
        meritos.add(m);
        return this;
    }

    public boolean equals(Object obj){
        Profesor p = (Profesor) obj;
        return this.nombre.equals(p.nombre);
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre+ "\nMeritos: "+ meritos;
    }
}
