
import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     
   
     
     double numb = Double.parseDouble(reader.readLine());

     int numb1 = (int) numb;
     
     if (numb1 > 5){
     
     numb1 = numb1 % 5;
     
     }
    
     
     
     if(numb1 >= 0 && numb1 <=3 ){
          System.out.println("зелёный");
     }
     else if(numb1 <=4 ){
          System.out.println("жёлтый");
     }  
     else{
          System.out.println("красный");
     }
     
   
    }  
   

}
