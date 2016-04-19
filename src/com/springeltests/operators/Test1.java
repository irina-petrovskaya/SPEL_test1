package com.springeltests.operators;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerBean")
public class Test1 {

    //Relational operators

    @Value("#{case1Bean.num * 100}")
    public int case1_num;
    @Value("#{1 == 1}") //true
    private boolean testEqual;
    @Value("#{not(1 != 1)}") //true
    private boolean testNotEqual;
    @Value("#{1 < 1}") //false
    private boolean testLessThan;
    @Value("#{1 <= 1}") //true
    private boolean testLessThanOrEqual;
    @Value("#{1 > 1}") //false
    private boolean testGreaterThan;

    //Logical operators , numberBean.no == 999
    @Value("#{1 >= 1}") //true
    private boolean testGreaterThanOrEqual;
    @Value("#{numberBean.nom == 999 and numberBean.nom < 900}") //false
    private boolean testAnd;
    @Value(value = "#{numberBean.nom == 999 or numberBean.nom lt 900}") //true
    private boolean testOr;

    //Mathematical operators
    //@Value("#{!(numberBean.boo1 > 9999)}") //false   // boolean comparing to integer -- no errors
    @Value("#{!(numberBean.boo1)}") //false
    private boolean testNot;
    @Value("#{1 + 1}") //2.0
    private double testAdd;
    @Value("#{'1' + '@' + '1'}") //1@1
    private String testAddString;
    @Value("#{1 - 1}") //0.0
    private double testSubtraction;
    @Value("#{1 * 1}") //1.0
    private double testMultiplication;
    @Value("#{10 / 2}") //5.0
    private double testDivision;
    @Value("#{numberBean.nom % 10}") //9.0        // on property rename the access methods are renamed, but usage is not
    private double testModulus;
    @Value("#{2 ^ 2}") //4.0       // not parsed expression
    private double testExponentialPower;
    @Value(value = "#{systemProperties['user.dir']}")
    private String complex;

    @Override
    public String toString() {
        return "Test1 [testEqual=" + testEqual + ", testNotEqual="
                + testNotEqual + ", testLessThan=" + testLessThan
                + ", testLessThanOrEqual=" + testLessThanOrEqual
                + ", testGreaterThan=" + testGreaterThan
                + ", testGreaterThanOrEqual=" + testGreaterThanOrEqual
                + ", testAnd=" + testAnd + ", testOr=" + testOr + ", testNot="
                + testNot + ", testAdd=" + testAdd + ", testAddString="
                + testAddString + ", testSubtraction=" + testSubtraction
                + ", testMultiplication=" + testMultiplication
                + ", testDivision=" + testDivision + ", testModulus="
                + testModulus + ", testExponentialPower="
                + testExponentialPower + ", case1_num = " + case1_num + ", complex =" + complex + "]";
    }

}
