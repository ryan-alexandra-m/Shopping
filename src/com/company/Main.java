package com.company;
import  java.util.*;

public class Main {

    public static void main(String[] args) {
    ArrayList<String> needs= new ArrayList<>();
    needs.add("melon");
    needs.add("eggs");
	Cart cart= new Cart(needs);
    cart.addItem("eggs");
    cart.addItem("cheese");
    cart.printList();
        System.out.println(cart.isNeed("melon"));
    }
}
