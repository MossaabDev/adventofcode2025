package main.java.com.proglobby;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\MSI\\IdeaProjects\\AdventOfCode2025\\src\\main\\java\\com\\proglobby\\input.txt");
        BufferedReader reader = new BufferedReader(fileReader);
        String line;
        int target = 50;
        int count = 0;
        /*
        while ((line = reader.readLine()) != null) {
            char direction = line.charAt(0);
            int value = Integer.parseInt(line.substring(1));
            if (direction == 'R') {
                target += value;
            } else{
                target -= value;
            }
            target = ((target % 100) + 100) % 100;
            if (target == 0){
                count ++;
            }
        }

         */

//        while ((line = reader.readLine()) != null) {
//
//            char direction = line.charAt(0);
//            int oldTarget = target;
//
//            int value = Integer.parseInt(line.substring(1));
//            if (direction == 'R') {
//                target += value;
//            } else{
//                target -= value;
//            }
//            count +=((target) < 0 ? -((target / 100)-1) : ((target / 100)));
//            count += target == 0 ? 1 : 0;
//            if (oldTarget == 0 && (target < 0 || target >= 100)){
//                count --;
//            }
//
//            target = ((target % 100) + 100) % 100;
//
//        }

        while ((line = reader.readLine()) != null){
            char direction = line.charAt(0);
            int value = Integer.parseInt(line.substring(1));
            if (direction == 'R'){
                if (target + value >= 100){
                    count += (target+value)/100;
                }
                target += value;
            }else{
                if (target - value <= 0){

                    count += (-(target - value)+100)/100;
                    if (target == 0){
                        count --;
                    }
                }
                target -= value;
            }


            target = ((target % 100) + 100) % 100;
            System.out.println(count  + " : " + target);
        }

        System.out.println(count);
    }
}