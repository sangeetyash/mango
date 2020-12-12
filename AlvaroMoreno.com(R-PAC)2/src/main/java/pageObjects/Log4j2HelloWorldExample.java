package pageObjects;
import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

//import com.itos.LogginHelperOps;
 
public class Log4j2HelloWorldExample 
{
    //private static final Logger LOGGER = LogManager.getLogger(Log4j2HelloWorldExample.class);
	final static Logger LOGGER = Logger.getLogger(Log4j2HelloWorldExample.class);

     
    public static void main(String[] args) 
    {
       // PropertyConfigurator.configure("log4j.properties");

        LOGGER.debug("Debug Message Logged !!");
        LOGGER.info("Info Message Logged !!");
        LOGGER.debug("Another Debug Message !!");
        System.out.println("End");
    }
}