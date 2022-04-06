package Controller;

import Entity.Record;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class GetData {
    ArrayList<Record> records = new ArrayList<>();
    public ArrayList <Record> getall() throws Exception {
        String line="";
        try {
            FileReader fr = new FileReader("C:\\Users\\Admin\\Desktop\\Task1\\input.txt");
            BufferedReader br = new BufferedReader(fr);
            while (true) {
                if (line == null) {
                    break;
                }
                line = br.readLine();
                String[] bits = line.split("\\|");
                records.add(new Record(bits[bits.length-3],bits[bits.length-2],bits[bits.length-1]));
            }
        } catch (Exception e) {
        }
        return records;
    }
}
