package case_study.models;

public class Employee extends Person{
    private String level;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, String sex, String idCard, String email, String level, String position, int salary) {
        super(id, name, age, sex, idCard, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String level, String position, int salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }


    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  ("{" + "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", sex='" + getSex() + '\'' +
                ", idCard='" + getIdCard() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}' +
                "level='" + getLevel() + '\'' +
                ", position='" + getPosition() + '\'' +
                ", salary=" + getSalary() +
                '}');
    }
    public String getInfoToCSV(){
        return this.getId()+ ","+ this.getName()+"," +this.getAge()+","+this.getSex()+","+this.getIdCard()+","+this.getEmail()+","+this.getLevel()+","+this.getPosition()+","+this.getSalary();
    }

}
