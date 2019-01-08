import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
public void setup()  
{            
    int beginInt = 2;
    int endInt = 12;
    String digits = e.substring(beginInt, endInt);
	double dNum = Double.parseDouble(digits);
	while (isPrime(dNum) == false){
		beginInt++;
		endInt++;
		digits = e.substring(beginInt, endInt);
	    dNum = Double.parseDouble(digits);
	    isPrime(dNum);
	}
	System.out.println(dNum);
    //your code here 
}  
public void draw()  
{   
	//not needed for this assignment
}  
public boolean isPrime(double dNum)  
{   
    boolean bool = true;
  if (dNum < 2){
    bool = false;
  } else {
    for (int i = 2; i <= Math.sqrt(dNum); i++){
      if (dNum%i == 0){
        bool = false;
      } 
    }
  }
  return bool;  
} 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
