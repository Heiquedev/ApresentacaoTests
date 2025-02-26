package com.mycompany.testesunitarios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

public class calculadoraFaturasTest {

    public calculadoraFaturasTest() {
    }

    @Test
    @DisplayName("Teste da função que retorna o se a compra terá, ou não um desconto. "
            + "Retorna umas 'string' de 10% de desconto, se for maior que R$100, ou um aviso caso for menor.")
    public void testCalcfaturas() {
        calculadoraFaturas calc = new calculadoraFaturas();
        Produto pro = new Produto("Trident", 2.50);
        Carrinho car = new Carrinho();
        car.addItem(pro);
        calc.calcfaturas(car);
    }

}
