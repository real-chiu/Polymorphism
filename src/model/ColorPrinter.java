package src.model;

public class ColorPrinter extends Printer {

    public String color;

    public ColorPrinter(String color) {
        super();
        this.color = color;
    }

    @Override
    public void printing() {
        System.out.println("Color printer Printing with color: " + color);
    }
}