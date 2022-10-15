package interfaces;

public class Main {

	public static void main(String[] args) {
		//interfaceler de abstractlar gibi newlenemezler
		//ama Interface onu implemente eden classın referansını tutabilir.
		//kim implementedecekse ayrıca etsin dediğimiz durumlarda interfaceler kullanılır.
		//bir class birden fazla interfacei implemente edebilir.(ama bir class sadece 1 tane classı extend edebilir.)
		//hatta bir class SADECE 1 classı ya da 1 abstract class ı extend edebilir.
		//interfaceler polymorphism için güzel bir kullanım alanıdır.
		//1)interfaceler referans tutabiliyor!!
		//2)interface imzası ile çalışıyor.
		//3)interface'i kim kullanacaksa implemente etmesi gerekiyor.
		
		CustomerManager customerManager = new CustomerManager(new SqlServerCustomerDal());
		customerManager.add();
		
	}

}
