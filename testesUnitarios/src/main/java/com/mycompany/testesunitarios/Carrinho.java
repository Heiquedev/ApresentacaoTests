package com.mycompany.testesunitarios;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Produto> carrinho = new ArrayList<Produto>();

    public Carrinho() {
    }

    public ArrayList<Produto> getItens() {
        return carrinho;
    }

    public void addItem(Produto item) {
        this.carrinho.add(item);

    }

    public double getTotal() {
        return this.carrinho.stream().mapToDouble(Produto::getPreco).reduce(0.0, Double::sum);
    }

}
