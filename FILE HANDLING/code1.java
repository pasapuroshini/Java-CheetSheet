import java.io.*;
import java.util.Scanner;

public class Main{
  public static String encrypt(String message)
  {
    StringBuilder encry=new StringBuilder();
    for(char ch:message.toCharArray())
      {
          encry.append((char)(ch+1);
      }
    return encry.toString();
  }

public static  String decrypt(String encryptedmessage)
  {
StringBuilder decryp= new StringBuilder();
    for(char ch: encryptedmessage.toCharArray())
      {
        decryp.append((char)(ch-1));
      }

    return decryp.toString();
  }

public static void main(String[] args)
  {
 Scanner sc= new Scanner(System.in);
    String message=sc.nextLine();
    String encryptedmessage= encrypt(message);
    System.out.println("Encrypted Message:"+encryptedMessage);
    try(FileWriter writer= new FileWriter("encrypted_data.txt"))
      {
        writer.write(encryptedmessage);
      }
    catch(IOException e)
      {
         e.printStackTrace();
      }
    StringBuilder readencryp= new StringBuilder();
    try(BufferedReader br= new BufferedReader(new FileReader("encrypted_data.txt")))
      {
        String line;
        while((line=reader.readLine())!=null)
          {
            readencryp.append(line);
          }
      }
    catch(IO Exception e)
      {
        e.printStackTrace();
      }
    String decryptedMessage = decrypt(readEncrypted.toString());
        System.out.println("Decrypted Message: " + decryptedMessage);
  }
}
