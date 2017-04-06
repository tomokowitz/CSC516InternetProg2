import java.util.ArrayList;

public class okowitz8 {


    ArrayList people;
    okowitz7 person;
    
    public okowitz8() {
    }

    public void setPeople(ArrayList people) {
        this.people = people;
    }

    public ArrayList getPeople() {
        return people;
    }

    public void setPerson(okowitz7 person) {
        this.person = person;
        this.people.add(person);
    }

    public okowitz7 getPerson() {
        return person;
    }
}
