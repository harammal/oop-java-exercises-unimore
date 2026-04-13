package com.harammal.exercises.oop_full.phonebook;

import java.util.ArrayList;

/**
 * A PhoneBook implementation internally using ArrayList. Its capacity is limited to 256 persons.
 *
 * @see PhoneBook Interface
 */
public class PhoneBookList implements PhoneBook {
    final ArrayList<Person> phoneBook;

    public PhoneBookList() {
        this.phoneBook = new ArrayList<>();
    }

    public boolean addPerson(Person person) {
        if (phoneBook.contains(person) || phoneBook.size() >= MAX_PERSONS) {
            return false;
        }

        return phoneBook.add(person);
    }

    @Override
    public boolean removePerson(Person person) {
        return phoneBook.remove(person);
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        ArrayList<Person> tmp = new ArrayList<>();

        for (Person person : phoneBook) {
            if (person.lastname().equals(lastname)) {
                tmp.add(person);
            }
        }

        return tmp.toArray(new Person[]{});
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        ArrayList<Person> tmp = new ArrayList<>();

        for (Person person : phoneBook) {
            if (person.name().equals(name) && person.lastname().equals(lastname)) {
                tmp.add(person);
            }
        }

        return tmp.toArray(new Person[]{});
    }
}