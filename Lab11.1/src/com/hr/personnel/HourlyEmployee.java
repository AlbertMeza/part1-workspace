package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public class HourlyEmployee extends Employee {

  private double rate;
  private double hours;

  public HourlyEmployee() {
  }

  public HourlyEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours){
    this(name, hireDate);
    setRate(rate);
    setHours(hours);
  }

  public void payTaxes() {
    System.out.printf("%s paid taxes of %,.2f%n", getName(), getRate() * getHours() * TaxPayer.HOURLY_TAX_RATE);
  }
  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public double getHours() {
    return hours;
  }

  public void setHours(double hours) {
    this.hours = hours;
  }

  @Override
  public String toString() {
    return super.toString() +
           ", hourlyRate=" + getRate() +
           ", hours=" + getHours();
  }
}
