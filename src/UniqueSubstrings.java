import java.io.*;
import java.util.HashMap;

public class UniqueSubstrings {

	public static void main(String[] args) {
		try{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String input = br.readLine();
		int ans = 0;
		HashMap<String,Boolean> map = new HashMap<String,Boolean>();
		for(int i = 0;i<input.length();i++){
			for(int j = i+1;j<=input.length();j++){
				String subString = input.substring(i,j);
				if(map.containsKey(subString)){
					continue;
				}
				ans++;
				map.put(subString, true);
			}
		}
		
		
		System.out.println(ans);
		}
		catch(IOException e){
			
		}
	}

}
