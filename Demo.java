import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
class Demo
{
public static void main(String[] args)throws IOException
{
FileInputStream in=null;
FileOutputStream out=null;
try
{
in=new FileInputStream("C:/Users/Dell Store Una/Desktop/Dynamic/Storage.txt/File1.txt");
out=new FileOutputStream("C:/Users/Dell Store Una/Desktop/Dynamic/Storage.txt/File2.txt");
int c;
while((c=in.read())!=-1)
{
out.write(c);
}
}
finally
{if(in!=null){
in.close();
}
if(out!=null){
out.close();
}
}
in=new FileInputStream("C:/Users/Dell Store Una/Desktop/Dynamic/Storage.txt/File2.txt");
int c;
while((c=in.read())!=-1)
{
System.out.print((char)c);
}
}
}