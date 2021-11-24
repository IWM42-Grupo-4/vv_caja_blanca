package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class pruebasnumPalabras {
    @DisplayName("Test para camino 1-2-3-1")
    @Test
    public void PruebanumPalabras() throws EmptyCollectionException, IllegalArgumentException {
        Editor editor = new Editor();
        editor.leerFichero("src/test/java/com/practica/cajablanca/TestnumPalabras/testEditorCorrecto.txt");
        assertThrows(IllegalArgumentException.class, () -> editor.numPalabras(-1, editor.size(), "adios"));
    }

    @DisplayName("Test para camino 1-2-4-5-1")
    @Test
    public void PruebanumPalabras1() throws EmptyCollectionException, IllegalArgumentException {
        Editor editor = new Editor();
        editor.leerFichero("src/test/java/com/practica/cajablanca/TestnumPalabras/testEditorCorrecto.txt");
        assertThrows(IllegalArgumentException.class, () -> editor.numPalabras(1, editor.size()+1, "adios"));
    }

    @DisplayName("Test para camino 1-2-4-6-7-21")
    @Test
    public void PruebanumPalabras2() throws EmptyCollectionException, IllegalArgumentException {
        Editor editor = new Editor();
        editor.leerFichero("src/test/java/com/practica/cajablanca/TestnumPalabras/testEditorVacio.txt");
        assertEquals(0, editor.numPalabras(1, editor.size(), "adios"));
    }

    @DisplayName("Test para camino 1-2-4-6-7-8-21")
    @Test
    public void PruebanumPalabras3() throws EmptyCollectionException, IllegalArgumentException {
        Editor editor = new Editor();
        editor.leerFichero("src/test/java/com/practica/cajablanca/TestnumPalabras/testEditorCorrecto.txt");
        assertEquals(0, editor.numPalabras(editor.size()+1, editor.size(), "adios"));
    }

    @DisplayName("Test para camino 1-2-4-6-7-8-9-10-11-18-8-21")
    @Test
    public void PruebanumPalabras4() throws EmptyCollectionException, IllegalArgumentException {
        Editor editor = new Editor();
        editor.leerFichero("src/test/java/com/practica/cajablanca/TestnumPalabras/testEditorVacio.txt");
        assertEquals(0, editor.numPalabras(1, editor.size(), "adios"));
    }

    @DisplayName("Test para camino 1-2-4-6-7-8-9-10-11-18-8-21")
    @Test
    public void PruebanumPalabras5() throws EmptyCollectionException, IllegalArgumentException {
        Editor editor = new Editor();
        editor.leerFichero("src/test/java/com/practica/cajablanca/TestnumPalabras/testEditorCorrecto.txt");
        assertEquals(2, editor.numPalabras(1, editor.size(), "adios"));
    }


}
