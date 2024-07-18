import java.io.*;
import java.util.*;

class address {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name, fname, sname, area, city;
        long dno, pin;
        
        System.out.println("Enter name, father name, street name, area, city, door no, and pin:");
        
        name = s.next();
        fname = s.next();
        sname = s.next();
        area = s.next();
        city = s.next();
        dno = s.nextLong();
        pin = s.nextLong();
        
        System.out.println(name + "\n" + fname + "\n" + sname + "\n" + dno + "\n" + area + "\n" + city + "\n" + pin);
    }
}
