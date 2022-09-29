package br.com.udemy.calculatorapp.service;

import br.com.udemy.calculatorapp.exception.UnsupportedMathOperationException;
import org.springframework.stereotype.Service;

import static java.lang.Double.parseDouble;

@Service
public class MathService {

    public Double sum(final String n1, final String n2) {
        validateNumbers(n1, n2);
        return parseDouble(n1) + parseDouble(n2);
    }

    public Double subtract(final String n1, final String n2) {
        validateNumbers(n1, n2);
        return parseDouble(n1) - parseDouble(n2);
    }

    public Double divide(final String n1, final String n2) {
        validateNumbers(n1, n2);
        return parseDouble(n1) / parseDouble(n2);
    }

    public Double multiply(final String n1, final String n2) {
        validateNumbers(n1, n2);
        return parseDouble(n1) * parseDouble(n2);
    }

    public Double square(final String n1) {
        validateNumbers(n1, "0");
        return Math.sqrt(parseDouble(n1));
    }

    public Double average(final String n1, final String n2) {
        validateNumbers(n1, n2);
        return (parseDouble(n1) + parseDouble(n2)) / 2;
    }

    private void validateNumbers(final String n1, final String n2) {
        if(isNotNumeric(n1) || isNotNumeric(n2)) {
            throw new UnsupportedMathOperationException("Valores enviados, não são numéricos: [" + n1 + "] - [" + n2 + "]");
        }
    }

    private boolean isNotNumeric(final String number) {
        if(number == null) return true;
        String numberSanitized = number.replaceAll(",", ".");
        return !numberSanitized.matches("[-+]?[0-9]*\\.?[0-9]+");

    }

}
