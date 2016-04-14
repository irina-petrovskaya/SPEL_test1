package com.springeltests.operators;

import java.util.List;

/**
 * by Irina.Petrovskaya, on 22.11.11, 13:47
 */
public class Case2 {
    private String p1;
    private String p2;
    private String[] p3;
    private Integer[] p4;
    private List<MyBox> types;
    private MyBox p5;

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP1() {
        return p1;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public String getP2() {
        return p2;
    }

    public String returnFooString(){
        return "foo";
    }

    public void setP3(String[] p3) {
        this.p3 = p3;
    }

    public String[] getP3() {
        return p3;
    }

    public void setP4(Integer[] p4) {
        this.p4 = p4;
    }

    public Integer[] getP4() {
        return p4;
    }

    public void setBoxes(List<MyBox> types) {
        this.types = types;
    }

    public List<MyBox> getBoxes() {
        return types;
    }

    public void setP5(MyBox p5) {
        this.p5 = p5;
    }

    public MyBox getP5() {
        return p5;
    }
}
