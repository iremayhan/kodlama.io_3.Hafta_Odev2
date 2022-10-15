package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}
//javada bir classın temel operasyonu aksini belirtmediğimiz sürece overridable (üzerine yazılabilir).
//Yani herhangi bir classı inherit eden başka bir class inherit ettiği classı ezebilir.(overridable)
//inherit edilen classta final(public final double gibi) anahtar kelimesi ile overridable edilmenin önüne geçilebilir.
