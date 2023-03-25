package live.midreamsheep.mcja.example;

import jdk.nashorn.internal.objects.annotations.Function;

public class A {

    @Function(name = "main", arity = 1)
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
