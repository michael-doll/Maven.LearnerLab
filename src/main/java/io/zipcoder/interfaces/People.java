package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//     class People<E> implements Iterable<E> {
    public abstract class People<E extends Person> implements Iterable{

    private List<Person> personList = new ArrayList<Person>();
//    Iterator<Person> iterator = personList.iterator();

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(Long id){
        for(Person p : personList){
            if(p.getId()==id){
                return p;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        return personList.contains(person);
    }

    public void remove(Person person){
        if(contains(person)){
            personList.remove(person);
        }
    }
    public void remove(Long id){
        if(findById(id)!= null){
            personList.remove(findById(id));
        }
    }
    public void removeAll(){
        personList.clear();
    }

    public Integer count(){
        return personList.size();
    }

    public abstract E[] toArray();

    public Iterator iterator() { return (Iterator) this.personList.iterator();}

}
