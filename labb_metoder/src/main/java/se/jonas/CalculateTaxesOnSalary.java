package se.jonas;

public class CalculateTaxesOnSalary {
    private double salary;
    private double salaryAfterTax;

    public CalculateTaxesOnSalary(double salary) {
        super();

        setSalary(salary);
    }

    private void setSalary(double salary2) {
        this.salary = salary2;
    }

    public double getSalary(){
        if(salary < 1500){
            salaryAfterTax = salary * 0.12;
        }
        else if(salary < 30000){
            salaryAfterTax = salary * 0.28;
        }
        else{
            salaryAfterTax = salary * 0.33;
        }
        return salaryAfterTax;
    
    }
    
}