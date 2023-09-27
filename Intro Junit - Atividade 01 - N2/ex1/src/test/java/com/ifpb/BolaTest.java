package com.ifpb;

import org.junit.Test;

import static org.junit.Assert.*;

public class BolaTest {

    @Test
    public void testGetCor() {
        Bola bola = new Bola("vermelha");

        String cor = bola.getCor();

        assertEquals("vermelha", cor);
    }

    @Test
    public void testSetCor() {
        Bola bola = new Bola();

        bola.setCor("azul");

        String cor = bola.getCor();

        assertEquals("azul", cor);
    }
}
