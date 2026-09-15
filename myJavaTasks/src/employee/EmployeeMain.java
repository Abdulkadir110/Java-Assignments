package employee;

public class EmployeeMain {
    void main(){
        Developer myDev = new Developer("Abdulkadir", 5000.00, 5);
        String paySlip = myDev.getPaySlip();

        IO.println(paySlip);

        Manager myManager = new Manager("Zakariyah",10_000,50);
        String managerPaySlip = myManager.getPaySlip();

        IO.println(managerPaySlip);
    }
}