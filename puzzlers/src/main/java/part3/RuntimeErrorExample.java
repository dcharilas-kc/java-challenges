package part3;

import java.util.ArrayList;

public class RuntimeErrorExample{

    private ArrayList<String> list = new ArrayList<String>();

    public void printLastThing(){
        int lastIndex = list.size() - 1;
        String thing = list.get(lastIndex);
        System.out.println(thing);
    }

    public static void main(String[] args){
        RuntimeErrorExample example = new RuntimeErrorExample();
        example.printLastThing();
    }
}