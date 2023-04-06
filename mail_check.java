import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyClass {
    @Test
    public void testGmailSpecialCase() {
    emailAddress = "username+something@domain.com";
    emailPattern = "^(?=.{1,64}@)[A-Za-z0-9\\+_-]+(\\.[A-Za-z0-9\\+_-]+)*@" + "[^-][A-Za-z0-9\\+-]+(\\.[A-Za-z0-9\\+-]+)*(\\.[A-Za-z]{2,})$";
    assertTrue(EmailValidation.patternMatches(emailAddress, emailPattern));
  }
}
