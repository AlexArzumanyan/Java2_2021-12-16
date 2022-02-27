package lesson3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook implements IPhoneBook {

    private final Map<String, Set<String>> phonesBySurname = new TreeMap<>();



    @Override
    public void add(String surName, String phoneNumber) {
        Set<String> phones = phonesBySurname.get(surName);
        if (phones == null) {
            Set<String> phonesSet  = new HashSet<>();
            phonesSet.add(phoneNumber);
            phonesBySurname.put(surName,phonesSet);
        } else {
            phones.add(phoneNumber);
            phonesBySurname.put(surName,phones);
        }
    }

    @Override
    public Set<String> get(String surname) {
        return this.phonesBySurname.get(surname);
    }
    @Override
    public Set<String> getAllSurnames() {
        return this.phonesBySurname.keySet();
    }
}
