public class Cat {
    public String name;
    private int appetite;
    public boolean hungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = false;
    }

    public void eat(Plate p) {
        if (appetite <= p.food) {
            p.decreaseFood(appetite);
            hungry = true;
        }
        else System.out.println("Для кошки " + name +" не хватит еды, слишком большой appetite");
    }
}
