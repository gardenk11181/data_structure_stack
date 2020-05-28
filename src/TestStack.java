public class TestStack {
    public static void main(String[] args) {
        StackArrayBased<String> arrayBased = new StackArrayBased<>();
        arrayBased.push("hello");
        arrayBased.push("hi");
        arrayBased.pop();
        arrayBased.pop();
        System.out.println(arrayBased.peek());

        StackReferenceBased<String> referenceBased = new StackReferenceBased<>();
        referenceBased.push("hello");
        referenceBased.push("hi");
        referenceBased.pop();
        referenceBased.pop();
        System.out.println(referenceBased.peek());

        StackListBased<String> listBased = new StackListBased<>();
        listBased.push("hello");
        listBased.push("hi");
        listBased.pop();
        listBased.push("hi");
//        listBased.pop();
        System.out.println(listBased.peek());
    }
}

