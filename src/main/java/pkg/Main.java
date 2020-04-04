package pkg;

import org.tinylog.Logger;

public class Main {

    public static void main(String[] args) {

        Logger.error("This is an error massage!");
        Logger.warn("This is a warn massage!");
        Logger.info("This is an info massage!");
        Logger.debug("This is a debug massage!");
        Logger.trace("This is a trace massage!");
        Logger.info("User's name is {}", System.getProperty("user.name"));
        Logger.error(new RuntimeException("Oops"), "Something went wrong!");
    }
}
