public class Manager extends Employee {

    public Manager(String name, int age){
        super(name, age);
    }
    @Override
    public void attendTraining() {
        System.out.println("Attend Training Manager" + getName());
    }
}
