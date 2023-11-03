public class Main {
    public static void main(String[] args) {
        task1();// задача 1
        task2();// задача 2
        task3();// задача 3
        task4();// задача 4
        task5();// задача 5
        task6();// задача 6
        task7();// задача 7

    } //Задача 1

    public static void task1() {
        System.out.println("Задача 1");

        int age = 13;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то Ты можешь водить");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то Ты не можешь водить");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int temperature = 15;
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф ");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int age = 15;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на рабту");
        }
    }

    public static void task5() {
        System.out.println("Задание 5");

        int age = 21;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        if (age > 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нужно кататься на аттракционе в сопровождении взрослого");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задание 6");

        int human = 103;
        if (human <= 60) {
            System.out.println("В вагоне есть сидячие места " + (60 - human) + " мест и осталось ещё 42 стоячих места в вагоне ");
        } else if (human > 60 && human <= 102) {
            System.out.println("В вагоне зпкончиличь сидячие места, остались только стоячии " + (102 - human));
        } else {
            System.out.println("Вагон полностью забит, переполнен на " + -(102 - human) + " человек");
        }
    }

    public static void task7() {
        System.out.println("Задание 7");

        int num1 = 67;
        int num2 = 5322;
        int num3 = 123;
        if (num1 > num2) {
            if (num1 > num3)
                System.out.println("Наибольший: " + num1);
        }
        if (num2 > num1)
            if (num2 > num3) {
                System.out.println("Наибольший: " + num2);
            }
        if (num3 > num1)
            if (num3 > num2) {
                System.out.println("Наибольший: " + num3);
            }
    }
}
