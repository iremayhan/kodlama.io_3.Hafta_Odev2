package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.name="Mouse";
		product.price = 10;
		
		manager.add(product);
		
		DatabaseHelper.Crud.delete();
		DatabaseHelper.Connection.createConnection();
	}
	
	//ENGİN HOCA UYARIYOR: STATİCLERİ BİL AMA UYGULAMA, BEST PRACTİCE İÇİN UYGUN DEĞİL. GEREKLİYSE CLASSLARI AYIRMALISIN.
	
}
