package presentacion;

import dominio.*;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Interfaz {
    private ArrayList<Profesor>profesores;
    private Scanner sc=new Scanner(System.in);
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
        System.out.println("Introduzca el nombre del profesor:");
        String nombre = sc.nextLine();
        profesores.add(new ProfesorTitular(nombre));

    }

    private void annadirCatedratico(){
        System.out.println("Introduzca el nombre del catedrático:");
        String nombre = sc.nextLine();
        profesores.add(new Catedratico(nombre));

    }

    private void annadirMerito(){
        System.out.println("Introduzca el nombre del catedrático:");
        String nombre = sc.nextLine();
        int n = profesores.indexOf(new ProfesorTitular(nombre));
        if(n<0){
            System.out.println("Profesor no encontrado");
        }
        System.out.println("Título del mérito: ");
        String titulo=sc.nextLine();
        System.out.println("Escoja tipo de mérito: ");
        System.out.println("1) Articulo");
        System.out.println("2) Proyecto");
        int opcion=sc.nextInt();
        if (opcion==1){
            System.out.println("Introduzca el impacto del articulo: ");
            double impacto = sc.nextDouble();
            sc.nextLine();
            profesores.get(n).annadirMerito(new Articulo(titulo,impacto));
        } else if (opcion==2) {
            System.out.println("Introduzca la financiación del proyecto: ");
            double financiacion = sc.nextDouble();
            sc.nextLine();
            profesores.get(n).annadirMerito(new Proyecto(titulo,financiacion));

        }else{
            System.out.println("Opción no disponible.");
        }

    }
}
