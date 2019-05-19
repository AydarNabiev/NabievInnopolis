package ru.nabiev.task5and10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class VendingMachineApp {

    public static void main(String[] args) throws FileNotFoundException {
        System.setErr(new PrintStream(new FileOutputStream("D://Log.txt")));
        VendingMachine vm = new VendingMachine();
        System.err.println("Начало программы. Создали экземпляр класса VendingMachine");
        vm.addMoney();
        System.err.println("Вызвали метод для добавления денег.");
        Scanner scanner = new Scanner(System.in);
        int addCash = scanner.nextInt();
        System.err.println("Приняли количество, введенное пользователем. " + addCash);
        if (addCash < 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.err.println("Пользователь ввёл недопустимое значение, выключаем программу.");
            }
            System.out.println("Недопустимое значение, перезапустите программму.");
        }
        else {
            vm.account = vm.account + addCash;
            System.err.println("На аккаунте " + vm.account + ", вывели главное меню, ожидаем его ввода (выбора).");
            vm.mainMenu();
            Scanner scannerMM = new Scanner(System.in);
            int choice1 = scannerMM.nextInt();
            System.err.println("Пользователь выбрал опцию " + choice1);
            if (choice1 == 1) {
                vm.output();
                System.err.println("В этом случае выводим ему список напитков. Ожидаем выбора напитка.");
                int choice2 = scanner.nextInt();
                System.err.println("Пользователь выбрал " + choice2);
                if (choice2 < 1 || choice2 > vm.getDrinkList().length) {
                    try {
                        throw new Exception();
                    } catch (Exception e2) {
                        System.err.println("Пользователь ввел число вне допустимого диапазона. Выключаем программу");
                    }
                    System.out.println("Вы ввели некоректное число, такого напитка не существует. " +
                            "Заберите обратно " + vm.account + " рублей.");
                } else {
                    VendingMachine.DrinkList drinkElem = vm.getDrinkList()[choice2-1];
                    if (vm.account - drinkElem.getDrinkPrice() < 0) {
                        try {
                            throw new Exception();
                        } catch (Exception e3) {
                            System.err.println("У пользователя не хватило денег, возвращаем ему сумму.");
                        }
                        vm.notEnoughMoney();
                    } else {
                        vm.account = vm.account - drinkElem.getDrinkPrice();
                        vm.takeDrink();
                        System.err.println("Пользователь получает напиток, ему возвращено " + vm.account);
                    }
                }

            } else if (choice1 == 2) {
                System.out.println("Благодарим за использование программы. Вам возвращено " + vm.account + " рублей.");
                System.err.println("Пользователь выбрал вариант с отменой покупки, ему возвращено " + vm.account);
            } else {
                try {
                    throw new Exception();
                } catch (Exception e4) {
                    System.err.println("Пользователь выбрал недопустимый вариант.");
                }
                System.out.println("Недопустимый вариант, перезапустите. Возвращено " + vm.account + " рублей.");
            }
        }
    }
}
