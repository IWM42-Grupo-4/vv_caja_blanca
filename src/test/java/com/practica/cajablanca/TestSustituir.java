package com.practica.cajablanca;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class TestSustituir {
    @Test
    @DisplayName("TestVacio")
    public void testVacio(){
        Editor editor = new Editor();

        editor.sustituirPalabra("hola", "adios");
        assertTrue(editor.editIsEmpty());
    }

    @Test
    @DisplayName("TestArchivoVacio")
    public void testArchivoVacio(){
        Editor editor = new Editor();

        editor.leerFichero("src/test/java/com/practica/cajablanca/testArchivoVacio.txt");

        editor.sustituirPalabra("Hola", "adios");
        assertEquals(0, editor.size());
    }
}
