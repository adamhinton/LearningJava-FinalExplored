package dev.lpa;

import consumer.specific.ChildClass;
import dev.lpa.generic.BaseClass;

public class Main {
    public static void main(String[] args) {
        BaseClass parent = new BaseClass();
        ChildClass child = new ChildClass();
        BaseClass childReferredToAsBase = new ChildClass();

        parent.recommendedMethod();
        System.out.println("-".repeat(30));

        childReferredToAsBase.recommendedMethod();
        System.out.println("-".repeat(30));
        child.recommendedMethod();


        // Static methods now
        System.out.println("-".repeat(30));
        parent.recommendedStatic();
        System.out.println("-".repeat(30));
        childReferredToAsBase.recommendedStatic();
        System.out.println("-".repeat(30));
        child.recommendedStatic();


        System.out.println("-".repeat(30));
        BaseClass.recommendedStatic();
        ChildClass.recommendedStatic();

        String xArgument = "This is all I've got to say about Section ";
        doXYZ(xArgument, 16);

    }


    private static void doXYZ (final String x, int y){
        final String c = x + y;
        System.out.println("c: " + c);
    }

}