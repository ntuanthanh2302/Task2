package run;

import Entity.Record;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class CheckSai implements Callable<ArrayList<Record>> {

    ArrayList<Record> rs;

    public CheckSai(ArrayList<Record> rs) {
        this.rs = rs;
    }

    ArrayList<Record> d=new ArrayList<>();
    @Override
    public ArrayList<Record> call() {
        try {
            for (Record r: rs) {
                if (r.getPhone().substring(0,2).equals("84") ){
                    if (r.getPhone().length()!=11 || r.getMess().contains("fuck")){
                        d.add(new Record(r.getPhone(),r.getMess(),r.getDate()));
                    }
                }
                else if (r.getPhone().substring(0,2).equals("90") ){
                    if (r.getPhone().length()!=10 || r.getMess().contains("fuck")){
                        d.add(new Record(r.getPhone(),r.getMess(),r.getDate()));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return d;
    }
}