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

    private void mandatoryMethod(){
        System.out.println("BaseClass.mandatoryMethod: NON-NEGOTIABLE");
    }

}
