import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private static final SILab2 testLab2 = new SILab2();

    @Test
    void everyBranchMethod(){
        RuntimeException ex;
        ex=assertThrows(RuntimeException.class,
                ()-> testLab2.function(null,null));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        assertFalse(testLab2.function(new User(null,"fi123!","iva.makena@gmail.com"),
                Arrays.asList(new User("sofi.gr97@hotmail.com","mkdir123#","sofi.gr97@hotmail.com"),
                        new User("iva.makena@gmail.com","fi123!,","iva.makena@gmail.com"))));
        assertFalse(testLab2.function(new User("ivamakena","finki123*","iva.makena"), null));
        assertFalse(testLab2.function(new User("ivamakena","finki 123*","iva.makena"), null));
        assertFalse(testLab2.function(new User("ivamakena","finki12345","iva.makena"), null));
    }


    @Test
    void multipleConditionMethod(){
        RuntimeException ex;
        ex=assertThrows(RuntimeException.class,
                ()-> testLab2.function(null,null));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex=assertThrows(RuntimeException.class,
                ()-> testLab2.function(new User("iva",null,null),null));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex=assertThrows(RuntimeException.class,
                ()-> testLab2.function(new User("iva","finki123*",null),null));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        assertTrue(testLab2.function(new User("iva","finki123*","iva.makena@gmail.com"),
                Arrays.asList(new User("sofi.gr97@hotmail.com","mkdir123#","sofi.gr97@hotmail.com"),
                        new User("ivamakenadjieva","fi123!,","iva.mak@gmail.com"))));

    }

}