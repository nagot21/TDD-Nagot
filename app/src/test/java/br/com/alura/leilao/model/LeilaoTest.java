package br.com.alura.leilao.model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IanNagot on 12/10/2018
 */
public class LeilaoTest {

    @Test
    public void getDescricao() {
        // criar cenario de teste
        Leilao console = new Leilao("Console");

        // executar acao esperada
        String descricaoDevolvida = console.getDescricao();

        // testar resultado esperado
        assertEquals("Console", descricaoDevolvida);
    }
}