import java.util.Scanner;

public class HomeWorkLesson07 {

    public static void main(String[] args) {
        Plate plate = new Plate(125);
        Cat[] cats = new Cat[15];
        cats[0] = new Cat("Муська", 5);
        cats[1] = new Cat("Барсик", 18);
        cats[2] = new Cat("Мурзик", 7);
        cats[3] = new Cat("Катька", 11);
        cats[4] = new Cat("Сонька", 6);
        cats[5] = new Cat("Гоголь", 12);
        cats[6] = new Cat("Лева", 10);
        cats[7] = new Cat("Васька", 13);
        cats[8] = new Cat("Василиса", 7);
        cats[9] = new Cat("Буська", 6);
        cats[10] = new Cat("Дзен", 9);
        cats[11] = new Cat("Кутузов", 17);
        cats[12] = new Cat("Жорж", 5);
        cats[13] = new Cat("Кошка", 3);
        cats[14] = new Cat("Прожор", 10);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println("У кошки " + cats[i].name + " сытость " + cats[i].hungry);
        }
        System.out.println();
        plate.info();
        plate.addEat();
        plate.info();
    }
}
