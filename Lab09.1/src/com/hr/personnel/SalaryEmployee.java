package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public class SalaryEmployee extends Employee{

  private double salary;

  public SalaryEmployee() {
  }

  public SalaryEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  public SalaryEmployee(String name, LocalDate hireDate, double salary){
    this(name, hireDate);
    setSalary(salary);
  }

  public void payTaxes() {
    System.out.printf("%s paid taxes of %,.2f%n", getName(), getSalary() * TaxPayer.SALARIED_TAX_RATE);
  }


  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
      return super.toString() + ", salary=" + getSalary();
  }
}
