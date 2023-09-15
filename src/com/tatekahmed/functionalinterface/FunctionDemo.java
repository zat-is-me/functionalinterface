package com.tatekahmed.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Hello world!
 *
 */
public class FunctionDemo
{
//    Note functional interface has 4 types
//    1 -> Predicate = it has 1 method test(T) which return boolean value.
//    2 -> Consumer = it expects value but not returning anything or no output. which has void accept(T t) method.
//    3 -> function = it can take and return values. has  a method apply(input, output);
//    4 -> Supplier = it will not take any values, but it returns values. Has 1 method get();

    public static void main( String[] args )
    {
        Person p = new Person("tatek");

        Predicate<String> checkLength = str -> str.length() > 5;
        System.out.println("\nPredicate: " + checkLength.test("predicate"));

        Consumer<Person> passName = name -> name.setName("Tatek");
        passName.accept(p);
        System.out.println("\nConsumer: " + p.getName());

        Function<Integer, String> value = t -> t*10+" data multiplied by 10";
        System.out.println("\nFunction: " +value.apply(20));

        Supplier<Double> getRandemDouble = () -> Math.random();
        System.out.println("\nSupplier: " + getRandemDouble.get());

        for (int i = 0; i < 3; i++) {
            System.out.println(p.toString());
        }
    }
}
