package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class pruebasmayorLongitud {
    @DisplayName("Test para camino 1-2-3-16")
    @Test
    public void PruebamayorLongitud() throws EmptyCollectionException{
        //SingleLinkedListImpl<String> lista1 = new SingleLinkedListImpl<String>();
        //SingleLinkedListImpl<String> lista2 = new SingleLinkedListImpl<String>();
        SingleLinkedListImpl<SingleLinkedListImpl<String>> e = new SingleLinkedListImpl<SingleLinkedListImpl<String>>();
        Editor editor = new Editor(e);
        assertEquals(null, editor.mayorLongitud());
    }

    @DisplayName("Test para camino 1-2-3-4-5-6-4-16")
    @Test
    public void PruebamayorLongitud1() throws EmptyCollectionException{
        SingleLinkedListImpl<String> lista1 = new SingleLinkedListImpl<String>("");
        SingleLinkedListImpl<String> lista2 = new SingleLinkedListImpl<String>("");
        SingleLinkedListImpl<SingleLinkedListImpl<String>> e = new SingleLinkedListImpl<SingleLinkedListImpl<String>>();
        Editor editor = new Editor(e);
        assertEquals(null, editor.mayorLongitud());
    }

    @DisplayName("Test para camino 1-2-3-4-5-6-7-8-9-6-4-16")
    @Test
    public void PruebamayorLongitud2() throws EmptyCollectionException{
        SingleLinkedListImpl<String> lista1 = new SingleLinkedListImpl<String>("hola");
        SingleLinkedListImpl<String> lista2 = new SingleLinkedListImpl<String>("");
        SingleLinkedListImpl<SingleLinkedListImpl<String>> e = new SingleLinkedListImpl<SingleLinkedListImpl<String>>(lista1, lista2);
        Editor editor = new Editor(e);
        assertEquals("hola", editor.mayorLongitud());
    }

    @DisplayName("Test para camino 1-2-3-4-5-6-7-8-10-6-4-16")
    @Test
    public void PruebamayorLongitud3() throws EmptyCollectionException{
        SingleLinkedListImpl<String> lista1 = new SingleLinkedListImpl<String>("hola", "uno");
        SingleLinkedListImpl<String> lista2 = new SingleLinkedListImpl<String>("ya");
        SingleLinkedListImpl<SingleLinkedListImpl<String>> e = new SingleLinkedListImpl<SingleLinkedListImpl<String>>(lista1, lista2);
        Editor editor = new Editor(e);
        assertEquals("hola", editor.mayorLongitud());
    }

    @DisplayName("Test para camino 1-2-3-4-5-6-7-8-10-11-6-4-16")
    @Test
    public void PruebamayorLongitud4() throws EmptyCollectionException{
        SingleLinkedListImpl<String> lista1 = new SingleLinkedListImpl<String>("hola", "uno");
        SingleLinkedListImpl<String> lista2 = new SingleLinkedListImpl<String>("coche");
        SingleLinkedListImpl<SingleLinkedListImpl<String>> e = new SingleLinkedListImpl<SingleLinkedListImpl<String>>(lista1, lista2);
        Editor editor = new Editor(e);
        assertEquals("coche", editor.mayorLongitud());
    }
}
