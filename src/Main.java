public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Yusuf" , 3000, 46, 1995);
        Employee employee2 = new Employee("Ozan" , 5000, 52, 2005);

        System.out.println(employee1.printInfos());
        System.out.println(employee2.printInfos());

    }
}
