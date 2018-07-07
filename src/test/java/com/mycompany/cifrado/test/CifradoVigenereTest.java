package com.mycompany.cifrado.test;

import com.mycompany.cifrado.funciones.CifradoVigenere;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class CifradoVigenereTest {
    
    @Ignore
    public void testEncode(){
    
        assertEquals("aolxd",CifradoVigenere.encode("paris", "loupl"));
        assertEquals("priwr", CifradoVigenere.encode("arroz","paris"));
        assertEquals("ayrzsci",CifradoVigenere.encode("jugazor", "relztor"));
    
    }
    
    @Test 
    public void testDecode(){
    
        assertEquals("paris",CifradoVigenere.decode("aolxd", "loupl"));
        assertEquals("arroz", CifradoVigenere.decode("priwr","paris"));
        assertEquals("jugazor",CifradoVigenere.decode("ayrzsci", "relztor"));
        
    
    }
    
}
