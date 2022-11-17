import java.util.Arrays;

public class Main<T> {
    public static void main(String[] args) {
        MagicBox<Integer> magicBox = new MagicBox<>(7);
        magicBox.add(5);
        magicBox.add(8);
        magicBox.add(93);
        magicBox.add(122);
        magicBox.add(157);
        magicBox.add(1);
        magicBox.add(10);
        magicBox.add(768);
        System.out.println("Возвращаю элемент " + magicBox.pick());
        MagicBox<String> namesMagicBox = new MagicBox<>(8);
        namesMagicBox.add("Юрий");
        namesMagicBox.add("Катя");
        namesMagicBox.add("Роман");
        namesMagicBox.add("Ольга");
        System.out.println("Возвращаю элемент " + namesMagicBox.pick());
    }
}
