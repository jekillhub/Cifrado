import com.mycompany.cifrado.funciones.CifradoCesar;
import static junit.framework.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.Test;

public class CifradoCesarTest {
    
    @Ignore
    public void testEncode(){
    
        CifradoCesar c =new CifradoCesar();
        
        assertEquals("duurc", c.encode("arroz",3));
        assertEquals("shc", c.encode("pez", 3));
        assertEquals("fdeud", c.encode("cabra", 3));
    }
    
    @Test
    public void testDecode(){
    
        CifradoCesar c = new CifradoCesar();
        
        assertEquals("arroz", c.decode("duurc",3));
        assertEquals("pez", c.decode("shc", 3));
        assertEquals("cabra", c.decode("fdeud", 3));
        
        //Problemas
        assertEquals("xxxx",c.decode("aaaa", 3));
        assertEquals("yyyy",c.decode("bbbb", 3));
        assertEquals("zzzz",c.decode("cccc", 3));
    
    }
    
}
