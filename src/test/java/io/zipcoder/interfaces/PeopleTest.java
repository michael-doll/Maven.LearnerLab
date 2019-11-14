package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PeopleTest {

    @Test
    public void add() {
        People people = new People();
        Person person = new Person(Long.MIN_VALUE, "Bilbo");
        people.add(person);

        Integer expected = 1;
        Integer actual = people.count();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findById() {
        People people = new People();
        Person person = new Person(Long.MIN_VALUE, "Bilbo");
        people.add(person);
        Person expected = person;
        Person actual = people.findById(Long.MIN_VALUE);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemoveById() {
        Long id = Long.MIN_VALUE;
        People people = new People();
        Person person = new Person(Long.MIN_VALUE, "Bilbo");
        people.add(person);
        people.remove(id);

        Integer expected = 0;
        Integer actual = people.count();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemoveByPerson() {
        People people = new People();
        Person person = new Person(Long.MIN_VALUE, "Bilbo");
        people.add(person);

        people.remove(person);

        Integer expected = 0;
        Integer actual = people.count();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testToArray(){
        People people = new People();
        Person expectedPerson = new Person(Long.MIN_VALUE, "Bilbo");
        people.add(expectedPerson);

        Object[] personArr = people.toArray();
        Person actualPerson = (Person) personArr[0];

        Assert.assertEquals(expectedPerson, actualPerson);
    }
}