/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
        
public class Hideout<T> {
    private T hidden;
    
    public Hideout() {
        
    }
    
    public void putIntoHideout(T toHide) {
        if (hidden.equals(toHide)) {
            hidden = null;
        }
        hidden = toHide;
    }
    
    public T takeFromHideout () {
        hidden=null;
        return hidden;
    }
    
    public boolean isInHideout() {
        if (hidden==null) {
            return false;
        }
        return true;
    }
}
