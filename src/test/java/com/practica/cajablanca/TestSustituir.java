package com.practica.cajablanca;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class TestSustituir {
    @Test
    @DisplayName("TestEditorNull")
    public void testArchivoVacio(){
        Editor editor = new Editor();

        editor.leerFichero("src/test/java/com/practica/cajablanca/TestSustituir/testArchivoVacio.txt");
        editor.sustituirPalabra("hola", "adios");

        assertTrue(editor.editIsEmpty());
    }

    @Test
    @DisplayName("TestExistePalabra")
    public void testSoloPalabra(){
        Editor editor = new Editor();
        editor.leerFichero("src/test/java/com/practica/cajablanca/TestSustituir/testSoloPalabra.txt");
        editor.sustituirPalabra("hola", "adios");

        try{
            assertEquals("[adios]", editor.getLinea(1).toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
