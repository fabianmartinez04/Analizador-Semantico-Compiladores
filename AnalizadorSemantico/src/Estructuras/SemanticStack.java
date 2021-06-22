/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Estructuras.SematicRegister.RS;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author pablo
 */
public class SemanticStack {
  LinkedList<RS> stack;
  
  
  
  // remove and return the element in the last position of the list
  RS pop() {
    return this.stack.removeLast();
  }
  
  // add element in last position of the list
  void push(RS r) {
      this.stack.addLast(r);
  }
  
 // searching a register in entry list
 RS find(String p_id) {
     ListIterator<RS> iterator = this.stack.listIterator();
     RS r = null;
     while (iterator.hasNext()) {
         r = iterator.next();
         if (r.id.equals(p_id))
            return r;
     }
     return r;
 }
}
