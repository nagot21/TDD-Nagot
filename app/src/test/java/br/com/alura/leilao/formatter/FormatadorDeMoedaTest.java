package br.com.alura.leilao.formatter;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by IanNagot on 17/10/2018
 */
public class FormatadorDeMoedaTest {

    @Test
    public void deve_formatarParaMoeda_QuandoRecebeValorDouble(){
        FormatadorDeMoeda formatadorDeMoeda = new FormatadorDeMoeda();

        String moedaFormatada = formatadorDeMoeda.formata(200.0);

        assertThat(moedaFormatada, is(equalTo("R$ 200,00")));
    }

}