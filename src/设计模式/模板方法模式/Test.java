package 设计模式.模板方法模式;

public class Test {
    public static void main(String[] args) {
        Drink coffee = new CoffeeDrink();

        System.out.println("泡咖啡-----> ");

        coffee.mark();

        System.out.println("开始泡茶-----> ");

        Drink tea = new TeaDrink();
        tea.mark();
    }
}
