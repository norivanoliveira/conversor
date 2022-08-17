package br.com.moeda.conversor.business;

import br.com.moeda.conversor.constants.Cambio;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ConversorBO {
    public BigDecimal converter(BigDecimal valor){
        return valor.multiply(Cambio.CAMBIO_DOLAR);
    }
}
