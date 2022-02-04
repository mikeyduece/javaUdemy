package com.company;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public boolean updateContact(Contact oldContact, Contact newContact) {
        Contact foundContact = findContact(oldContact);
        if(foundContact != null) {
            int pos = this.contacts.indexOf(foundContact);
            this.contacts.set(pos, newContact);
            return true;
        }
        return false;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public boolean addContact(Contact contact){
        Contact foundContact = findContact(contact);
        if (foundContact != null) {
            System.out.println("Already exists");
            return false;
        }

        contacts.add(contact);
        return true;
    }

    public Contact findContact(Contact contact) {
        return contacts.stream().filter(c -> c.getName().equals(contact.getName())).findFirst().orElse(null);
    }

}
