package Lesson_5;


public class Lesson_5 {
    public static void main(String[] args) {
        Animal Frosy = new Cat("Фрося", 5, false);
        Animal Shweps = new Dog("Швепс");
        Animal Sau = new Cat("Саю", 5, false);
        Animal Vols = new Dog("Волс");

        Vols.swim(1);
        Frosy.swim(1);
        Shweps.run(501);
        Sau.run(200);
        System.out.println();


        Cat[] allCaty = new Cat[4];
        allCaty[0] = new Cat("Мурка", 4, false);
        allCaty[1] = new Cat("Рыжуля", 8, false);
        allCaty[2] = new Cat("Ирис", 9, false);
        allCaty[3] = new Cat("Снежок", 11, false);

        Dish dish = new Dish(50);
        dish.info();
        for (int i = 0; i < allCaty.length; i++) {
            if (!allCaty[i].fullness && Cat.appetite < dish.food) {
                allCaty[i].eat(dish);
                allCaty[i].fullness = true;
                System.out.println("Кот " + allCaty[i].name + " покушал!");
            } else {
                System.out.println("Кот " + allCaty[i].name + " не поел!");
            }
        }
        dish.info();
        System.out.println("Сколько грамм вискаса добавить еще в миску?");
        dish.info();

        System.out.println();
        System.out.println("Всего котов: " + Cat.countCat + "\n");
        System.out.println("Всего собак: " + Dog.countDog + "\n");
        System.out.println("Всего животных: " + Animal.countAnimal + "\n");

        Circle circle1 = new Circle(2, "Красный", "Черный");
        Rectangle rectangle = new Rectangle(3, 4, "Синий", "Зеленый");
        Triangle triangle = new Triangle(5, 3, 4, "Желтый", "Оранжевый");

        circle1.getSpec();
        rectangle.getSpec();
        triangle.getSpec();
    }




}


