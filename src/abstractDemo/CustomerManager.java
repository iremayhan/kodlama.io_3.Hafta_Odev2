package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;//bu base sınıf bizim stratejimiz görevini görüyor.
	//yani kullanırken ben hangi veritabanını vermek istersem artık onu rahatlıkla kullanabiliyor olacağız.
	
	public void getCustomers() {
		databaseManager.getData();
	}
}
