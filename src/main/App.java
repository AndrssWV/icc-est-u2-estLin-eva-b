package main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        LogicaClasificacion logica = new LogicaClasificacion();
        Queue<Integer> cola1 = new LinkedList<>(Arrays.asList(1, 3, 5));
        Queue<Integer> cola2 = new LinkedList<>(Arrays.asList(2, 4, 6));
        Queue<Integer> esperado = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(logica.intercalarColas(cola1, cola2));
        cola1 = new LinkedList<>(Arrays.asList(10, 20));
        cola2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        esperado = new LinkedList<>(Arrays.asList(10, 1, 20, 2, 3, 4));
        System.out.println(logica.intercalarColas(cola1, cola2));
        cola1 = new LinkedList<>();
        cola2 = new LinkedList<>(Arrays.asList(7, 8));
        esperado = new LinkedList<>(Arrays.asList(7, 8));
        System.out.println(logica.intercalarColas(cola1, cola2));
        cola1 = new LinkedList<>();
        cola2 = new LinkedList<>();
        esperado = new LinkedList<>();
        System.out.println(logica.intercalarColas(cola1, cola2));
    }
}
