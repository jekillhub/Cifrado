package com.mycompany.cifrado.test;

import com.mycompany.cifrado.funciones.CifradoCesar;
import static junit.framework.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.Test;

public class CifradoCesarTest {
    
    @Ignore
    public void testEncode(){
    
        assertEquals("duurc", CifradoCesar.encode("arroz",3));
        assertEquals("shc", CifradoCesar.encode("pez", 3));
        assertEquals("fdeud", CifradoCesar.encode("cabra", 3));
    }
    
    @Test
    public void testDecode(){
        
        assertEquals("arroz", CifradoCesar.decode("duurc",3));
        assertEquals("pez", CifradoCesar.decode("shc", 3));
        assertEquals("cabra", CifradoCesar.decode("fdeud", 3));
        assertEquals("yyyy",CifradoCesar.decode("bbbb", 3));
        assertEquals("zzzz",CifradoCesar.decode("cccc", 3));
    
    }
    
}
