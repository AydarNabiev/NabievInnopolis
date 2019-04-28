package ru.nabiev.task5;

import java.util.Scanner;

public class VendingMachineApp {

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        vm.addMoney();
        Scanner scanner = new Scanner(System.in);
        int addmoney = scanner.nextInt();
        if (addmoney < 0) {
            System.out.println("Недопустимое значение, перезапустите программму.");
        }
        else {
            vm.account = vm.account + addmoney;
            vm.mainMenu();
            Scanner scannermm = new Scanner(System.in);
            int choice1 = scannermm.nextInt();
            if (choice1 == 1) {
                Drinks.output();
                int choice2 = scanner.nextInt();
                switch (choice2) {
                    case 1:if ((vm.account - 20) < 0) {
                        System.out.println("Недостаточно средств, возьмите обратно " + vm.account + " рублей.");
                    } else {
                        vm.account = vm.account - 20;
                        System.out.println("Ваш чай готов, не забудьте ваши " + vm.account + " рублей.");
                    }
                    break;
                    case 2:if ((vm.account - 30) < 0) {
                        System.out.println("Недостаточно средств, возьмите обратно " + vm.account + " рублей.");
                    } else {
                        vm.account = vm.account - 30;
                        System.out.println("Ваш кофе готов, не забудьте ваши " + vm.account + " рублей.");
                    }
                    break;
                    case 3:if ((vm.account - 10) < 0) {
                        System.out.println("Недостаточно средств, возьмите обратно " + vm.account + " рублей.");
                    } else {
                        vm.account = vm.account - 10;
                        System.out.println("Ваша газировка готов, не забудьте ваши " + vm.account + " рублей.");
                    }
                    break;
                    case 4:if ((vm.account - 25) < 0) {
                        System.out.println("Недостаточно средств, возьмите обратно " + vm.account + " рублей.");
                    } else {
                        vm.account = vm.account - 25;
                        System.out.println("Ваша газировка готов, не забудьте ваши " + vm.account + " рублей.");
                    }
                    break;
                    default:
                        System.out.println("Недопустимо. Заберите обратно " + vm.account + " рублей.");
                }
            } else if (choice1 == 2) {
                System.out.println("Благодарим за использование программы. Вам возвращено " + vm.account + " рублей.");
            } else {
                System.out.println("Недопустимый вариант, перезапустите. Возвращено " + vm.account + " рублей.");
            }
        }

    }
}
