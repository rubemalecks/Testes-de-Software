package com.ex2;

public class Calculadora {
    // atributo
    private int resultado = 0;

    // método somar
    public double somar(int a, int b) {
        resultado = a + b;
        return resultado;
    }

    // método subtrair
    public double subtrair(int a, int b) {
        resultado = a - b;
        return resultado;
    }

}
