public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("customer1");
        stack.push("customer2");
        stack.printStack();

        System.out.println(stack.size());
        System.out.println(stack.search("customer5"));
        System.out.println(stack.search("customer1"));
        stack.pop();
        stack.pop();
        System.out.println(stack.size());
        stack.printStack();
        stack.pop();
        System.out.println(stack.search("customer1"));

        //stack kullanarak nasıl queue yapabilirim?
        //string input verilecek, bu string inputunun içinde 3 ane ayrı parantez şekli olacak ({[, bu stringin açılış ve kapanışları düzgün mü diye bakacak.
        //e.g. (ab (cd [ef] tt {gh} ) de) true döndürecek. (] false döndürecek. ([{}]) true dönüyor.
    }
}
