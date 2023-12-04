package presentacion;

import dominio.Profesor;

import java.util.ArrayList;
import java.io.*;

public class Interfaz {
    private ArrayList<Profesor>profesores;
    public Interfaz(){
        leer();
        grabar();
    }

    private void leer() {
        ObjectInputStream obj;
        File file = new File("meritos.txt");
        try {
            obj = new ObjectInputStream(new FileInputStream(file));
            try {
                profesores = (ArrayList<Profesor>)obj.readObject();
            } catch (Exception e) {
                System.out.println(e);
            }
            obj.close();
            System.out.println("leido");
        } catch (Exception e) {
            System.out.println("no leido");
            profesores = new ArrayList<>();
        }
        ;
    }
    private void grabar(){
        ObjectOutputStream obj;
        File file = new File("contactos.txt");
        try{
            obj = new ObjectOutputStream(new FileOutputStream(file));
            obj.writeObject(profesores);
            obj.close();
            System.out.println("Guardado");
        } catch(Exception e){
            System.out.println("Error al guardar");
            System.out.println(e);
        };
    }
    private void annadirProfesorTitular(){
        System.out.println("");
    }
}
