import jakarta.naming.Context;
import jakarta.naming.InitialContext;
import jakarta.naming.NamingException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        try {
     
            Context ctx = new InitialContext(props);
            AdditionRemote remote = (AdditionRemote) ctx.lookup("ejb/AdditionRemote");
            System.out.println("Result: " + remote.add(10, 15));
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}

