public class TestStack {
    public static void main(String[] args) {
        //Test for Stack
//        StackArrayBased<String> arrayBased = new StackArrayBased<>();
//        arrayBased.push("hello");
//        arrayBased.push("hi");
//        arrayBased.pop();
//        arrayBased.pop();
//        System.out.println(arrayBased.peek());
//
//        StackReferenceBased<String> referenceBased = new StackReferenceBased<>();
//        referenceBased.push("hello");
//        referenceBased.push("hi");
//        referenceBased.pop();
//        referenceBased.pop();
//        System.out.println(referenceBased.peek());
//
//        StackListBased<String> listBased = new StackListBased<>();
//        listBased.push("hello");
//        listBased.push("hi");
//        listBased.pop();
//        listBased.push("hi");
//        listBased.pop();
//        System.out.println(listBased.peek());
        //
        System.out.println(isSymmetric("hiiiih"));
        System.out.println(isPairedBraces("()())("));

    }

    public static boolean isSymmetric(String string) {
        StackListBased<Character> listBased = new StackListBased<>();
        for(int i=0; i<string.length()/2; i++) {
            listBased.push(string.charAt(i));
        }
        for(int i=(string.length()+1)/2; i<string.length(); i++) {
            if(!listBased.peek().equals(string.charAt(i))) return false;
            listBased.pop();
        }
        return true;
    }

    public static boolean isPairedBraces(String string) {
        StackListBased<Character> listBased = new StackListBased<>();
        for(int i=0; i<string.length(); i++) {
            if(string.charAt(i)=='(') {
                listBased.push(string.charAt(i));
            }
            else if(string.charAt(i)==')') {
                if(listBased.peek()==null) return false;
                else listBased.pop();
            }
        }
        if(!listBased.isEmpty()) return false;
        else return true;
    }
}

