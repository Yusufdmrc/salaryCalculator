public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public int tax() {
        if ( salary > 1000 ) {
            int tax = ( this.salary * 3 ) / 100 ;
            return tax ;

        }
        else {
            return 0 ;
        }
    }

    public int bonus() {
        if ( this.workHours > 40 ) {
            int bonus = (this.workHours - 40 ) * 30 ;
            return bonus;
        }
        else {
            return 0 ;
        }
    }

    public int raiseSalary() {
        int raise = 0;
        if (2021 - this.hireYear <= 9) {
            raise = this.salary / 10;
            return raise;
        } else if (2021 - this.hireYear > 9 && 2021 - this.hireYear <= 19) {
            raise = (this.salary / 100) * 15;
            return raise;
        }
        return raise;
    }
    public String printInfos(){
        return "Employee's name is  : " + this.name + "\n" +
                "Employee's salary is  : " + this.salary + "\n" +
                "Employee's working hour is  : " + this.workHours + "\n" +
                "Starting year of employee is  : " + this.hireYear + "\n" +
                "Employee's tax is  : " + tax() + "\n" +
                "Employee's bonus salary is  : " + bonus() + "\n" +
                "Employee's raise is  : " + raiseSalary() + "\n" +
                "Employee's net salary is  : " + (this.salary + bonus() - tax()) + "\n" +
                "Employee's raised salary is : " + (this.salary + raiseSalary()) + "\n" +
                "============================";
    }

}
