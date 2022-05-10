package com.company;
import java.util.*;

public class Cart {

    boolean isBought;
    ArrayList<String> isNeeded;

    ArrayList<String> shoppingList=new ArrayList<String>();

    public Cart(ArrayList<String> isNeeded) {
        this.isNeeded = isNeeded;
    }

    public void addItem(String item){
        shoppingList.add(item);}

    public void printList(){
        System.out.println(shoppingList);
    }

    public boolean isNeed(String stuff){
        if(isNeeded.contains(stuff)){
            return true;
        }
        return false;
    }
}
