package com.atv02n2;

import static org.junit.Assert.*;
import org.junit.Test;

public class BibliotecaTest {
    @Test
    public void testPatrimonioHistorico() {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Antiga", "123456789", 1970);
        assertTrue(biblioteca.patrimonioHistorico());

        Biblioteca biblioteca2 = new Biblioteca("Biblioteca Moderna", "987654321", 1990);
        assertFalse(biblioteca2.patrimonioHistorico());
    }

    @Test
    public void testAcervoPremium() {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Livros Novos", "111111111", 1985);
        Livro livro1 = new Livro("Java Avançado", 2023, "Autor Z", "54321");
        Livro livro2 = new Livro("Python Essentials", 2024, "Autor W", "98765");
        Livro livro3 = new Livro("Legacy Code", 2020, "Autor Y", "67890");

        biblioteca.incluirLivro(livro1);
        biblioteca.incluirLivro(livro2);
        biblioteca.incluirLivro(livro3);

        assertTrue(biblioteca.acervoPremium());
    }
}
