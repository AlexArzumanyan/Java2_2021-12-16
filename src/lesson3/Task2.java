package lesson3;

import java.util.Set;

public class Task2 {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "89274856897");
        phoneBook.add("Smirnov", "89675489787");
        phoneBook.add("Smirnov", "89675489789");
        phoneBook.add("Sobolev", "89658974152");
        phoneBook.add("Martirosyan", "89770777777");
        Set<String> allSurnames = phoneBook.getAllSurnames();
        for (String surname: allSurnames) {
            System.out.printf("Пользователь %s имеет номер(а) %s %n", surname, phoneBook.get(surname));

        }
    }
}








