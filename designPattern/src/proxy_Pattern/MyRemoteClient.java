package proxy_Pattern;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRemoteClient {
	public static void main(String[] args) {
		new MyRemoteClient().go();
	}
	
	public void go() {
		
		try {
			MyRemote service = (MyRemote) Naming.lookup("rmi://172.30.1.10/RemoteHello");
			
			String s = service.sayHello();
			
			System.out.println(s);
			
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
		
	}
}
