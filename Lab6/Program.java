package com.example.Lab6;




public class Program {
        public static void main(String[] args) {
            System.out.println("Camera list: ");
            Digital c1=new Digital("Panasonic Lumix FZ",1000,16 );
            c1.info();
            Digital c2=new Digital("Sony Cyber-Shot RX",10,16 );
            c2.info();
            Digital c3=new Digital("Canon Powershot G",3,16 );
            c3.info();
            Tape c4=new Tape("Canon AE",1,16 );
            c4.info();
            Tape c5=new Tape("Pentax K",1000,16 );
            c5.info();
            Tape c6=new Tape("Nikon FM",2,16 );
            c6.info();
        }
    }

