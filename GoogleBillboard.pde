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
