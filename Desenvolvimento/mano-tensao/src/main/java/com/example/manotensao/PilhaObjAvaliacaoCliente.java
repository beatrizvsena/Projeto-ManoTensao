package com.example.manotensao;

import com.example.manotensao.dominio.AvaliacaoCliente;

public class PilhaObjAvaliacaoCliente<T> {

    // Atributos
    private T[] pilha;
    private int topo;

    // Construtor
    public PilhaObjAvaliacaoCliente(int capacidade) {
        pilha = (T[]) new Object[capacidade];
        topo = -1;
    }

    // Métodos

    public Boolean isEmpty() {
        return topo == -1;

// A instrução acima equivale a esse bloco de instruções
//        if (topo == -1) {
//            return true;
//        }
//        else {
//            return false;
//        }
    }

    public Boolean isFull() {
        return topo == pilha.length-1;
    }

    public void push(AvaliacaoCliente info) {
        if (isFull()) {
            System.out.println("Pilha cheia!");
        }
        else {
//            topo++;
//            pilha[topo] = info;
            // as 2 instruções acima equivalem a esta abaixo:
            pilha[++topo] = (T) info;
        }
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
//        int retorno = pilha[topo];
//        topo--;
//        return retorno;

        return pilha[topo--];
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return pilha[topo];
    }

    public void exibe() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
        }
        else {
            for (int i = topo; i >= 0; i--) {
                System.out.println(pilha[i]);
            }
        }
    }
}
