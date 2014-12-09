public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
public void setup()  
{            
     noLoop();  
}  
public void draw()  
{   
	for (int i = 2; i< e.length()-10; i++)
	{
		Double tenDig = Double.parseDouble(e.substring(i, i+10));
		if (isPrime(tenDig) == true)
		{
			println(tenDig);
			break;
		}
	}
}  
public boolean isPrime(double dNum)  
{   
	if (dNum < 2)
	{
		return false;
	}
    for (int p = 2; p <= Math.sqrt(dNum); p++)
    {
    	if (dNum % p == 0)
    	{
    		return false;
    	}
    }
    return true;  
} 