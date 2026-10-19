package Generics;

import java.util.ArrayList;

public class customArrayList<T> {
    
    private T[] data ;
    private static int DEFAULT_SIZE=10;
    private  int size =0;
    public customArrayList(){
        data=new T[DEFAULT_SIZE];
    }
    public T add (int num){
        if(isFull()){
              resize();
        }
    }

    private void resize() {
        T[] temp = new T[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];

        }
        data=temp;
    }
    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }


    private boolean    isFull() {
        return size == data.length;
    }

    public static void main(String[] args) {
        ArrayList list =  new ArrayList();
        
        
    }
}
