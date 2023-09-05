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
public class Dog extends Animal {
    private String character;
    public void setcharacter(String Character){
        this.character=Character;
    }
    public String getcharacter(){
        return character;
    }
    public void input(){
        super.input();
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap tinh cach cua dong vat: ");
        character=sc.nextLine();
    }
    public void output(){
        super.output();
        System.out.println("tinh cach cua dong vat: "+character);
    }
    public void tiengKeu(){
        super.tiengKeu();
        System.out.println("tieng keu: gau gau gau");
    }
    public static void main(String[] args) {
       Dog dog=new Dog();
       dog.input();
       dog.output();
       dog.tiengKeu();
    }
}
