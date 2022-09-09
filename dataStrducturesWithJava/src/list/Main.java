package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List list = new LinkedList();
		for(int i = 0; i < args.length; i++) {
			int n = Integer.parseInt(args[i]);
			System.out.println(n + "\t");
			Integer x = new Integer(n);
			list.add(x);
		}
		
		System.out.println();
		int sum = 0;
		for (Iterator it = list.iterator(); it.hasNext();) {
			Integer x = (Integer)it.next();
			int n  = x.intValue();
			sum += n;
			System.out.println(sum + "\t");
		}
		System.out.println();
	}

}
