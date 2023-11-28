package dominio;

public class ProfesorTitular extends Profesor{
    public ProfesorTitular(String nombre){
        super(nombre);
    }
    public double calcularValoracion() {
        if (meritos.size() == 0) {
            return 0.0;
        } else {
            double suma = 0;
            for (Meritos m : meritos) {
                suma += m.valorar();
            }
            return suma / meritos.size();
        }
    }
}
