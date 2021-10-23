package songsearch.ab_package;

import org.springframework.stereotype.Component;

@Component
public class B {

    public B(A a) {
        a.printString("Some text.");
    }
}
