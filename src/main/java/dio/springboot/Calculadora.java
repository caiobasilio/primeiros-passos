package dio.springboot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

    public int soma(int primeiroNumero, int segundoNumero) {
        return primeiroNumero + segundoNumero;
    }
}
