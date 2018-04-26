package university;

import java.util.ArrayList;

public class People {

    private ArrayList<Person> personList;

    public People(ArrayList<Person> personList){
        this.personList = personList;
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void add(Person person){
        System.out.println(personList.add(person));
    }//person is yelling at me

    public Person findByID(long ID){
        Person student = null;

        for (Person group : personList){
            if(personList.contains(ID)){
                student = group;
            }
        }
        return student;
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long ID){
        for (Person group : personList){
            if(personList.contains(ID)){
                personList.remove(group);
            }
        }
    }

    public int getCOunt(){
        return personList.size();
    }

    public Person[] getArray(){
        Person[] personArray = new Person[personList.size()];
        return personList.toArray(personArray);
    }

    public void removeAll(){
        personList.clear();
    }

    @Override
    public String toString() {
        return "People{" +
                "personList=" + personList +
                '}';
    }

}
