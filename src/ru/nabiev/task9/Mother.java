package ru.nabiev.task9;

public class Mother {
    public static void main(String[] args) {
        Child motherChild = new Child();
        int momFood = (int) (Math.random() * (Child.FoodList.values().length) + 1);
        System.out.print(momFood + " ");
        try {
            motherChild.eat(momFood);
        } catch (Exception e) {
            System.out.println("О нет! - подумал воспитанный ребенок.");
        } finally {
            System.out.println("Спасибо, мама!");
        }
    }
}