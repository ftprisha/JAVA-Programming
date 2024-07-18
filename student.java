import java.io.*;
import java.util.*;

class student {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter student name,mark 1,2,3,4,5");
        int m1,m2,m3,m4,m5; 
        String name;
        name=s.next();
        m1=s.nextInt();
        m2=s.nextInt();
        m3=s.nextInt();
        m4=s.nextInt();
        m5=s.nextInt();
        System.out.println("name");
        System.out.println("total="+(m1+m2+m3+m4+m5));  
        System.out.println("average="+((m1+m2+m3+m4+m5)/5));
}
}      
      