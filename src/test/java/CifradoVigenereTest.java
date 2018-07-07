package com.mycompany.cifrado.test;

import com.mycompany.cifrado.funciones.CifradoVigenere;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class CifradoVigenereTest {
    
    @Ignore
    public void testEncode(){
    
        assertEquals("aolxd",CifradoVigenere.encode("paris", "loupl"));
    
    }
    
    @Test 
    public void testDecode(){
    
        assertEquals("paris",CifradoVigenere.decode("aolxd", "loupl"));
    
    }
    
}
