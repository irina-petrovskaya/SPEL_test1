package com.springeltests.operators;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * by Irina.Petrovskaya, on 22.11.11, 13:06
 */
@Component(value = "case1Bean")
public class Case1 {

    int num;

    public int getNum() {
        return num;
    }
    @Value("12")
    public void setNum(int num) {
        this.num = num;
    }
}
