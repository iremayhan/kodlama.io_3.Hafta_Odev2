package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new MySqlDatabaseManager(); //bu noktada yapmak istediğim işi işte yaptım.
		//istersem diğer veritabanı sistemleriyle değiştirerek çiçek gibi yazarım...
		customerManager.getCustomers();
	}

}
//bir sisteme yeni bir özellik getirildiğinde mevcuttaki hiçbir kodu değiştirmemelisin (SOLID'in O'su)(configuration değişebilir.)
