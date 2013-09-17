/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 *
 * @author Steve
 */
public class HourlyEmployee implements Employee {

    private double hourlyRate;
    private int annualHoursWorked;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return annualHoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.annualHoursWorked = hoursWorked;
    }
    
    
    
    
    
    
    @Override
    public double getPay() {
        return hourlyRate*annualHoursWorked;
        
    }
    
    
    
    
    
}
