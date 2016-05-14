
package Bab8.Latihan2;

public class Nilai implements D1,I1{
    
    boolean nilai;
   
    public Nilai (Double n){
        nilai = n%1==0;
        cekvalue();
    }
    public void cekvalue(){
        if(nilai){
            I1();
        }
        else{
            D1();
        }
    }
     public void I1(){
         System.out.println("Integer");
         System.out.println("----------------------");
     }
     public void D1(){
         System.out.println("Double");
         System.out.println("----------------------");
     }
      
}
 
