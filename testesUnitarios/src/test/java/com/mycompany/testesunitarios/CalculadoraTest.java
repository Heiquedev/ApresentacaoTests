package com.mycompany.testesunitarios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Aluno
 */
public class CalculadoraTest {

    public CalculadoraTest() {
    }

    @Test
    public void testSomar() {
        Calculadora cal = new Calculadora();
        int resultado = cal.soma(4, 4);
        assertEquals(8, resultado, "A soma de 4 e 4 deve ser 8.");
    }

    @Test
    public void testSubtrair() {
        Calculadora cal = new Calculadora();
        int resultado = cal.sub(5, 4);
        assertEquals(1, resultado, "A subtração de 5 e 4 deve ser 1.");
    }

    @Test
    public void testMultiplicar() {
        Calculadora cal = new Calculadora();
        int resultado = cal.mult(4, 4);
        assertEquals(16, resultado, "A Multiplição de 4 e 4 deve ser 16.");
    }

    @Test
    public void testDivisao() {
        Calculadora cal = new Calculadora();
        int resultado = cal.div(4, 4);
        assertEquals(2, resultado, "A divisão de 8 e 4 deve ser 2.");
    }

    @Test
    public void testDivisaoPor0() {
        Calculadora cal = new Calculadora();
        int resultado = cal.div(10, 0);
        assertThrows(ArithmeticException.class, () -> cal.div(10, 0), "Deveria lançar uma exceção ao dividir por zero");
    }
}
