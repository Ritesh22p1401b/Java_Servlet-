import com.ritesh.AdditionRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting EJB client application...");

        try {
            System.out.println("Setting up JNDI properties...");
            Hashtable<String, String> env = new Hashtable<>();
            env.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
            env.put(Context.PROVIDER_URL, "http-remoting://localhost:8080"); // Change if needed
            System.out.println("Creating JNDI context...");
            Context context = new InitialContext(env);
            System.out.println("JNDI Context created successfully! Now performing lookup...");
            AdditionRemote calculator = (AdditionRemote) context.lookup("java:Ejb_application/Addition!com.ritesh.AdditionRemote");
            System.out.println("EJB Lookup successful! Calling methods...");
            int sum = calculator.add(10, 5);
//            System.out.println("Ritesh Pandey");
            System.out.println("Addition Result: " + sum);

        } catch (NamingException e) {
            System.err.println("JNDI NamingException occurred!");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("An unexpected error occurred!");
            e.printStackTrace();
        }
    }
}
