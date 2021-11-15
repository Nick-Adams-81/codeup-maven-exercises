import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;


public class CodeupCryptTests {



    @Test
    public void testIfVersionIsSet() {
        assertEquals(0.0, CodeupCrypt.version, 0);
        CodeupCrypt.version = 1.2;
        assertEquals(1.2, CodeupCrypt.version, 0);

    }

    @Test
    public void testHashPassword() {
        String password = "password";
        String expectedHash = "p4ssw0rd";

        String hashedPassword = CodeupCrypt.hashPassword(password);

        assertEquals("p13", CodeupCrypt.hashPassword("pie"));
        assertEquals(expectedHash, hashedPassword);

    }

    @Test
    public void testCheckPassword() {
        assertTrue("password hash is not the same. ", CodeupCrypt.checkPassword("Nick", "N1ck"));
        assertFalse(CodeupCrypt.checkPassword("nick", "nck"));
    }


}
