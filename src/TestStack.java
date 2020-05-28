public class TestStack {
    public static void main(String[] args) {
        StackArrayBased<String> arrayBased = new StackArrayBased<>();
        arrayBased.push("hello");
        arrayBased.push("hi");
        arrayBased.pop();
        System.out.println(arrayBased.peek());
    }
}

