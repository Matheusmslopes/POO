package atividade02;


import java.text.SimpleDateFormat;
import java.util.Date;

    

public class Atividade02 {

    
    public static void main(String[] args) {
    data();
    }
    
    public static void data(){
      Date date = new Date();
      SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
      String stringDate= DateFor.format(date);
      System.out.println(stringDate);
    }
    
}
