package run;

import Entity.Record;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class GhiDung implements Runnable{

    ArrayList<Record> rs;

    public GhiDung(ArrayList<Record> rs) {
        this.rs = rs;
    }

    @Override
    public void run() {
        for (Record r:rs) {
            try {
                FileWriter fw = new FileWriter("dung.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(r.getPhone()+"|"+r.getMess()+"|"+r.getDate());
                bw.close();
            } catch (Exception e) {
            }
        }
    }
}
