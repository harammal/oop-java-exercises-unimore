package com.harammal.exercises.oop_full.phonebook;

/**
 * Interface representing a generic PhoneBook Implementing classes must provide
 * methods for inserting, deleting and searching persons within the PhoneBook
 */
public interface PhoneBook {
    /**
     * The maximum number of people that the phone book can store
     */
    public static final int MAX_PERSONS = 256;

    /**
     * Adds a person to the phone book
     *
     * @param person The person to be added to the phone book
     *
     * @return true if the phone book has been modified
     */
    public boolean addPerson(Person person);

    /**
     * Removes a person from the phone book
     *
     * @param person The person to be removed from the phone book
     *
     * @return true is the phone book has been modified
     */
    public boolean removePerson(Person person);

    /**
     * Searches all persons with a specific lastname
     *
     * @param lastname The lastname to be searched
     *
     * @return An array comprising all the persons found
     */
    public Person[] searchByLastname(String lastname);

    /**
     * Searches all persons with a specific name and lastname
     *
     * @param name The name to be searched
     * @param lastname The lastname to be searched
     *
     * @return An array comprising all the persons found
     */
    public Person[] searchByNameAndLastname(String name, String lastname);
}
