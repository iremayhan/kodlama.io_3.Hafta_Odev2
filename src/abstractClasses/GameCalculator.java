package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	
//abstract: benim bir tane operasyonum var, kim onun classını inherit ediyorsa o operasyonu kendi yazmak zorunda demektir.
	
//abstract yazdık ve artık hesapla imzası her sınıfta olmak zorunda
	
//abstract yaptığımızda kim inherit ediyorsa kendi classında hesaplayı yazmak zorunda demiş oluyoruz.
//nasıl ki final yazdığımızda override edilemiyorsa abstract yazdığımızda override edilmek zorunda.

//abstract sınıfın abstract olabilmesi için abstract ile beslenmesi gerekiyor (operasyonda da öyle)
//abstract sınıfta abstract operasyon olmak zorunda değil.
//abstractlar base'i gizlemek istediğimiz zaman da kullanılır.
//abstract sınıflar ASLA newlenemez. yani abstract sınıflar tek başına kullanılamaz(yapısal olarak standart bir sınıf gibidir.)
//abstract sınıfı inherit eden sınıfı newleyebiliriz.

	public final void gameOver() {
		System.out.println("Oyun bitti.");
	}
}
