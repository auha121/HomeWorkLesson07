import java.util.Scanner;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void addEat () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько добавить еды?");
        int addEatPar = scanner.nextInt();
        food = food + addEatPar;
    }
}
