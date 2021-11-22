package com.practica.cajablanca;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class TestSustituir {
    @Test
    @DisplayName("TestEditorNull")
    public void testEditorNull(){
        Editor editor = new Editor();

        editor.sustituirPalabra("hola", "adios");
        assertTrue(editor.editIsEmpty());
    }

    @Test
    @DisplayName("TestArchivoVacio")
    public void testArchivoVacio(){
        Editor editor = new Editor();

        editor.leerFichero("src/test/java/com/practica/cajablanca/TestSustituir/testArchivoVacio.txt");

        editor.sustituirPalabra("Hola", "adios");
        assertEquals(0, editor.size());
    }

    @Test
    @DisplayName("TestExistePalabra")
    public void testExistePalabra(){
        String palabraABuscar = "hola";
        String palabraSustituida = "adios";

        Editor editor = new Editor();
        Editor editor_referencia = new Editor();

        editor.leerFichero("src/test/java/com/practica/cajablanca/TestSustituir/testExistePalabra.txt");
        editor_referencia.leerFichero("src/test/java/com/practica/cajablanca/TestSustituir/testExistePalabra.txt");

        editor.sustituirPalabra(palabraABuscar, palabraSustituida);

        try{
            for (int i = 1; i < editor.size(); i++) {
                assertEquals(editor_referencia.getLinea(i).toString().replaceAll(palabraABuscar, palabraSustituida),
                        editor.getLinea(i).toString());
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Test
    @DisplayName("TestNoExistePalabra")
    public void testNoExistePalabra(){
        String palabraABuscar = "hola";
        String palabraSustituida = "adios";

        Editor editor = new Editor();
        Editor editor_referencia = new Editor();

        editor.leerFichero("src/test/java/com/practica/cajablanca/TestSustituir/testNoExistePalabra.txt");
        editor_referencia.leerFichero("src/test/java/com/practica/cajablanca/TestSustituir/testNoExistePalabra.txt");

        editor.sustituirPalabra(palabraABuscar, palabraSustituida);

        try{
            for (int i = 1; i < editor.size(); i++) {
                assertEquals(editor_referencia.getLinea(i).toString(), editor.getLinea(i).toString());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
