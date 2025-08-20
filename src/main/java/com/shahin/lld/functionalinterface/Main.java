package com.shahin.lld.functionalinterface;

public class Main {
    public static void main(String[] args) {

        Consumer<Integer> obj = (Integer val)->{
            if (val>10){
                System.out.println("consumer");
            }
        };

        obj.accept(11);

        Supplier<String> supplier = ()->{
            return "supplier";
        };

        System.out.println( supplier.get());

        Function<Integer, String> function = (Integer val)->{
            String v = val.toString();
            return v;
        };

        System.out.println( function.apply(20));

        Predicate<Integer> predicate = (Integer val) ->{
            if (val %2 ==0){
                return true;
            }else {
                return false;
            }
        };

        System.out.println(predicate.test(2));
    }
}
