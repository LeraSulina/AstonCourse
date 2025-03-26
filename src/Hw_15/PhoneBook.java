package Hw_15;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static java.lang.reflect.Array.get;

public class PhoneBook {
    private String surname;
    private String phoneNumber;

    private final Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void addContact(String surname, String phoneNumber) {
        if (phoneBook.get(surname) != null) {
            if (!phoneBook.get(surname).contains(phoneNumber)) {
                phoneBook.get(surname).add(phoneNumber);
            }
        } else {
            ArrayList<String> phoneNum = new ArrayList<>();
            phoneNum.add(phoneNumber);
            phoneBook.put(surname, phoneNum);
        }
    }

    public void getContact (String surname){
        System.out.println("Контактные телефоны: "+ surname + " " + phoneBook.get(surname));
    }
}