package Lesson_5;

public abstract class Animal {
    static int countAnimal = 0;

    Animal() {
        countAnimal++;
    }

    void run(int run) {
        if (run<=200&&run>=0){
            System.out.println("Животное пробежало "+run);
        }
        else {
            System.out.println("Животное не может пробежать " + run);
        }
    }

    void swim(int swim) {
        if (swim<=10&&swim>=0){
            System.out.println("Животное проплыло "+swim);
        }
        else {
            System.out.println("Животное не может проплыть " + swim);
        }
    }

    public static int getCountAnimal(){
        return countAnimal;
    }
}