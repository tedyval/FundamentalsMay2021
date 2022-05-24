package ObjectsAndClasesLab.Students2;

public class Students {
    private String firstName;
    private String lastName;
    private int age;
    private String homeTown;

    public Students(String firstName, String lastName, int age, String homeTown){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.homeTown = homeTown;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getHomeTown(){
        return homeTown;
    }
    @Override
    public String toString() {
        return String.format("%s %s is %d years old",this.firstName,this.lastName,this.age);
    }

    public String setFirstName(String firstName){
        return this.firstName = firstName;
    }

    public String setLastName(String lastName){
        return this.lastName = lastName;
    }

    public int setAge(int age){
        return this.age = age;
    }

    public String setHomeTown(String homeTown){
        return this.homeTown = homeTown;
    }

}
