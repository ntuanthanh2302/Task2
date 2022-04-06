package run;

import threadpgk.CheckDung2;
import Entity.Record;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        MyCallable1 m = new MyCallable1();
        ArrayList<Record> rs = m.call();
        //rs.clear();

        CheckDung d = new CheckDung(rs);
        ArrayList<Record> rs2 = d.call();
        GhiDung ghiDung = new GhiDung(rs2);
        ghiDung.run();

        CheckSai s = new CheckSai(rs);
        ArrayList<Record> rs3 = s.call();
        GhiSai ghiSai = new GhiSai(rs3);
        ghiSai.run();


    }
}
