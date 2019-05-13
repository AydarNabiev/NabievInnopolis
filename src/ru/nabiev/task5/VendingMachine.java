package ru.nabiev.task5;

public class VendingMachine {
    static int account = 0;

    // TODO: 13.05.2019 удалить 
    /*Drinks TEA = new Drinks("Чай", 20);
    Drinks COFFEE = new Drinks("Кофе", 30);
    Drinks SODA = new Drinks("Газированная вода", 10);
    Drinks LEMONADE = new Drinks("Лимонад", 25);*/

    public enum DrinkList {
        TEA("Чай", 20),
        COFFEE("Кофе", 30),
        SODA("Газированная вода", 10),
        LEMONADE("Лимонад", 25);

        private String drinkName;
        private int drinkPrice;
        private int number;

        DrinkList(String drinkName, int drinkPrice) {
            this.drinkName = drinkName;
            this.drinkPrice = drinkPrice;
        }

        public String getDrinkName() {
            return drinkName;
        }

        public void setDrinkName(String drinkName) {
            this.drinkName = drinkName;
        }

        public int getDrinkPrice() {
            return drinkPrice;
        }

        public void setDrinkPrice(int drinkPrice) {
            this.drinkPrice = drinkPrice;
        }
    }

    public DrinkList[] getDrinkList() {
        return DrinkList.values();
    }

    public static int getAccount() {
        return account;
    }

    public static void setAccount(int account) {
        VendingMachine.account = account;
    }

    public void mainMenu () {
        System.out.println("Пожалуйста, выберите: 1) Показать меню напитков");
        System.out.println("2) Выйти из программы");
        System.out.println("Введите номер команды для выбора. ");
    }

    public static void addMoney () {
        System.out.println("Пожалуйста, добавьте деньги на счёт (вводом количества вносимых денег): ");
    }

    public static void takeDrink () {
        System.out.println("Ваш напиток готов, не забудьте ваши " + account + " рублей.");
    }

    public static void notEnoughMoney () {
        System.out.println("Недостаточно средств, возьмите обратно " + account + " рублей.");
    }

    public void output() {
        int i = 1;
        for (DrinkList drinkList : DrinkList.values()) {
            System.out.println(i++ + " " + drinkList.getDrinkName() + " " + drinkList.getDrinkPrice());
        }
        // TODO: 13.05.2019 удалить 
        /*System.out.println("1 - " + TEA.name + ", " + TEA.price + " руб.");
        System.out.println("2 - " + COFFEE.name + ", " + COFFEE.price + " руб.");
        System.out.println("3 - " + SODA.name + ", " + SODA.price + " руб.");
        System.out.println("4 - " + LEMONADE.name + ", " + LEMONADE.price + " руб.");*/
        System.out.println("Выберите цифрой");
    }
}