public class Person {
    private String name;
    public Person(){
        this.name = "";
    }
    public Person(String theName){
        name = theName;
    }
    public Person(Person object){
        this.name = object.name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "Person name : " + getName();
    }
}
