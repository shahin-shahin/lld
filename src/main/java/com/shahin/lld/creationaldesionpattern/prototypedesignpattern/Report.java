package com.shahin.lld.creationaldesionpattern.prototypedesignpattern;

class Report implements Cloneable {
    private String title;
    private String data;
    private String configuration;

    public Report(String title, String data, String configuration) {
        // Simulating an expensive initial creation process
        this.title = title;
        this.data = data; // e.g., fetched from a database
        this.configuration = configuration; // e.g., complex setup
        System.out.println("Creating an expensive Report object for: " + title);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Report clone() {
        System.out.println("Cloning the report prototype...");
        try {
            return (Report) super.clone();
        } catch (CloneNotSupportedException e) {
            // This should not happen since we are implementing Cloneable
            return null;
        }
    }

    @Override
    public String toString() {
        return "Report{" +
                "title='" + title + '\'' +
                ", data='" + data + '\'' +
                ", configuration='" + configuration + '\'' +
                '}';
    }
}

