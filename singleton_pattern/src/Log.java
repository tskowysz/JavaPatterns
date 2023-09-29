import java.time.Instant;

public class Log {

    private static Log instance;

    private Log() {
    }

    public static Log getLog(){
        return SingletonHolder.INSTANCE;
    }
    private static class SingletonHolder{
        private static final Log INSTANCE=new Log();
    }
    public void logToBase(){
        System.out.println("Log to base: "+ Instant.now());
    }
}
