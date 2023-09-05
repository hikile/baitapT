/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapt6;

import java.util.Scanner;

/**
 *
 * @author TRAN HUYNH DUC
 */
public class Animal{
    
   private String name;
   private int age;
   private float weight;
   public void setname(String Name){
       this.name=Name;
   }
   public void setage(int Age){
       this.age=Age;
   }
   public void setweight(float Weight){
       this.weight=Weight;
   }
   public String getname(){
       return name;
   }
   public int getage(){
       return age;
   }
   public float getweight(){
       return weight;
   }
   public void input(){
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap ten dong vat: ");
        name=sc.nextLine();
        System.out.print("nhap tuoi: ");
        age=sc.nextInt();
        System.out.print("nhap can nang: ");
        weight=sc.nextFloat();
   }
   public void output(){
       System.out.println("Ten cua dong vat la: "+name);
       System.out.println("tuoi cua dong vat la: "+age);
       System.out.println("Can nang cua dong vat la: "+weight);
   }
   public void tiengKeu(){
        
   }
}