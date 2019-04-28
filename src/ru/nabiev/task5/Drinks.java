package ru.nabiev.task5;

public enum Drinks {
    TEA(1, "Чай", 20),
    COFFEE(2, "Кофе", 30),
    SODA(3, "Газированная вода", 10),
    LEMONADE(4, "Лимонад", 25);

    public int id;
    public String name;
    public int price;

    Drinks(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void output() {
        System.out.println(TEA.id + " - " + TEA.name + ", " + TEA.price + " руб.");
        System.out.println(COFFEE.id + " - " + COFFEE.name + ", " + COFFEE.price + " руб.");
        System.out.println(SODA.id + " - " + SODA.name + ", " + SODA.price + " руб.");
        System.out.println(LEMONADE.id + " - " + LEMONADE.name + ", " + LEMONADE.price + " руб.");
        System.out.println("Выберите цифрой");
    }
}

