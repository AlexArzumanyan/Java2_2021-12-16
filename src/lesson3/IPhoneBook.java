package lesson3;

import java.util.Set;

public interface IPhoneBook {
    void add(String surName, String phoneNumber);

    Set<String> get(String surname);

    Set<String> getAllSurnames();
}
