package org.example;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age >= 0) {
            this.age = age;
            return this;
        }
        throw new IllegalArgumentException("Некорректно указан возраст: значение не может быть меньше нуля!");
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null)
            throw new IllegalStateException("Не заполнены обязательные поля: имя и/или фамилия!");
        return new Person(name, surname, age, address);
    }

}
