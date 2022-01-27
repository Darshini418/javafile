import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Reg1{
    public static void main(String[] args){
        final String REGEX_PATTERN = "[a_k]";
        Pattern r = Pattern.compile(REGEX_PATTERN);
        try{
            FileReader fr = new FileReader("C:\\Users\\Indira\\Desktop\\work\\Data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                Matcher m = r.matcher(line);
                if(m.find()){
                    System.out.println(line);
                }
            }
            br.close();

        }catch(IOException e){
            System.out.println(e);
        
        }
    }
}