package kz.example.rest.entity;

public class Animal {

    private String clazz;
    private String form;
    private double weight;

    public Animal(String clazz, String form, double weight) {
        this.clazz = clazz;
        this.form = form;
        this.weight = weight;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
