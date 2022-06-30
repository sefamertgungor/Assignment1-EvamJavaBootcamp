package com.company;

import java.util.Scanner;

public class Main {

    String s1 = "Welcome";
    String s2 = "Welcome";
    String s3 = "Welcome";
    //Stringler ayni oldugundan dolayi tek bir tane obje yaratılacaktır.

    // Degerlerin icersinde aranacak veri
    static String data = "<<code>>";

    // Alinan String[] parametre icerisinde gezildi ve tanimli olan String'i icerip icermedigi kontrol edildi.
    public static String requiredMethod(String[] values) {

        for (String value: values) {
            if (value.contains(data)) {
                return "Tanımlı value yu içeren String deger: " + value;
            }
        }

        return "Tanimli value yu iceren String deger bulunmamaktadir!";

    }

    // main icerisinde degerler kullanicidan girdi olarak alinarak requiredMethod fonksiyonuna gonderildi
    public static void main(String[] args) {

        Scanner inputVal = new Scanner(System.in);

        int valueCount;

        do {

            System.out.print("Kac adet deger girmek istiyorsunuz?(En az 5 adet olması lazım!):");
            valueCount = inputVal.nextInt();

            if (valueCount<5){
                System.out.println("\n************* Lutfen istenilenden az deger girmeyiniz! *************");
            }

        } while (valueCount < 5);

        String[] values = new String[valueCount];

        inputVal.nextLine();

        for (int i = 0; i<valueCount; i++) {
            System.out.print("Lutfen "+(i+1)+". elemani giriniz:");
            values[i] = inputVal.nextLine();
        }

        System.out.println(requiredMethod(values));

    }
}
