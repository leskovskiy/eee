import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Notebook 1", 8, "Windows10", 90000, "red"));
        set.add(new Notebook("Notebook 2", 8, "Windows10", 85000, "black"));
        set.add(new Notebook("Notebook 3", 32, "linux", 85000, "black"));
        set.add(new Notebook("Notebook 4", 8, "MacOS", 90000, "silver"));

        OperationWithNotebook operation = new OperationWithNotebook(set);
        operation.start();

    }
}