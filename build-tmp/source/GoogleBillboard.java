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

public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059921817413596629043572900334295260595630738132328627943490763233829880753195251019011573834187930702154089149934884167509244761460668082264800168477411853742345442437107539077744992069551702761838606261331384583000752044933826560297606737113200709328709127443747047230696977209310141692836819025515108657463772111252389784425056953696770785449969967946864454905987931636889230098793127736178215424999229576351482208269895193668033182528869398496465105820939239829488793320362509443117301238197068416140397019837679320683282376464804295311802328782509819455815301756717361332069811250996181881593041690351598888519345807273866738589422879228499892086805825749279610484198444363463244968487560233624827041978623209002160990235304369941849146314093431738143640546253152096183690888707";  

public void setup()  
{            
     noLoop();  
}  
public void draw()  
{   
	// for (int i = 2; i< e.length()-10; i++)
	// {
	// 	Double tenDig = Double.parseDouble(e.substring(i, i+10));
	// 	if (isPrime(tenDig) == true)
	// 	{
	// 		println(tenDig);
	// 		break;
	// 	}
	// }

	for (int i = 2; i< e.length()-10; i++)
	{
		String n = e.substring(i, i+10);
		if (isSum49(n))
		{
			println(n);
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

public boolean isSum49(String length10)
{
	int total=0;

	for ( int i = 0; i< 10 ; i++)
	{
		char charI = length10.charAt(i);
		int intI = (int)charI;
		total += intI;
		println(intI);
	}

	if (total == 49)
	{
		return true;
	}
	return false;
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
