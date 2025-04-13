package Lesson_5;

public class Dog extends Animal {
    private static String name;
    static int countDog = 0;

    Dog(String name) {
        super();
        countDog++;
        this.name = name;
    }

    @Override
    public void swim(int swim) {
        if (swim<=10&&swim>=0){
            System.out.println(Dog.name+" проплыл(а) "+swim+" м.");
        }
        else {
            System.out.println(Dog.name+" не может проплыть "+swim+" м.");
        }
    }

    @Override
    public void run(int run) {
        if (run<=500&&run>=0){
            System.out.println(Dog.name+" пробежал(а) "+run+" м.");
        }
        else {
            System.out.println(Dog.name+" не может пробежать "+run+" м.");
        }
    }

    static int getCountDog() {
        return countDog;
    }
}
