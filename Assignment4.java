public class Assignment4
{
public static void main(String[] args)
{
 char x = '*';
 if ((x >= 65 && x <= 90) || (x >= 97 && x <= 122))
{
System.out.print("ALPHABETS");
}
else if(x >= 48 && x <= 57)
{
System.out.print("DIGITS");
}
else
{
System.out.print("SPECIAL CHARACTERS");
}
}
}
