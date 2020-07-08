package by.zercomp.library.model.generator;

public class IDGenerator {

    private IDGenerator() {
    }

    private static int bookCounter = 0;

    public static int generate() {
        return bookCounter++;
    }

}
