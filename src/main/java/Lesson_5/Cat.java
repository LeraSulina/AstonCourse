package Lesson_5;

public class Cat extends Animal {
    String name;
    public static int appetite;
    public boolean fullness;
    public static int countCat=0;

    Cat(String name, int appetite, boolean fullness) {
        super();
        countCat++;
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }
    @Override
    public void swim(int swim) {
        System.out.println(name+" не умеет плавать");
    }

    @Override
    public void run(int run) {
        if (run<=200&&run>=0){
            System.out.println(name+" пробежал "+run);
        }
        else {
            System.out.println(name+" не может пробежать "+run);
        }
    }

    public void eat(Dish p) {
        p.decreaseFood(appetite);
    }

    static int getCountCat() {
        return countCat;
    }

}