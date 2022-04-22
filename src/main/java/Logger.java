import java.util.Date;

public class Logger {
    protected int num = 1;

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        Date date = new Date();
        System.out.println("[" + date + " " + num++ + "] " + msg);
    }
}
