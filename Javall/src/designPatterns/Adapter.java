package designPatterns;
/*
The Adapter Design Pattern is a structural pattern that allows objects with incompatible interfaces to work together.
 It acts as a bridge between two interfaces.
 */
class LegacyPrinter {
    public void printLegacy(String message) {
        System.out.println("Legacy Printer: " + message);
    }
}

interface Printer {
    void print(String message);
}

class PrinterAdapter implements Printer {
    private LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    public void print(String message) {
        legacyPrinter.printLegacy(message); // adapting call
    }
}

public class Adapter {
    public static void main(String[] args) {
        LegacyPrinter legacy = new LegacyPrinter();
        Printer printer = new PrinterAdapter(legacy);

        printer.print("Hello via Adapter!"); // Output: Legacy Printer: Hello via Adapter!
    }
}
