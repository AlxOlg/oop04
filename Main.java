public class Main {
    public static void main(String[] args) {

        FruitBox<String> stringBox = new FruitBox<>(); // ошибка

        FruitBox<Orange> orangeBox = new FruitBox<>();
        orangeBox.add(new Orange(1));
        orangeBox.add(new Orange(2));
        orangeBox.add(new Apple(2)); // ошибка
        orangeBox.add(new GoldenApple(2)); // ошибка
        System.out.println(orangeBox.getWeight());

        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple(1));
        appleBox.add(new GoldenApple(2));
        System.out.println(appleBox.getWeight());

        FruitBox<GoldenApple> goldenAppleBox = new FruitBox<>();
        goldenAppleBox.add(new GoldenApple(5));
        goldenAppleBox.add(new Apple(5)); // ошибка
        System.out.println(goldenAppleBox.getWeight());

        goldenAppleBox.moveTo(appleBox);
        appleBox.moveTo(goldenAppleBox); // ошибка
        orangeBox.moveTo(appleBox); // ошибка

        FruitBox<Orange> orangeBox2 = new FruitBox<>();
        orangeBox.moveTo(orangeBox2);
        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox2.getWeight());
    }
}
