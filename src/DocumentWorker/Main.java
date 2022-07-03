package DocumentWorker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите свой ключ");
        Scanner in = new Scanner(System.in);
        String key = in.nextLine();

        DocumentWorker documentWorker;

        if (key.equals("")) {
            documentWorker = new DocumentWorker();
        } else if (key.equals("pro")) {
            documentWorker = new ProDocumentWorker();
        } else if (key.equals("exp")) {
            documentWorker = new ExpertDocumentWorker();
        } else {
            String errorMsg = "дич";
            System.out.println(errorMsg);
            throw new RuntimeException(errorMsg);
        }

        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();
    }
}
