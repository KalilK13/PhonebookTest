package review;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    @org.junit.jupiter.api.Test
    void addAll() {

        PhoneBook phoneBook = new PhoneBook();
        List<String> numbers = new ArrayList<>();

        numbers.add("3025555555");
        numbers.add("3");

        phoneBook.addAll("Smith", "3025555555","3");

        assertEquals(numbers, phoneBook.lookup("Smith"));



    }
    @org.junit.jupiter.api.Test
    void defaultConstructorTest() {
        PhoneBook phoneBook = new PhoneBook();
        assertInstanceOf(HashMap.class, phoneBook.getPhoneRecord());
    }

    // test the remove method
    @org.junit.jupiter.api.Test
    void removeTest() {
        //given
        PhoneBook phoneBook = new PhoneBook();
        //add some entries to the phone book
        phoneBook.add("John", "123-456-7890");
        phoneBook.add("Jane", "987-654-3210");

        // remove an entry
        phoneBook.remove("John");

        //expected
        assertFalse(phoneBook.getPhoneRecord().containsKey("John"));

        //actual

    }

    @org.junit.jupiter.api.Test
    void parameterizedConstructorTest() {
        Map<String, List<String>> newMap = new HashMap<>();
        PhoneBook phoneBook = new PhoneBook(newMap);
        assertInstanceOf(HashMap.class, phoneBook.getPhoneRecord());
    }

    @org.junit.jupiter.api.Test
    void reverseLookUpTest(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "123-456-7890");

        assertEquals("John", phoneBook.reverseLookUp("123-456-7890"));
    }
}