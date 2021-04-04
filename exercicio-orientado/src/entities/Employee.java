package entities;

public class Employee{

    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary(){
        return this.grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        this.grossSalary += ((percentage * this.grossSalary) /100) - (tax);
    }





}