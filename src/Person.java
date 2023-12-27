/**
 * @Author congpeitong
 * @Date 2023/10/15 16:27
 */
public class Person {
    private String name;
    private int salary;
    private String sex;
    private String address;

    public Person(String name, int salary, String sex, String address) {
        this.name = name;
        this.salary = salary;
        this.sex = sex;
        this.address = address;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
