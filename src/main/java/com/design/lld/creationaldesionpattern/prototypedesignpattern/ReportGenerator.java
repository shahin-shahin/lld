package com.design.lld.creationaldesionpattern.prototypedesignpattern;

// Main class to demonstrate the pattern
public class ReportGenerator {
    public static void main(String[] args) {
        // Step 1: Create the prototype instance (expensive operation)
        Report monthlyReportPrototype = new Report(
                "Monthly Financials",
                "[Initial Data]",
                "[Default Config]"
        );

        System.out.println("\n--- Prototype Created ---");
        System.out.println("Original: " + monthlyReportPrototype);
        System.out.println("\n--- Now Cloning ---");

        // Step 2: Clone the prototype to create a new object (cheap operation)
        Report januaryReport = monthlyReportPrototype.clone();
        januaryReport.setTitle("January Financial Report");

        // Step 3: Clone again for another report
        Report februaryReport = monthlyReportPrototype.clone();
        februaryReport.setTitle("February Financial Report");

        System.out.println("\n--- Clones Ready ---");
        System.out.println("Clone 1: " + januaryReport);
        System.out.println("Clone 2: " + februaryReport);
    }
}