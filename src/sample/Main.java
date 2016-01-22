package sample;


import java.util.HashMap;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Hashtable<String,String> hashtableobj = new Hashtable<String,String>();
        hashtableobj.put("Alive is","Awesome");
        hashtableobj.put("Love","yourself");
        System.out.println("Hashtable object output:"+hashtableobj);

        HashMap hashmapobj = new HashMap();
        hashmapobj.put("Alive is","Awesome");
        hashmapobj.put("Love","yourself");
        System.out.print("HashMap object output:" +hashmapobj);

    }
}
