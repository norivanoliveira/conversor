package br.com.moeda.conversor.rest;

import br.com.moeda.conversor.business.ConversorBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class ConversorMoedaRestController {

    @Autowired
    ConversorBO conversorBO;

    @RequestMapping(value = "/converter", method = RequestMethod.GET)
    public BigDecimal converter(BigDecimal valor)    {

        return conversorBO.converter(valor);
    }


}
