package assignment10;
import java.util.Date;
public abstract class Person implements IPerson {
  String id, fullname;
    Date dateOfBirth;

    public Person() {
    }

    public Person(String id, String fullname, Date dateOfBirth) {
        this.id = id;
        this.fullname = fullname;
        this.dateOfBirth = dateOfBirth;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
     public abstract void disPlayInfo();  
}
