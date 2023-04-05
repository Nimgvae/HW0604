package Company;/*
СОТРУДНИКИ
Есть иерархия сотрудников
менеджеры, мидлы, джуны, сеньоры, тим лиды, CTO
*/

public class Employee implements  Comparable<Employee>{
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }



    @Override
    public int compareTo(Employee o) {
        if (this.name.equals(o.name)) {
            return this.age - o.age;
        } else {
            return this.name.compareTo(o.name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        String position = "";
        if (this.getClass() == Manager.class) {
            position = "Company.Manager";
        }
        if (this.getClass() == Junior.class) {
            position = "Company.Junior";
        }
        if (this.getClass() == TeamLeader.class) {
            position = "TeamLead";
        }
        if (this.getClass() == Midle.class) {
            position = "Middle";
        }
        if (this.getClass() == Senior.class) {
            position = "Company.Senior";
        }
        if (this.getClass() == CEO.class) {
            position = "Company.CEO";
        }
        return this.name + ", " + this.age + ", " + position;
    }
}
