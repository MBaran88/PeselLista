package com.PESELSet;

/**
 * Created by RENT on 2017-05-25.
 */
public class PeselItem {
    private Object data;
    private PeselItem next;

    public PeselItem(Object data){
        this.data = data;
    }
    public void setNext(PeselItem next){
        this.next = next;
    }
    public PeselItem getNext(){
        return this.next;
    }
    public Object getData(){
        return this.data;
    }
}
