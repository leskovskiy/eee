import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Notebook {

    private String name;

    private int amountRAM;
    private String opSystem;
    private int price;
    private String color;

    public Notebook(String name, int amountRAM, String opSystem, int price, String color) {
        this.name = name;
        this.amountRAM = amountRAM;
        this.opSystem = opSystem;
        this.price = price;
        this.color = color;
    }

    public boolean validateObject(){
        return true;
    }

    public static List<String> propertiesForFilter(){
        List<String> list = new ArrayList<>();
        list.add("amountRAM");
        list.add("opSystem");
        list.add("price");
        list.add("color");

        return list;

    }

    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "количество опретивной памяти:" + amountRAM +
                ", операционная система: " + opSystem + '\'' +
                ", цена: " + price +
                ", цвет: " + color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountRAM() {
        return amountRAM;
    }

    public void setAmountRAM(int amountRAM) {
        this.amountRAM = amountRAM;
    }

    public String getOperatingSystem() {
        return opSystem;
    }

    public void setOperatingSystem(String opSystem) {
        this.opSystem = opSystem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}