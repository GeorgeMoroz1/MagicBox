import java.util.Random;

public class MagicBox<T> {
    protected int size;
    protected T[] items;

    public MagicBox(int size) {
        items = (T[]) new Object[size];
        this.size = size;
        this.items = items;
    }

    protected boolean add(T item) {
        for (int i = 0; i < size; i++) {

            if (items[i] == null) {
                items[i] = item;
                System.out.println("Элемент " + item + " добавлен!");
                return true;
            }
        }
        System.out.println("Коробка уже заполнена");
        return false;
    }


    public T pick() throws RuntimeException {
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        for (int i = 0; i < size; i++) {


            if (items[i] == null) {
                throw new RuntimeException("коробка не заполнена, осталось заполнить ещё " + (items.length - i) + " ячеек");
            }
        }

        return items[randomInt];
    }
}

