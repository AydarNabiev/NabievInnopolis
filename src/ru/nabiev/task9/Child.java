package ru.nabiev.task9;

public class Child {
    public enum FoodList {
        CARROT("Морковь",false),
        APPLE("Яблоко", true),
        PORRIDGE("Каша", true),
        SOUP("Суп", false),
        CASTOROIL("Касторка", false),
        BANANA ("Банан", true),
        DRUG("Лекарство", false),
        ORANGE("Апельсин",true),
        LEMONLIME("Экстракт лимона и лайма", false);

        private String foodName;
        private boolean foodCanIEat;

        FoodList(String foodName, boolean foodCanIEat) {
            this.foodName = foodName;
            this.foodCanIEat = foodCanIEat;
        }

        public String getFoodName() {
            return foodName;
        }

        public void setFoodName(String foodName) {
            this.foodName = foodName;
        }

        public boolean isFoodCanIEat() {
            return foodCanIEat;
        }

        public void setFoodCanIEat(boolean foodCanIEat) {
            this.foodCanIEat = foodCanIEat;
        }
    }

    FoodList[] getFoodList() {
        return FoodList.values();
    }

    public void eat(int momFood) throws Exception {
        FoodList foodelem = FoodList.values()[momFood-1];
        if (foodelem.isFoodCanIEat()) {
            System.out.println(foodelem.getFoodName());
            System.out.println("Съел…за обе щеки!");
            //return true;
        } else {
            System.out.println(foodelem.getFoodName());
            throw new Exception();
            //return false;
        }
    }

}
