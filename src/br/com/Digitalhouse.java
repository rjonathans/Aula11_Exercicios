package br.com;

import java.util.ArrayList;
import java.util.List;

public class Digitalhouse {
    public static void main(String[] args) {
       /* List<String> listaVazia = new ArrayList<>();

        listaVazia.add("Pato");
        listaVazia.add("Cachorro");
        listaVazia.add("Gato");

        try {
            System.out.println(listaVazia.get(3));

        } catch (IndexOutOfBoundsException ex) {
            System.out.println("IndexOutOfBoundsException");
        }*/

        try {

            List<String> lista = null;

            lista.add("Pato");
            lista.add("Cachorro");
            lista.add("Gato");

            System.out.println(lista.get(2));

        } catch (NullPointerException ex) {
            System.out.println("NullPointerException");
        }

        List<String> lista = new ArrayList<>();

        lista.add("Pato");
        lista.add("Cachorro");
        lista.add("Gato");

        try {

            System.out.println(lista.get(5));

        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
    }
}