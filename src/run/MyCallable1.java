package run;

import Controller.GetData;
import Entity.Record;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public class MyCallable1 implements Callable <ArrayList<Record>> {

    @Override
    public ArrayList<Record> call() throws Exception {
        GetData data = new GetData();
        return data.getall();
    }
}
