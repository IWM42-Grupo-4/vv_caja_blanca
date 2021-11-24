package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class pruebasmayorLongitud {
    @DisplayName("Test para camino 1-2-3-16")
    @Test
    public void PruebamayorLongitud() throws EmptyCollectionException{
        Editor editor = new Editor();
        assertEquals(null, editor.mayorLongitud());
    }

    @DisplayName("Test para camino 1-2-3-4-5-6-4-16")
    @Test
    public void PruebamayorLongitud1() throws EmptyCollectionException{
        Editor editor = new Editor();
        editor.leerFichero("src/test/java/com/practica/cajablanca/TestmayorLongitud/testEditorVacio.txt");
        assertEquals(null, editor.mayorLongitud());
    }

    @DisplayName("Test para camino 1-2-3-4-5-6-7-8-9-6-4-16")
    @Test
    public void PruebamayorLongitud2() throws EmptyCollectionException{
        Editor editor = new Editor();
        editor.leerFichero("src/test/java/com/practica/cajablanca/TestmayorLongitud/testEditorUnico.txt");
        assertEquals("hola", editor.mayorLongitud());
    }

    @DisplayName("Test para camino 1-2-3-4-5-6-7-8-10-6-4-16")
    @Test
    public void PruebamayorLongitud3() throws EmptyCollectionException{
        Editor editor = new Editor();
        editor.leerFichero("src/test/java/com/practica/cajablanca/TestmayorLongitud/testEditorCorrecto1.txt");
        assertEquals("hola", editor.mayorLongitud());
    }

    @DisplayName("Test para camino 1-2-3-4-5-6-7-8-10-11-6-4-16")
    @Test
    public void PruebamayorLongitud4() throws EmptyCollectionException{
        Editor editor = new Editor();
        editor.leerFichero("src/test/java/com/practica/cajablanca/TestmayorLongitud/testEditorCorrecto2.txt");
        assertEquals("coche", editor.mayorLongitud());
    }
}
