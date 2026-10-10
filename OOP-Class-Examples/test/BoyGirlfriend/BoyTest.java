package BoyGirlfriend;

import org.junit.jupiter.api.Test;

public class BoyTest {
    @Test
    void nonsenseTest(){
        Boy quadir = new Boy();

        quadir.cookForMe();
        quadir.cookForMe("Yam");
        quadir.setGirlfriend(new MushinBabe());
        System.out.println("==============");
        quadir.cookForMe();
        quadir.cookForMe("beans");
    }

}
