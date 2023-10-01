package com.atv02n2;

import static org.junit.Assert.*;
import org.junit.Test;

public class LivroTest {
    @Test
    public void testVerificaLancamento() {
        Livro livro = new Livro("Java Fundamentals", 2023, "Autor X", "12345");
        assertTrue(livro.verificaLancamento());

        Livro livro2 = new Livro("Legacy Code", 2020, "Autor Y", "67890");
        assertFalse(livro2.verificaLancamento());
    }
}

