package com.mycompany.testesunitarios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

public class ProdutoTest {

    public ProdutoTest() {
    }

    @Test
    @DisplayName("Teste da função que pega o nome do produto, portanto retorna o nome (uma string).")
    public void testGetNome() {
        Produto pro = new Produto("Trident", 2.50);
        pro.getNome();
    }

    @Test
    @DisplayName("Teste da função que seta o nome do produto, setando o nome (uma string).")
    public void testSetNome() {
        Produto pro = new Produto("Trident", 2.50);
        pro.setNome(pro.nome);
    }

    @Test
    @DisplayName("Teste da função que pega o preço do produto, portanto retorna o preço (uma double)")
    public void testGetPreco() {
        Produto pro = new Produto("Trident", 2.50);
        pro.getPreco();
    }

    @Test
    @DisplayName("Teste da função que retorna o nome do produto, setando o preço (uma double).")
    public void testSetPreco() {
        Produto pro = new Produto("Trident", 2.50);
        pro.setPreco(pro.preco);
    }

}
