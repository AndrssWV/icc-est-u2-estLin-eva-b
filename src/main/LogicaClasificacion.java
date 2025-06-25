package main;

import java.util.*;

public class LogicaClasificacion {

    /**
     * Invierte el contenido de una cola de nombres utilizando una pila auxiliar.
     * 
     * Ejemplo:
     * Entrada: ["Ana", "Luis", "Pedro"]
     * Salida: ["Pedro", "Luis", "Ana"]
     *
     * @param cola cola original de nombres
     * @return nueva cola con los nombres en orden invertido
     */
    public Queue<String> invertirColaNombres(Queue<String> cola) {
        LinkedList<String> names = new LinkedList<>();
        Stack<String> s = new Stack<>();
        while (!cola.isEmpty()) s.push(cola.poll());
        while (!s.isEmpty()) names.add(s.pop());
        return names; // Simulación de resultado
    }

    /**
     * Intercala los elementos de dos colas en una nueva.
     * Si una cola tiene más elementos, se añaden al final.
     * 
     * Ejemplo:
     * Entrada:
     * cola1: [1, 3, 5]
     * cola2: [2, 4, 6, 8]
     * Salida:
     * [1, 2, 3, 4, 5, 6, 8]
     *
     * @param cola1 primera cola
     * @param cola2 segunda cola
     * @return nueva cola con elementos intercalados
     */
    public Queue<Integer> intercalarColas(Queue<Integer> cola1, Queue<Integer> cola2) {
        Queue<Integer> q = new ArrayDeque<>();
        if (cola2.size()>=cola1.size()) {
            while (!cola2.isEmpty()) {
                if (!cola1.isEmpty()) q.add(cola1.poll());
                if (!cola2.isEmpty()) q.add(cola2.poll());
            }
        } else {
            while (!cola1.isEmpty()) {
                if (!cola2.isEmpty()) q.add(cola2.poll());
                if (!cola1.isEmpty()) q.add(cola1.poll());
            }
        }
        return q; // Simulación de resultado
    }

}
