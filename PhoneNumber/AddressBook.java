package com.glo.addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AddressBook {

    Trie<Contact> contacts;

    public AddressBook() {
        contacts = new Trie<>();
    }

    public void addContact(Contact contact) throws Exception {
        if (contacts.search(contact.getName()).isEmpty()) {
            contacts.insert(contact.getName(), contact);
        } else
            throw new Exception();
    }

    public void deleteContact(String name) throws Exception {
        List<Contact> contact = contacts.search(name);
        if (contact!=null) {
            contacts.delete(name, contact.get(0));
        } else
            throw new Exception();
    }

    public void updateContact(String name, Contact contact) throws Exception {
        if (contacts.search(name).isEmpty()) {
            throw new Exception();
        } else {
            deleteContact(name);
            contacts.insert(name, contact);
        }
    }

    public List<Contact> searchByName(String name) {
        List<Contact> allContacts = new ArrayList<>();
        allContacts=contacts.search("");
        List<Contact> outContacts = new ArrayList<>();

        for (Contact c:allContacts) {
            if(c.getName().toLowerCase().startsWith(name.toLowerCase())){
                outContacts.add(c);
            }
        }

        return outContacts;
    }

    public List<Contact> searchByOrganisation(String organisation) throws Exception {
        List<Contact> allContacts = new ArrayList<>();
        allContacts=contacts.search("");
        List<Contact> outOrganisation = new ArrayList<>();

        for (Contact c:allContacts) {
            if(c.getOrganisation().toLowerCase().startsWith(organisation.toLowerCase())){
                outOrganisation.add(c);
            }
        }

        return outOrganisation;
    }

}