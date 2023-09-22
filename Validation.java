package ProiectFinal;

import org.junit.Assert;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Validation extends pageSetup {

	static void cautare_spatiuGol() {
		boolean condition3 = driver.getPageSource().contains("Cautati din nou ceea ce va intereseaza");

		if (condition3) {
			System.out.println("Mesaj de cautare afisat corect,deoarece campul search este gol.");
		} else {
			System.out.println("Mesaj de cautare afisat incorect");
		}
		Assert.assertTrue("Eroare cautare", condition3);
	}

	static void cautare_tv() {
		boolean condition4 = driver.getPageSource().contains("Cautati din nou ceea ce va intereseaza");

		if (condition4) {
			System.out.println("Mesaj de cautare afisat corect,deoarece acest produs nu exista pe pagina.");
		} else {
			System.out.println("Mesaj de cautare afisat incorect");
		}
		Assert.assertTrue("Produs inexistent pe pagina", condition4);
	}

	static void cautare_Peruca_categoriaPanouriSolare() {
		boolean condition2 = driver.getPageSource().contains("Cautati din nou ceea ce va intereseaza");

		if (condition2) {
			System.out.println(
					"Mesaj de cautare afisat corect,deoarece acest produs nu face parte din Categoria <Panouri solare>.");
		} else {
			System.out.println("Mesaj de cautare afisat incorect");
		}
		Assert.assertTrue("Eroare cautare", condition2);
	}

	static void cautareBricheta() {
		boolean condition1 = driver.getPageSource().contains("Bricheta");

		if (condition1) {
			System.out.println("Cautarea a afisat produsul:bricheta.");
		} else {
			System.out.println("Cautarea este invalida");
		}
		Assert.assertTrue("Produs inexistent pe pagina", condition1);
	}

	static void creareCont_lipsaPrenume(String prenume) {
		boolean condition5 = driver.getPageSource().contains(prenume);

		if (condition5) {
			System.out.println("Acest camp nu a fost completat");
		} else {
			System.out.println("Mesajul de eroare nu a aparut");
		}
		Assert.assertTrue("Mesajul de eroare nu a aparut cand prenumele nu a fost completat.", condition5);
	}

	static void lipsa_Bifare_Termeni() {
		boolean condition6 = driver.getPageSource().contains("warning");

		if (condition6) {
			System.out.println("Mesajul de eroare pentru acceptarea Termenilor si Conditiilor a aparut.");
		} else {
			System.out.println("Mesajul de eroare pentru acceptarea Termenilor si Conditiilor nu a aparut.");
		}
		Assert.assertTrue("Mesajul de eroare pentru acceptarea Termenilor si Conditiilor nu a aparut.", condition6);
	}

	public static void crearea_Contului_Reusita() {
		boolean condition6 = driver.getPageSource().contains("Contul tau");

		if (condition6) {
			System.out.println("Ai fost inregistrat cu succes");
		} else {
			System.out.println("Nu ai fost inregistrat cu succes");
		}
		Assert.assertTrue("Creare cont nereusita", condition6);
	}

	static void adaugare_Recenzie() {
		boolean condition7 = driver.getPageSource()
				.contains("Comentariu a fost transmis cu succes. Operatorul va vedea si aproba comentariu. Multumim.");

		if (condition7) {
			System.out.println("Comentariu adaugat");
		} else {
			System.out.println("Comentariu nu a fost adaugat");
		}
		Assert.assertTrue("Comentariu nu a fost adaugat", condition7);
	}

	static void Validare() {
		String titlu = driver.getCurrentUrl();
		if (titlu.equals("https://dalimag.ro/")) {
			System.out.println("Pagina valida");
		} else {
			System.out.println("Pagina invalida");
		}
	}

	static void mesajdeAdaugareInCos() {
		boolean condition = driver.getPageSource().contains("Produs adaugat cu succes in cosul de cumparaturi");
		if (condition) {
			System.out.println("Produsele au fost adaugate in cos");
		} else {
			System.out.println("Produdul nu a fost adaugat in cos");
		}
		Assert.assertTrue("Produsul nu a fost adaugat in cos!", condition);
	}

	static void mesaj_cantitate() {
		boolean condition3 = driver.getPageSource().contains("Sunt 2 produse in cos.");
		if (condition3) {
			System.out.println("Cantitatea dorita a fost adaugata in cos.");
		} else {
			System.out.println("Cantitatea dorita nu a fost adaugata in cos.");
		}
		Assert.assertTrue("Produsul nu a fost adaugat in cos!", condition3);
	}

	static void Stergererodus() {
		boolean condition4 = driver.getPageSource().contains("Produsele eliminate cu succes");
		if (condition4) {
			System.out.println("Produsul a fost eliminat din cos cu succes");
		} else {
			System.out.println("Produsul nu a fost eliminat din cos cu succes.");
		}
		Assert.assertTrue("Produsul nu a fost adaugat in cos!", condition4);
	}

	static void confirmareComanda() {
		boolean condition1 = driver.getPageSource().contains("Comanda ta este confirmata");

		if (condition1) {
			System.out.println("Comanda plasata");
		} else {
			System.out.println("Comanda nu a fost plasata");
		}
		Assert.assertTrue("Comanda nu a fost plasata cu succes", condition1);
	}
}
