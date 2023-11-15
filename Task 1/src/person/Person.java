package person;

public class Person {

    private String name;
    private String jobTitle;
    private double age;
    private  String placeOfWork;
    private double salary;

    protected Person(){
    }
    protected Person(String name, String jobTitle, String placeOfWork, double age, double salary){
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.placeOfWork = placeOfWork;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public  String getJobTitle(){
        return jobTitle;
    }
    public String getPlaceOfWork(){
        return placeOfWork;
    }
    public double getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }
    public void setPlaceOfWork(String placeOfWork){
        this.placeOfWork = placeOfWork;
    }
    public void setAge(double age){
        this.age = age;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
}
