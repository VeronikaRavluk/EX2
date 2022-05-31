package com.company;

public class One {
    public double wight;
    public double height;
    public double lenght;

    public One(double wight, double height, double lenght) {
        this.wight = wight;
        this.height = height;
        this.lenght = lenght;
    }


     static class InOne {
        public double wight;
        public double height;
        public double lenght;


            void square(){
                double sq = wight * lenght;
                System.out.println("Площа гаражу:" + sq );
            }

        }

    }



