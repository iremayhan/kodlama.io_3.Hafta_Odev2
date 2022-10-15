package staticDemo;

public class ProductValidator {
	//static yapmak bir kullanıcı nesneyi oluşturuyor sonra tüm kullanıcılar onu kullanıyor demek.
	//manager araçları static yapılmaz. sadece kullan-bırak yardımcı araçlar yapılabiliyor.
	//bir methodu static yaptığın zaman class ismiyle direkt çağırılır ve çağrıldığı anda da bellekte oluşturulur.
	//static olmayanları (yapıcı blokları) kullanabilmek için newlememiz gerekir.
	//static ortamda static blok çalıştırmak istersek classın içinde direkt olarak static blok çalıştırıyoruz.
	
	static {
		System.out.println("Static yapıcı blok çalıştı.");
	}
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	public static class BaşkabiClass{
		//ana class ASLA static olaMAZ.
		//ana class içerisindeki başka bir class oluşturduğumuzda o classa static verebiliriz.
	}
}
