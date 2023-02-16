public class Main {
    public static void main(String[] args) {
        MagicBox<String> boxString = new MagicBox<>(5);
        MagicBox<Integer> boxInteger = new MagicBox<>(2);
        MagicBox<String> boxError = new MagicBox<>(5);
        boxString.add("Строка 1");
        boxString.add("Строка 2");
        boxString.add("Строка 3");
        boxString.add("Строка 4");
        boxString.add("Строка 5");
        String a = boxString.pick();
        System.out.println(a);
        boxInteger.add(1);
        boxInteger.add(2);
        boxInteger.add(3);
        boxInteger.add(4);
        boxInteger.add(5);
        int b = boxInteger.pick();
        System.out.println(b);
        boxError.add("Строкусенька");
        boxError.pick();
    }
}
