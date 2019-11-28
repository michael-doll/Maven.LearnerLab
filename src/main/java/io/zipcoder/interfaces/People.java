package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//     class People<E> implements Iterable<E> {
    public abstract class People<E extends Person> implements Iterable{

    private List<E> personList = new ArrayList<E>();
//    Iterator<Person> iterator = personList.iterator();

    public void add(E person){
        personList.add(person);
    }

    public E findById(Long id){
        for(E p : personList){
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
