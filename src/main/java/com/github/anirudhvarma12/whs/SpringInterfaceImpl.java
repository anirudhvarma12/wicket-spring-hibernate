package com.github.anirudhvarma12.whs;

import org.springframework.stereotype.Component;

/**
 * @author Anirudh Varma
 * @Date May 4, 2015
 */

@Component
public class SpringInterfaceImpl implements SpringInterface{

    @Override
    public String getString() {
        return "Hello";
    }

}
