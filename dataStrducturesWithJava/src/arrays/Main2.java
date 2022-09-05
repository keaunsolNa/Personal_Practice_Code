package arrays;

import java.io.*;						// defines the FileReader and BufferdReader classes
import java.util.StringTokenizer;

public class Main2 {

	public Main2(String file) {
		Map map = new ArrayMap();
		int lineNumber = 0;
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line = in.readLine();
			while(line != null) {
				++lineNumber;
					// 라인을 처리
				StringTokenizer parser = new StringTokenizer(line, " ,:;-.?!");
				while(parser.hasMoreTokens()) {
					String word = parser.nextToken().toUpperCase();
						// 단어를 처리
					String list = map.get(word);
					if(list == null) map.put(word, "" + lineNumber);
					else map.put(word, list + "," + lineNumber);
				}
				System.out.println(lineNumber + ":\t" + line);
				line = in.readLine();
			}
			in.close();
		} catch (IOException e) { System.out.println(e);}
		System.out.println(map);
		System.out.println("lines: " + lineNumber);
		System.out.println("distinct words: " + map.size());
	}
	
	public static void main(String[] args) {
		new Main2(args[0]);
	}
}
