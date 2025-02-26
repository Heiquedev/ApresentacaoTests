package com.mycompany.testesunitarios;

public class calculadoraFaturas {
    
public String calcfaturas(Carrinho deCompras){
    
    double valorTotal = deCompras.getTotal();
    if(valorTotal > 100.00){
        return "Sua compra alcançou mais de R$100.00, portanto seu desconto é igual a 10%.";
    }else{
        return "Sua compra foi menor que R$100.00, portanto perdeu 10% de desconto.";
    }
}
}
