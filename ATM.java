/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bài.atm;

/**
 *
 * @author DELL
 */
class ATM {
    private String soTK;
    private double soDu;
    public ATM(String stk,double sd){
        soTK=stk;
        soDu=sd;
    }
    public String laySTK(){
        return soTK;
        
    }
    public double laySoDu(){
        return soDu;
    }
    public String toString(){
        return "-soTK: "+ soTK +"\nsoDu: "+ soDu;
    }
    public void napTien(double st ){
        soDu+=st;
    }
    public boolean rutTien(double st) {
        if(st<= soDu-50) {
            soDu-=st;
            return true;
        }
        return false;
    }
    public boolean chuyenTien(ATM tk,double st){
        if(st<=soDu-50){
            soDu-=st;
            tk.napTien(st);
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        ATM a=new ATM("1111111",100);
        a.napTien(1000);
         System.out.println(a);
        
        
        ATM b=new ATM("2222222",100);
        a.chuyenTien(b,500);
         System.out.println(a);
         System.out.println(b);
         
        
       
        
        b.rutTien(200);
        System.out.println(b);
        ATM c=new ATM("3333333",100);
        ATM d=new ATM("4444444",100);
        ATM e=new ATM("5555555",100);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        double tong;
        tong=a.laySoDu()+b.laySoDu()+c.laySoDu()+d.laySoDu()+e.laySoDu();
        System.out.println("tổng là:"+tong);
     
        
        
        
        
        
                
    }

}
