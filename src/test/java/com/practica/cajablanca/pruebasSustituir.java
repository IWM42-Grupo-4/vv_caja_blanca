package com.practica.cajablanca;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class pruebasSustituir {
    @Test
    @DisplayName("TestVacio")
    public void TestVacio(){
        Editor editor = new Editor();

        editor.leerFichero("src/test/java/com/practica/cajablanca/TestSustituir/testVacio.txt");

        editor.sustituirPalabra("hola", "adios");
        assertTrue(editor.editIsEmpty());
    }



    @Test
    @DisplayName("TestNoHayPalabra")
    public void TestNoHayPalabra(){
        Editor editor = new Editor();
        Editor editor_referencia = new Editor();

        editor_referencia.leerFichero("src/test/java/com/practica/cajablanca/TestSustituir/testNoExistePalabra.txt");

        editor.leerFichero("src/test/java/com/practica/cajablanca/TestSustituir/testNoExistePalabra.txt");
        editor.sustituirPalabra("hola", "adios");

        boolean equals = true;

        try{
            for (int i = 1; i < editor_referencia.size(); i++) {
                if (!editor_referencia.getLinea(i).toString().equals(editor.getLinea(i).toString()))
                        equals = false;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        assertTrue(equals);
    }

    @Test
    @DisplayName("TestExistePalabra")
    public void testExistePalabra(){
        Editor editor = new Editor();
        Editor editor_referencia = new Editor();

        editor_referencia.leerFichero("src/test/java/com/practica/cajablanca/TestSustituir/testExistePalabraCambiado.txt");

        editor.leerFichero("src/test/java/com/practica/cajablanca/TestSustituir/testExistePalabra.txt");
        editor.sustituirPalabra("hola", "adios");

        boolean equals = true;

        try{
            for (int i = 1; i < editor_referencia.size(); i++) {
                if (!editor_referencia.getLinea(i).toString().equals(editor.getLinea(i).toString()))
                    equals = false;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        assertTrue(equals);
    }

    @Test
    @DisplayName("TestSoloPalabra")
    public void testSoloPalabra(){
        Editor editor = new Editor();
        Editor editor_referencia = new Editor();

        editor_referencia.leerFichero("src/test/java/com/practica/cajablanca/TestSustituir/testSoloPalabraCambiado.txt");

        editor.leerFichero("src/test/java/com/practica/cajablanca/TestSustituir/testSoloPalabra.txt");
        editor.sustituirPalabra("hola", "adios");

        boolean equals = true;

        try{
            for (int i = 1; i < editor_referencia.size(); i++) {
                if (!editor_referencia.getLinea(i).toString().equals(editor.getLinea(i).toString()))
                    equals = false;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        assertTrue(equals);
    }
}
