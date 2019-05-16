package ru.nabiev.task5;

import java.util.Scanner;

public class VendingMachineApp {

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        vm.addMoney();
        Scanner scanner = new Scanner(System.in);
        int addCash = scanner.nextInt();
        if (addCash < 0) {
            System.out.println("Недопустимое значение, перезапустите программму.");
        }
        else {
            vm.account = vm.account + addCash;
            vm.mainMenu();
            Scanner scannerMM = new Scanner(System.in);
            int choice1 = scannerMM.nextInt();
            if (choice1 == 1) {
                vm.output();
                int choice2 = scanner.nextInt();

                if (choice2 < 1 || choice2 > vm.getDrinkList().length) {
                    System.out.println("Вы ввели некоректное число, такого напитка не существует. " +
                            "Заберите обратно " + vm.account + " рублей.");
                } else {
                    VendingMachine.DrinkList drinkElem = vm.getDrinkList()[choice2-1];
                    if (vm.account - drinkElem.getDrinkPrice() < 0) {
                        vm.notEnoughMoney();
                    } else {
                        vm.account = vm.account - drinkElem.getDrinkPrice();
                        vm.takeDrink();
                    }
                }


// TODO: 13.05.2019 Здесь много повторяющегося кода: условия if, notEnoughMoney, takeDrink
                /*switch (choice2) {
                    case 1:
                        if ((vm.account - 20) < 0) {
                            vm.notEnoughMoney();
                        } else {
                            vm.account = vm.account - 20;
                            vm.takeDrink();
                        }
                        break;
                    case 2:
                        if ((vm.account - 30) < 0) {
                            vm.notEnoughMoney();
                        } else {
                            vm.account = vm.account - 30;
                            vm.takeDrink();
                        }
                        break;
                    case 3:
                        if ((vm.account - 10) < 0) {
                            vm.notEnoughMoney();
                        } else {
                            vm.account = vm.account - 10;
                            vm.takeDrink();
                        }
                        break;
                    case 4:
                        if ((vm.account - 25) < 0) {
                            vm.notEnoughMoney();
                        } else {
                            vm.account = vm.account - 25;
                            vm.takeDrink();
                        }
                    break;
                    default:
                        System.out.println("Недопустимо. Заберите обратно " + vm.account + " рублей.");
                }*/

            } else if (choice1 == 2) {
                System.out.println("Благодарим за использование программы. Вам возвращено " + vm.account + " рублей.");
            } else {
                System.out.println("Недопустимый вариант, перезапустите. Возвращено " + vm.account + " рублей.");
            }
        }
    }
}
