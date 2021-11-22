package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class pruebasnumPalabras {
    @DisplayName("Test para camino 1-2-3-1")
    @Test
    public void PruebanumPalabras() throws EmptyCollectionException, IllegalArgumentException {
        SingleLinkedListImpl<String> lista1 = new SingleLinkedListImpl<String>("adios", "hola");
        SingleLinkedListImpl<String> lista2 = new SingleLinkedListImpl<String>("uno", "dos");
        SingleLinkedListImpl<SingleLinkedListImpl<String>> e = new SingleLinkedListImpl<SingleLinkedListImpl<String>>(lista1,lista2);
        Editor editor = new Editor(e);
        assertThrows(IllegalArgumentException.class, () -> editor.numPalabras(-1, editor.size(), "adios"));
    }

    @DisplayName("Test para camino 1-2-4-5-1")
    @Test
    public void PruebanumPalabras1() throws EmptyCollectionException, IllegalArgumentException {
        SingleLinkedListImpl<String> lista1 = new SingleLinkedListImpl<String>("adios", "hola");
        SingleLinkedListImpl<String> lista2 = new SingleLinkedListImpl<String>("uno", "dos");
        SingleLinkedListImpl<SingleLinkedListImpl<String>> e = new SingleLinkedListImpl<SingleLinkedListImpl<String>>(lista1,lista2);
        Editor editor = new Editor(e);
        assertThrows(IllegalArgumentException.class, () -> editor.numPalabras(1, editor.size()+1, "adios"));
    }

    @DisplayName("Test para camino 1-2-4-6-7-21")
    @Test
    public void PruebanumPalabras2() throws EmptyCollectionException, IllegalArgumentException {
        SingleLinkedListImpl<String> lista1 = new SingleLinkedListImpl<String>("");
        SingleLinkedListImpl<String> lista2 = new SingleLinkedListImpl<String>("");
        SingleLinkedListImpl<SingleLinkedListImpl<String>> e = new SingleLinkedListImpl<SingleLinkedListImpl<String>>();
        Editor editor = new Editor(e);
        assertEquals(0, editor.numPalabras(1, editor.size(), "adios"));
    }

    @DisplayName("Test para camino 1-2-4-6-7-8-21")
    @Test
    public void PruebanumPalabras3() throws EmptyCollectionException, IllegalArgumentException {
        SingleLinkedListImpl<String> lista1 = new SingleLinkedListImpl<String>("adios", "hola");
        SingleLinkedListImpl<String> lista2 = new SingleLinkedListImpl<String>("uno", "dos");
        SingleLinkedListImpl<SingleLinkedListImpl<String>> e = new SingleLinkedListImpl<SingleLinkedListImpl<String>>(lista1,lista2);
        Editor editor = new Editor(e);

        //editor = new SingleLinkedListImpl<AbstractSingleLinkedListImpl<String>("")>("");
        assertEquals(0, editor.numPalabras(editor.size()+1, editor.size(), "adios"));
    }

    @DisplayName("Test para camino 1-2-4-6-7-8-9-10-11-18-8-21")
    @Test
    public void PruebanumPalabras4() throws EmptyCollectionException, IllegalArgumentException {
        SingleLinkedListImpl<String> lista1 = new SingleLinkedListImpl<String>("");
        SingleLinkedListImpl<String> lista2 = new SingleLinkedListImpl<String>("uno");
        SingleLinkedListImpl<SingleLinkedListImpl<String>> e = new SingleLinkedListImpl<SingleLinkedListImpl<String>>(lista1,lista2);
        Editor editor = new Editor(e);

        //editor = new SingleLinkedListImpl<AbstractSingleLinkedListImpl<String>("")>("");
        assertEquals(0, editor.numPalabras(1, editor.size(), "adios"));
    }

    @DisplayName("Test para camino 1-2-4-6-7-8-9-10-11-18-8-21")
    @Test
    public void PruebanumPalabras5() throws EmptyCollectionException, IllegalArgumentException {
        SingleLinkedListImpl<String> lista1 = new SingleLinkedListImpl<String>("adios", "adios");
        SingleLinkedListImpl<String> lista2 = new SingleLinkedListImpl<String>("uno", "adios" );
        SingleLinkedListImpl<SingleLinkedListImpl<String>> e = new SingleLinkedListImpl<SingleLinkedListImpl<String>>(lista1,lista2);
        Editor editor = new Editor(e);

        //editor = new SingleLinkedListImpl<AbstractSingleLinkedListImpl<String>("")>("");
        assertEquals(3, editor.numPalabras(1, editor.size(), "adios"));
    }


}
