package src.model;

public class BlackWhitePrinter extends Printer {

    public String color;

    public BlackWhitePrinter (String color) {
        super();
        this.color = color;
    }
    @Override
    public void printing () {
        System.out.println("Black and White Printing with color: " + color);
    }
}

