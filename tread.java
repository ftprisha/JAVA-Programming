import java.io.*;
import java.util.*;

class a extends Thread{
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println(i);
			}
		}
	}
class b extends Thread {
	public void run(){
		for(int j=0;j<=5;j++){
			System.out.println(j);
			}
		}
	}

class tread{
	public static void main(String[] args){
		a A =new a();
		A.start();
		b B =new b();
		B.start();
	}
}