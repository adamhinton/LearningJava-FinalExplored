package consumer.specific;

import dev.lpa.generic.BaseClass;

public class ChildClass extends BaseClass {

    @Override
    protected void optionalMethod() {
        System.out.println("Child.optionalMethod: EXTRA Stuff here");
        super.optionalMethod();
    }

    @Override
    public void recommendedMethod() {
        System.out.println("Child.recommended: I'll do things my own way");
        optionalMethod();
    }
}
