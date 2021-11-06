package org.campus02.stack;

public class DemoStackApp {
    public static void main(String[] args) {
        

        Stack<String> stapel = new Stack(new String[7]);

        stapel.push("sieben");
        stapel.push("fünf");
        stapel.push("sechs");

        System.out.println("stapel.pop() = " + stapel.pop());
        System.out.println("stapel.pop() = " + stapel.pop());
        stapel.push("3");
        System.out.println("stapel.pop() = " + stapel.pop());
        System.out.println("stapel.pop() = " + stapel.pop());
        System.out.println("stapel.pop() = " + stapel.pop());


    }
}
