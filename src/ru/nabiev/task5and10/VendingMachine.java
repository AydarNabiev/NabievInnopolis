package ru.nabiev.task5and10;

public class VendingMachine {
    static int account = 0;

    public enum DrinkList {
        TEA("Чай", 20),
        COFFEE("Кофе", 30),
        SODA("Газированная вода", 10),
        LEMONADE("Лимонад", 25);

        private String drinkName;
        private int drinkPrice;

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

    DrinkList[] getDrinkList() {
        return DrinkList.values();
    }

    public static int getAccount() {
        return account;
    }

    public static void setAccount(int account) {
        VendingMachine.account = account;
    }

    void mainMenu () {
        System.out.println("Пожалуйста, выберите: 1) Показать меню напитков");
        System.out.println("2) Выйти из программы");
        System.out.println("Введите номер команды для выбора. ");
    }

    static void addMoney () {
        System.out.println("Пожалуйста, добавьте деньги на счёт (вводом количества вносимых денег): ");
    }

    static void takeDrink () {
        System.out.println("Ваш напиток готов, не забудьте ваши " + account + " рублей.");
    }

    static void notEnoughMoney () {
        System.out.println("Недостаточно средств, возьмите обратно " + account + " рублей.");
    }

    void output() {
        int i = 1;
        for (DrinkList drinkList : DrinkList.values()) {
            System.out.println(i++ + " " + drinkList.getDrinkName() + " " + drinkList.getDrinkPrice());
        }
        System.out.println("Выберите цифрой");
    }
}