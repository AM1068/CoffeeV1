/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

import java.util.*;

/**
 *
 * @author aris
 */
public class CoffeeExpert {
   public List getTypes(String type) {

     List types = new ArrayList();

     if (type.equals("milky")) {
       types.add("latte");
       types.add("cappuccino");
     }
     else if (type.equals("froffy")) {
       types.add("latte");
       types.add("cappuccino");
       types.add("frappuccino");
     }
     else if (type.equals("icey")) {
       types.add("frappuccino");
     }
     else if (type.equals("strong")) {
       types.add("espresso");
       types.add("double espresso");
     }else if (type.equals("black")) {
       types.add("Jacobs with flavours");
     
     }else if (type.equals("frappe")) {
       types.add("Classic cold frappe");
       types.add("Hot NES");
     }
     else {
       types.add("Vending Machine");
     }
     return(types);
   }
}