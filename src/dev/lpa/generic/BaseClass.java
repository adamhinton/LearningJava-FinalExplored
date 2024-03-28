package dev.lpa.generic;

// Extensible but not customizable
public class BaseClass {

    // My way or the highway
    // mandatory must be called, can't trust dumb devs to do it. Must make this final
    public final void recommendedMethod(){
        System.out.println("[BaseClass.recommendedMethod]: Best way to do it");
        optionalMethod();
        mandatoryMethod();
    }

    protected void optionalMethod(){
        System.out.println("BaseClass.optional: Customize optional method");
    }

    // When a method is private, only that class can access it. No children or anything else
    // So `final` is redundant (grayed out) since it's already inaccessible outside of this class
    private void mandatoryMethod(){
        System.out.println("BaseClass.mandatoryMethod: NON-NEGOTIABLE");
    }



    // Final, so can't be hidden
    public static void recommendedStatic(){
        System.out.println("BaseClass.recommendedStatic: BEST WAY");

        optionalStatic();
        mandatoryStatic();
    }


    protected static void optionalStatic(){
        System.out.println("BaseClass.optionalStatic: Optional");
    }

    private static void mandatoryStatic(){
        System.out.println("BaseClass.mandatoryStatic:MANDATORY");
    }


}
