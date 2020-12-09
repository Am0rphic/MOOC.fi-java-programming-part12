/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
public class Pipe<T> {
    private T type;
    private ArrayList<T> list;
    
    public Pipe() {
        list=new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        list.add(value);               
    }
    
    public T takeFromPipe() {
        T newType = list.get(0);
        list.remove(0);
        return newType;
    }
    
    public boolean isInPipe() {
        if (list.isEmpty()) {
            return false;
        }
        return true;
    }
}
