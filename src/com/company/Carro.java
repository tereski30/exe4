package com.company;

public class Carro {
    //atributos
    public String cor;
    public int ano;
    public String marca;
    public String modelo;
    public int potencia;
    public int veloAtual;
    public int qtdCombustivel;
    public int capacidadeTanque;

    //metodos
    public void acelerar(int increment){
        veloAtual = veloAtual + (potencia / 0.01);
        qtdCombustivel = qtdCombustivel - (potencia / 0.005);

    }

    public void abastecer(int qtd){
        if(qtdCombustivel <= capacidadeTanque){
            qtd = qtd + qtdCombustivel;
        }
    }
}
