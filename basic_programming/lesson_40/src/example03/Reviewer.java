package example03;

import java.util.Scanner;

/**
 * 6/28/2023
 * cohort27
 *
 * Проверять документы из реестра
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Reviewer {
    // проверяет все документы из documentsRegistry
    public static <T> ReviewedDocument<T>[] reviewAll(DocumentsRegistry<T> documentsRegistry) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < documentsRegistry.count; i++) {
            System.out.println("Enter review for - " + documentsRegistry.items[i]);
            String review = scanner.nextLine();
        }

        return null;
    }
}
