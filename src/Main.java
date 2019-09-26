import java.io.*;
import java.util.*;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class Main {
	
    public static void main(String[] args) throws IOException{
    	FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);
        String jsonString = "";
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = new JSONObject(jsonString);

        String zeile = "";

        while( (zeile = br.readLine()) != null )
        {
        	jsonString = jsonString + zeile;
        }
        System.out.println(jsonString);
        br.close();
    }
}
