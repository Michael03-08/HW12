package person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
         person.setName("Колян");
         person.setAge(48);
         person.setJobTitle("Директор");
         person.setSalary(10000);
         person.setPlaceOfWork("Google");

        System.out.println("Меня зовут " + person.getName() + " мне " + person.getAge() + " лет " +
                " я работаю " + person.getJobTitle() + " в " + person.getPlaceOfWork() +
                " моя зарплата " + person.getSalary() + " долларов.");
    }
}
