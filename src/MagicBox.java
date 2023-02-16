import java.util.Random;

public class MagicBox<T> {
    T[] items;
    int volue;

    public MagicBox(int volue) {
        this.volue = volue;
        this.items = (T[]) new Object[volue];
    }

    public boolean add(T item) {
        for (T i : items) {
            if (i == null) {
                i = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        int elements = 0;
        for (T e:items) {
            if (e == null){
                elements++;
            }}
        if (elements!=0) {
            throw new RuntimeException("Коробка не заполнена, осталось заполнить " + elements + " эелементов!");
        }
        return items[random()];
    }

    private int random() {
        Random random = new Random();
        int randomInt = random.nextInt(volue - 1);
        return randomInt;
    }

}
