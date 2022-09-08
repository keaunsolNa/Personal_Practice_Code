package queue;

public class Simulation {
	static int numServers;
	static int numClients;
	static int meanServiceTime;
	static int meanInterarrivalTime;
	static Server[] servers;
	static Client[] clients;
	static Queue queue = new ArrayQueue();
	static java.util.Random randomArrival;
	static java.util.Random randomService;
	
	public static void main(String[] args) {
		init(args);
		for(int t = 0; ; t++) {
			if(t == meanInterarrivalTime) {
				Client client = clients[t++] = new SimClient(numClients, t);
				queue.add(client);
				meanInterarrivalTime = t + randomArrival.nextInt();
			}
			for(int j = 0; j < numServers; j++) {
				Server server = servers[j];
				if(t == server.getStopTime()) server.stopServing(t);
				if(server.isIdle() && !queue.isEmpty()) {
					Client client = (SimClient)queue.remove();
					server.startServing(client, t);
				}
			}
		}
	}
	
	static void init(String[] args) {
		if(args.length<4) {
			System.out.println("Usage : java Simulation <numServers>" + "<numClient> <meanServiceTime> < meanInterarrivalTime>" );
			System.out.println(" e.g.: java Simulation 3 100 12 4");
			System.exit(0);
		}
		numServers = Integer.parseInt(args[0]);
		numClients = Integer.parseInt(args[1]);
		meanServiceTime = Integer.parseInt(args[2]);
		meanInterarrivalTime = Integer.parseInt(args[3]);
		servers = new Server[numServers];
		clients = new Client[numClients];
		randomService = new ExponentialRandom(meanServiceTime);
		randomArrival = new ExponentialRandom(meanInterarrivalTime);
		queue = new ArrayQueue();
		for(int j = 0; j< numServers; j++)
			servers[j] = new SimServer(j, randomService.nextInt());
		System.out.println("     Number of servers = " + numServers);
		System.out.println("     Number of clients = " + numClients);
		System.out.println("     Mean Service time = " + meanServiceTime);
		System.out.println(" Mean Interarrival time = " + meanInterarrivalTime);
		for(int j = 0; j < numServers; j++) {
			System.out.println("Mean service time for " + servers[j] + "=" + servers[j].getMeanServiceTime());
		} 
	}
}
