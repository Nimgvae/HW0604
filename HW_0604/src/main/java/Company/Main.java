package Company;

public class Main {
    public static void main(String[] args) {
        EmployeeList<Employee> companyList = new EmployeeList<>();
        Manager manager = new Manager("Eugen Korschun", 42, 300);
        companyList.add(manager);
        companyList.add(new Manager("Natalie Korschun", 18, 51000));

        companyList.add(new Junior("Stefanija Korschun", 4, 1000000));
        companyList.add(new TeamLeader("Viktor White", 50, 10_000));

        // этот не добавится как дубль по имени и возрасту
        companyList.add(new CEO("Viktor White", 50, 100_000));

        // этот добавится тк совпадает имя, но не совпадает возраст
        companyList.add(new CEO("Viktor White", 70, 100_000));

        companyList.add(new CEO("Domovoy Perviy", 605, 105_000));
        companyList.add(new Midle("Leshiy Seriy", 135, 5_000));
        companyList.add(new Senior("Dina Korschun", 18, 18_000));

        companyList.add(new Junior("Jimmy Bee", 20, 21_000));
        companyList.print();
        companyList.erase("Jimmy Bee", 20);
        System.out.println();
        System.out.println("Выводим список после удаления сотрудника Jimmy Bee, 20 лет");
        companyList.print();
        System.out.println();
        System.out.println("Вывод поиска по имени 'Viktor'");
        companyList.searchByName("Viktor").print();

    }
}
