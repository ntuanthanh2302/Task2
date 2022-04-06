package Test;

import Entity.Record;
import run.MyCallable1;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) throws Exception {
        MyCallable1 m = new MyCallable1();
        PhoneCheck phoneCheck = new PhoneCheck();
        ArrayList<Record> rs = m.call();
        try {
            for (Record r: rs) {

                if (r.getPhone().substring(0,2).equals("90") ){
                    if (r.getPhone().length()==10 && r.getMess().contains("fuck")==false){
                        System.out.println(r.getPhone());
                    }
                }


               // System.out.println(r.getPhone());
            }
            //rs.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
