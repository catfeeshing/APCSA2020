package DataLab;

public class CerealBox {
	public static void main(String[] args) {
		Cereal yikesOats = new Cereal("Yikes Oats", 'A');
		System.out.println(yikesOats.toString());
		System.out.println(yikesOats.getCals());
	}
}
