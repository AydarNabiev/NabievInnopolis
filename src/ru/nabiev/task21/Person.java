package ru.nabiev.task21;

public class Person {
    int age;
    String familyName;
    String gender;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person(int age, String familyName, String gender) {
        this.age = age;
        this.familyName = familyName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", familyName='" + familyName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (familyName != null ? !familyName.equals(person.familyName) : person.familyName != null) return false;
        return gender != null ? gender.equals(person.gender) : person.gender == null;

    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (familyName != null ? familyName.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }
}
