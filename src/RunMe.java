import com.springeltests.operators.Test1;
import com.springeltests.operators.Test2;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * by Irina.Petrovskaya, on 10.11.11, 17:59
 */
public class RunMe {

    public static void main(String[] args) {
            String sss = "ddd";

            GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
            
            ctx.load("classpath:/res/spring-config.xml");
            ctx.refresh();
        Test1 cust = ctx.getBean(Test1.class);
        String operations_test = cust.toString();
        System.out.println("operations_test : \n " + operations_test);
        Test2 test2 = ctx.getBean(Test2.class);
        System.out.println("test2.getO1() = " + test2.getO1());
        System.out.println("test2.getO2() = " + test2.getO2());
        System.out.println("test2.getSelector().get(0) = " + test2.getSelector().get(0));
        System.out.println("test2.getTypesSelector().get(0).getSize() = " + test2.getBoxSelector().get(0).getSize());
        System.out.println("test2.getSafeBoxSize() = " + test2.getSafeBoxSize());
        List<String> o3 = test2.getO3();
        for (int i = 0; i < o3.size(); i++) {
            System.out.println("o3[i] = " + o3.get(i)); }
            List o5 = test2.getListOfLists();
            for (int j = 0; j < o5.size(); j++) {
                List jj = (List) o5.get(j);
                for (int k = 0; k < jj.size(); k++) {
                    String s = (String) jj.get(k);
                    System.out.println("o5 element = " + s);
                }
            }
        ArrayList bs = test2.getBs();
        for (int i = 0; i < bs.size(); i++) {
            Object o = bs.get(i);
            System.out.println("o.toString() = " + o.toString());
        }
        System.out.println("test2.bss = " + test2.getBss());
        }
       
}
