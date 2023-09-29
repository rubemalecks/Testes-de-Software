package com.exerciciodeclasse;

import java.util.ArrayList;

public class Corretor {
    public int CRECI;
    public String nome;
    public ArrayList<Imovel> meusImoveis;

    public Corretor(){
        
    }

    public int getCRECI() {
        return CRECI;
    }

    public void setCRECI(int CRECI) {
        CRECI = CRECI;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Imovel> getMeusImoveis() {
        return meusImoveis;
    }

    public void setMeusImoveis(ArrayList<Imovel> meusImoveis) {
        this.meusImoveis = meusImoveis;
    }


    public void adicionaImovel(Imovel e) {
        this.meusImoveis.add(e);
    }

    public void removeImovel(Imovel e) {
        this.meusImoveis.remove(e);
    }
   
    public int quantidadeImoveis() {
        return this.meusImoveis.size();
    }


    public boolean vendedorEstrela() {
        int contador = 0;
        for (int i = 0; i < quantidadeImoveis(); i++) {
            Imovel im = meusImoveis.get(i);
            if (im.oportunidade()) {
                contador++;
            }
            return (contador >= 2);
        }
    }
}
