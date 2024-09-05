package org.lsj.components;

import org.springframework.stereotype.Component;

//@Component
public class CC {

    private static  CC cc = new CC();

//    private CC() {}

    public static CC getInstance() {
        if (cc == null)
            cc = new CC();
        return cc;
    }
}
