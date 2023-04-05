package Company;/*
написать класс который хранит только этот тип данных
Результат:класс<>-коллекция должен хранить только неповторяющихся
сотрудников в отсортированном виде
у класса должны быть методы add, delete, search
 */


import java.util.TreeSet;

public class EmployeeList<T extends Employee> {

    private TreeSet<T> emplList= new TreeSet<>();

    //добавление
    public boolean add(T employee) {
        emplList.add(employee);
        return true;
    }
    //удаление
    public boolean erase(String name, int age){
        T toDelete = null;
        for (T employee : emplList) {
            if (employee.getName().equals(name) && employee.getAge() == age) {
                toDelete = employee;
                break;
            }
        }
        if (toDelete == null) {
            return false;
        }
        emplList.remove(toDelete);
        return true;
    }
    //поиск
    public EmployeeList<T> searchByName(String name){
        EmployeeList<T> result = new EmployeeList<>();
        for (T employee : emplList) {
            if (employee.getName().contains(name)){
                result.add(employee);
            }
        }
        return result;
    }
    //печать
    public void print() {
        emplList.stream().forEach(System.out::println);
    }


}
