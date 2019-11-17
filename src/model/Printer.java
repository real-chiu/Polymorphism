package src.model;

public class Printer {
    public final String identity;

    public Printer () {
        identity = "I am a printer";
    }

    public String getIdentity() {
        return identity;
    }

    public void printing () {
        System.out.println("Printer Printing....");
    }
}
