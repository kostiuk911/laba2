public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Додаємо елементи до стеку
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Виводимо розмір стеку
        System.out.println("Розмір стеку: " + stack.size());

        // Переглядаємо верхній елемент без видалення
        System.out.println("Верхній елемент: " + stack.peek());

        // Видаляємо верхній елемент
        System.out.println("Видалено елемент: " + stack.pop());

        // Виводимо розмір стеку знову
        System.out.println("Розмір стеку: " + stack.size());

        // Виводимо всі елементи за допомогою ітератора
        System.out.println("Всі елементи:");
        for (int item : stack) {
            System.out.println(item);
        }
    }
}
