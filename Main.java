package com.company;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        while (true) {
            PrintTime(); 
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
    private static void PrintTime(){
        String[][] numbers = {
                {
                        "  ######  " ,
                        " ###  ### " ,
                        " ##    ## " ,
                        " ##    ## " ,
                        " ##    ## " ,
                        " ##    ## " ,
                        " ##    ## " ,
                        " ###  ### " ,
                        "  ######  "
                },{
                        "    ##    " ,
                        "    ##    " ,
                        "    ##    " ,
                        "    ##    " ,
                        "    ##    " ,
                        "    ##    " ,
                        "    ##    " ,
                        "    ##    " ,
                        "    ##    "
                },
                {
                        "  ######  " ,
                        " ##    ## " ,
                        "       ## " ,
                        "       ## " ,
                        " ######## " ,
                        " ##       " ,
                        " ##       " ,
                        " ##    ## " ,
                        " ######## "
                },{
                "  ######  " ,
                " ##    ## " ,
                "       ## " ,
                "       ## " ,
                "  ####### " ,
                "       ## " ,
                "       ## " ,
                " ##    ## " ,
                "  ######  "
        },{
                " ##    ## " ,
                " ##    ## " ,
                " ##    ## " ,
                " ##    ## " ,
                "  ####### " ,
                "       ## " ,
                "       ## " ,
                "       ## " ,
                "       ## "
        },{
                " ######## " ,
                " ##     # " ,
                " ##       " ,
                " ##       " ,
                " ######## " ,
                "       ## " ,
                "       ## " ,
                " ##    ## " ,
                "  ######  "
        },{
                "  ######  " ,
                " ##    ## " ,
                " ##       " ,
                " ##       " ,
                " #######  " ,
                " ##    ## " ,
                " ##    ## " ,
                " ##    ## " ,
                "  ######  "
        },{
                " ######## " ,
                " #     ## " ,
                "       ## " ,
                "       ## " ,
                "   ###### " ,
                "       ## " ,
                "       ## " ,
                "       ## " ,
                "       ## "
        },{
                "  ######  " ,
                " ##    ## " ,
                " #      # " ,
                " ##    ## " ,
                "  ######  " ,
                " ##    ## " ,
                " #      # " ,
                " ##    ## " ,
                "  ######  "
        },{
                "  ######  " ,
                " ##    ## " ,
                " #      # " ,
                " ##    ## " ,
                "  ####### " ,
                "       ## " ,
                "       ## " ,
                " ##    ## " ,
                "  ######  "
                },{
                "          ",
                "    ##    ",
                "    ##    ",
                "    ##    ",
                "          ",
                "    ##    ",
                "    ##    ",
                "    ##    ",
                "          "
        }};
        Calendar cal = Calendar.getInstance();

        int h = cal.get(Calendar.HOUR_OF_DAY);
        int m = cal.get(Calendar.MINUTE);
        int s  = cal.get(Calendar.SECOND);

        for (int i = 0;i<9;i++){
            System.out.print(numbers[(h - (h%10)) / 10][i]);
            System.out.print(numbers[h % 10][i]);
            System.out.print(numbers[10][i]);
            System.out.print(numbers[(m - (m%10)) / 10][i]);
            System.out.print(numbers[m % 10][i]);
            System.out.print(numbers[10][i]);
            System.out.print(numbers[(s - (s%10)) / 10][i]);
            System.out.print(numbers[s % 10][i]);
            System.out.println();
        }
    }
}