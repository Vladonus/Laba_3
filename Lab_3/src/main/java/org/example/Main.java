package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        String[][] str = new String[4][19];
        
        str[0][0] = "functions/amount";
        str[1][0] = "1000";
        str[2][0] = "2000";
        str[3][0] = "3000";
        str[0][1] = "ArrayList.add";
        str[0][2] = "LinkedList.add";
        str[0][3] = "ArrayList.contains";
        str[0][4] = "LinkedList.contains";
        str[0][5] = "ArrayList.get";
        str[0][6] = "LinkedList.get";
        str[0][7] = "ArrayList.size";
        str[0][8] = "LinkedList.size";
        str[0][9] = "ArrayList.remove";
        str[0][10] = "LinkedList.remove";
        str[0][11] = "ArrayList.sort";
        str[0][12] = "LinkedList.sort";
        str[0][13] = "ArrayList.indexOf";
        str[0][14] = "LinkedList.indexOf";
        str[0][15] = "ArrayList.lastIndexOf";
        str[0][16] = "LinkedList.lastIndexOf";
        str[0][17] = "ArrayList.clear";
        str[0][18] = "LinkedList.clear";
        double timer;
        for (Integer i = 1; i <= 3; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            LinkedList<Integer> link = new LinkedList<>();
            //add
            timer = System.currentTimeMillis();
            for (Integer j = 0; j < 1000 * i; j++) {
                arr.add((int) Math.random() * 1000);
            }
            timer = System.currentTimeMillis() - timer;
            str[i][1] = Double.toString(timer);

            timer = System.currentTimeMillis();
            for (Integer j = 0; j < 1000 * i; j++) {
                link.add((int) Math.random() * 1000);
            }
            timer = System.currentTimeMillis() - timer;
            str[i][2] = Double.toString(timer);
            //contains
            timer = System.currentTimeMillis();
            arr.contains(123 + i);
            timer = System.currentTimeMillis() - timer;
            str[i][3] = Double.toString(timer);

            timer = System.currentTimeMillis();
            link.contains(123 + i);
            timer = System.currentTimeMillis() - timer;
            str[i][4] = Double.toString(timer);
            //get
            timer = System.currentTimeMillis();
            arr.get(13);
            timer = System.currentTimeMillis() - timer;
            str[i][5] = Double.toString(timer);

            timer = System.currentTimeMillis();
            link.get(13);
            timer = System.currentTimeMillis() - timer;
            str[i][6] = Double.toString(timer);
            //size
            timer = System.currentTimeMillis();
            arr.size();
            timer = System.currentTimeMillis() - timer;
            str[i][7] = Double.toString(timer);

            timer = System.currentTimeMillis();
            link.size();
            timer = System.currentTimeMillis() - timer;
            str[i][8] = Double.toString(timer);
            //remove
            timer = System.currentTimeMillis();
            arr.remove(123 + i);
            timer = System.currentTimeMillis() - timer;
            str[i][9] = Double.toString(timer);

            timer = System.currentTimeMillis();
            link.remove(123 + i);
            timer = System.currentTimeMillis() - timer;
            str[i][10] = Double.toString(timer);
            //sort
            timer = System.currentTimeMillis();
            Collections.sort(arr);
            timer = System.currentTimeMillis() - timer;
            str[i][11] = Double.toString(timer);

            timer = System.currentTimeMillis();
            Collections.sort(link);
            timer = System.currentTimeMillis() - timer;
            str[i][12] = Double.toString(timer);
            //indexof
            timer = System.currentTimeMillis();
            arr.indexOf(13);
            timer = System.currentTimeMillis() - timer;
            str[i][13] = Double.toString(timer);

            timer = System.currentTimeMillis();
            link.indexOf(13);
            timer = System.currentTimeMillis() - timer;
            str[i][14] = Double.toString(timer);
            //lastIndexOf
            timer = System.currentTimeMillis();
            arr.lastIndexOf(13);
            timer = System.currentTimeMillis() - timer;
            str[i][15] = Double.toString(timer);

            timer = System.currentTimeMillis();
            link.lastIndexOf(13);
            timer = System.currentTimeMillis() - timer;
            str[i][16] = Double.toString(timer);
            //clear
            timer = System.currentTimeMillis();
            link.clear();
            timer = System.currentTimeMillis() - timer;
            str[i][17] = Double.toString(timer);

            timer = System.currentTimeMillis();
            link.clear();
            timer = System.currentTimeMillis() - timer;
            str[i][18] = Double.toString(timer);
        }

        for (int i = 0; i < 18; i++) {
            Formatter formatter = new Formatter();
            System.out.println(formatter.format("%30s %30s %30s %30s", str[0][i], str[1][i], str[2][i], str[3][i]));
        }
    }

}
