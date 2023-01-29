package lesson_12.classTask;

import java.util.ArrayList;
import java.util.List;

public class MyPrints {
    public static void main(String[] args) {

        List<IPrintable> printableList = new ArrayList<>();
        printableList.add(new Book(56));
        printableList.add(new Book(250));
        printableList.add(new Magazine(350));
        printableList.add(new Magazine(450));

        IPrintable[] printables = new IPrintable[]{
                new Magazine(590),
                new Book(670)
        };

        for (IPrintable printable : printables) {
            printable.howManyPages(((Printable)printable).getPages());
            printable.printYourType();
        }


        printableList.forEach(printable -> {
            printable.howManyPages(((Printable)printable).getPages());
            printable.printYourType();
        });
    }
}
