package intro;

public class Main {

	public static void main(String[] args) {
		//değişken isimlendirlemeleri camelCase yazılır
		String ortaMetin="ilginizi çekebilir";
		String altMetin="vade süresi";
		System.out.println(ortaMetin);
		System.out.println(altMetin);
		
		double dolarDun=18.14;
		double dolarBugün=18.04;
		
		String okYonu="";
		if (dolarDun<dolarBugün) {
			okYonu="up.svg";
			System.out.println(okYonu);
		} else if(dolarDun>dolarBugün) {
			okYonu="down.svg";
			System.out.println(okYonu);
		}
		
		else {
			okYonu="equal.svg";
			System.out.println(okYonu);

		}
		String[] krediler={"hızlı kredi","maaşını halkbanktan alanlar","kredi x"};
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
	}

}
