package week3.day2;

public class JavaConnection extends MySqlConnection implements DatabaseConnection{

	public void connect() {
		System.out.println("Connect the network");
	}

	public void disconnect() {
		System.out.println("Disconnect the network");
		
	}

	public void executeUpdate() {
		System.out.println("Execute the updated code");
		
	}
	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();

	}

	@Override
	public void executeQuery() {
		System.out.println("Execute the Query");
	}

}
