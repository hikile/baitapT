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
public class Cat extends Animal {
    private String Color;
    private String preferences;
    private String ownerName;
    public void setColor(String color){
        this.Color=color;
    }
    public void setpreferences(String Prefences){
        this.preferences=Prefences;
    }
    public void setownerName(String OwnerName){
        this.ownerName=OwnerName;
    }
    public String getColor(){
        return Color;
    }
    public String getpreferences(){
        return preferences;
    }
    public String getownername(){
        return ownerName;
    }
    public void input(){
        super.input();
        Scanner sc=new Scanner(System.in);
        System.out.print("nhap mau dong vat: ");
        Color=sc.nextLine();
        System.out.print("nhap so thich: ");
        preferences=sc.nextLine();
        System.out.print("nhap ten chu nhan cua pet: ");
        ownerName=sc.nextLine();
    }
    public void output(){
        super.output();
        System.out.println("mau cua dong vat: "+Color);
        System.out.println("so thich la: "+preferences);
        System.out.println("ten chu la: "+ownerName);
    }
    public void tiengKeu(){
        super.tiengKeu();
         System.out.println("tieng keu: meow meow meow meow ");
    }
    public static void main(String[] args) {
       Cat cat=new Cat();
       cat.input();
       cat.output();
       cat.tiengKeu();
    }
}
