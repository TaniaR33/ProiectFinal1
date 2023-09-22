package ProiectFinal;

import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Proiect_final2_categorii.Validation1;

public class TestWeb extends pageSetup {
	@Test
	public void adaugareProdus() throws InterruptedException {
		Validation.Validare();
		WebElement menu = driver.findElement(By.id("spverticalmenu_1"));
		Actions action = new Actions(driver);
		action.sendKeys("key");
		
		WebElement jucarii = driver
				.findElement(By.xpath("/html/body/main/header/div/div[3]/div/div/div[1]/div/nav/div[2]/div/ul/li[5]/a"));
		jucarii.click();
		Thread.sleep(1000);
		
		WebElement toy = driver.findElement(By.xpath(
				"/html/body/main/section/div/div/div[2]/section/section/div[2]/div/div/article[1]/div/div/div[2]/div[1]/h1/a"));
		toy.click();
		Thread.sleep(1000);
		
		WebElement adaugaCantitate = driver.findElement(By.xpath(
				"/html/body/main/section/div/div/section/div/div[1]/div/div[2]/div[5]/div/form/div[2]/div/div[1]/div/span[3]/button[1]/i"));
		adaugaCantitate.click();
		Thread.sleep(1000);
		
		WebElement adaugaCos = driver.findElement(By.xpath(
				"/html/body/main/section/div/div/section/div/div[1]/div/div[2]/div[5]/div/form/div[2]/div/div[2]/button"));
		adaugaCos.click();
		Thread.sleep(2000);
		Validation.mesajdeAdaugareInCos();
		Thread.sleep(1000);
		Validation.mesaj_cantitate();

		WebElement ButonClose = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/button/span"));
		ButonClose.click();
		Thread.sleep(1000);
		
		WebElement autoaparare = driver.findElement(
				By.cssSelector("li.group:nth-child(2) > a:nth-child(1)"));
		autoaparare.click();
		Thread.sleep(1000);

		WebElement tonfa = driver.findElement(By.xpath(
				"/html/body/main/section/div/div/div[2]/section/section/div[2]/div/div/article[3]/div/div/div[2]/div[1]/h1/a"));
		tonfa.click();
		Thread.sleep(1000);

		WebElement adaugareAltProdus = driver.findElement(By.xpath(
				"/html/body/main/section/div/div/section/div/div[1]/div/div[2]/div[5]/div/form/div[2]/div/div[2]/button"));
		adaugareAltProdus.click();
		Thread.sleep(2000);
		
		WebElement finComanda = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div/a"));
		finComanda.click();
		Thread.sleep(3000);

		WebElement StergereProdus = driver.findElement(By.xpath(
				"/html/body/main/section/div/div/form/div[5]/fieldset/div/div/div[2]/div/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div[5]/div/div/span[1]/button"));
		Thread.sleep(2000);
		StergereProdus.click();
		Thread.sleep(2000);
		Validation.Stergererodus();
		
        WebElement email = driver.findElement(By.id("email"));
		Thread.sleep(1000);
		email.sendKeys("tygu@gmail.com");
		Thread.sleep(1000);
		
		WebElement nume_prenume = driver.findElement(By.xpath(
				"/html/body/main/section/div/div/form/div[5]/fieldset/div/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div/input"));
		nume_prenume.sendKeys("Rusu Ian");
		Thread.sleep(1000);
		
		WebElement telefon = driver.findElement(By.xpath(
				"/html/body/main/section/div/div/form/div[5]/fieldset/div/div/div[1]/div/div[2]/div/div[2]/div/div[2]/div/input"));
		Thread.sleep(1000);
		telefon.sendKeys("0765432123");
		
		WebElement judet = driver.findElement(By.xpath(
				"/html/body/main/section/div/div/form/div[5]/fieldset/div/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[1]/div/select"));
		judet.click();
		Thread.sleep(1000);
		
		WebElement judet1 = driver.findElement(By.id("AG"));
		judet1.click();
		Thread.sleep(1000);
		
		WebElement oras = driver.findElement(By.xpath(
				"/html/body/main/section/div/div/form/div[5]/fieldset/div/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div[2]/div/input"));
		oras.sendKeys("Arges");
		Thread.sleep(2000);
		
		WebElement adresa = driver.findElement(By.xpath(
				"/html/body/main/section/div/div/form/div[5]/fieldset/div/div/div[1]/div/div[2]/div/div[2]/div/div[4]/div/input"));
		adresa.sendKeys("Calea Onesti 77");
        Thread.sleep(1000);
		
        WebElement plasareComanda = driver.findElement(By.id("supercheckout_confirm_order"));
		Thread.sleep(2000);
	    plasareComanda.click();
		Thread.sleep(4000);
		Validation.confirmareComanda();
		Thread.sleep(3000);
	}
	@Test
	public void search() throws InterruptedException {
		WebElement search_box = driver.findElement(
				By.xpath("/html/body/main/header/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/form/div[2]/input"));
		search_box.sendKeys(" ");
		Thread.sleep(1000);
		
		WebElement search_enter = driver.findElement(
				By.xpath("/html/body/main/header/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/form/div[2]/button"));
		search_enter.click();
		Thread.sleep(1000);
		Validation.cautare_spatiuGol();
		driver.navigate().back();
		Thread.sleep(1000);
		WebElement search_box1 = driver.findElement(
				By.xpath("/html/body/main/header/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/form/div[2]/input"));
		search_box1.sendKeys("tv");
		
		WebElement search_enter1 = driver.findElement(
				By.xpath("/html/body/main/header/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/form/div[2]/button"));
		search_enter1.click();
		Thread.sleep(1000);
		Validation.cautare_tv();
		driver.navigate().back();
		Thread.sleep(1000);
		
        WebElement search_box2 = driver.findElement(
				By.xpath("/html/body/main/header/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/form/div[2]/input"));
		search_box2.sendKeys("briceag");
		Thread.sleep(1000);
		search_box2.clear();
		Thread.sleep(1000);
		search_box2.sendKeys("bricheta");
		
		WebElement search_enter2 = driver.findElement(
				By.xpath("/html/body/main/header/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/form/div[2]/button"));
		search_enter2.click();
		Thread.sleep(1000);
		Validation.cautareBricheta();
		driver.navigate().back();
		
		WebElement search_box3 = driver.findElement(
				By.xpath("/html/body/main/header/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/form/div[2]/input"));
		
		WebElement categoria_Panouri_Solare = driver.findElement(By.xpath(
				"/html/body/main/header/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/form/div[1]/select/option[53]"));
		categoria_Panouri_Solare.click();
		Thread.sleep(2000);

		search_box3.sendKeys("peruca");
		Thread.sleep(2000);

		WebElement search_enter3 = driver.findElement(
				By.xpath("/html/body/main/header/div/div[1]/div/div/div[2]/div/div/div[1]/div/div/form/div[2]/button"));
		search_enter3.click();
		Thread.sleep(2000);
		Validation.cautare_Peruca_categoriaPanouriSolare();
	}

	@Test
	public void Creare_cont_fara_Prenume() throws InterruptedException {
		WebElement Conectare_Cont = driver
				.findElement(By.xpath("/html/body/main/header/div/nav/div/div/div/div[2]/div/div[2]/a[2]"));
		Conectare_Cont.click();
		Thread.sleep(2000);
		
		WebElement Creare_Cont_Nou = driver.findElement(By.linkText("Nu ai cont? Creati unul aici"));
		Creare_Cont_Nou.click();
		Thread.sleep(2000);
		
		WebElement nume = driver.findElement(
				By.xpath("/html/body/main/section/div/div/section/section/section/form/section/div[3]/div[1]/input"));
		nume.sendKeys("Amy");
		
		WebElement email = driver.findElement(
				By.xpath("/html/body/main/section/div/div/section/section/section/form/section/div[4]/div[1]/input"));
		email.sendKeys("taattt3308@gmail.com");
		Thread.sleep(1000);
		
		WebElement parola = driver.findElement(By
				.xpath("/html/body/main/section/div/div/section/section/section/form/section/div[5]/div[1]/div/input"));
		Thread.sleep(1000);
		parola.sendKeys("123456789t");
		Thread.sleep(1000);
		
		WebElement acceptare_Termeni = driver.findElement(By.xpath(
				"/html/body/main/section/div/div/section/section/section/form/section/div[6]/div[1]/span/input"));
		Thread.sleep(3000);
		acceptare_Termeni.click();
		Thread.sleep(1000);
		
		WebElement salveaza = driver
				.findElement(By.xpath("/html/body/main/section/div/div/section/section/section/form/footer/button"));
		Thread.sleep(1000);
		salveaza.click();
		String prenume = driver.findElement(By.name("firstname")).getAttribute("validationMessage"); 
		Validation.creareCont_lipsaPrenume(prenume);
		Thread.sleep(3000);
	}

	@Test
	public void Creare_cont_fara_Aceptarea_Termenilor() throws InterruptedException {
		WebElement Conectare_Cont = driver
				.findElement(By.xpath("/html/body/main/header/div/nav/div/div/div/div[2]/div/div[2]/a[2]"));
		Conectare_Cont.click();
		Thread.sleep(1000);
		
		WebElement Creare_Cont_Nou = driver.findElement(By.linkText("Nu ai cont? Creati unul aici"));
		Creare_Cont_Nou.click();
		Thread.sleep(1000);
		
		WebElement prenume = driver.findElement(
				By.xpath("/html/body/main/section/div/div/section/section/section/form/section/div[2]/div[1]/input"));
		prenume.sendKeys("Anatol");
		
		WebElement nume = driver.findElement(
				By.xpath("/html/body/main/section/div/div/section/section/section/form/section/div[3]/div[1]/input"));
		nume.sendKeys("Amy");
		
		WebElement email = driver.findElement(
				By.xpath("/html/body/main/section/div/div/section/section/section/form/section/div[4]/div[1]/input"));
		email.sendKeys("t22attt0@gmail.com");
		Thread.sleep(1000);
		
		WebElement parola = driver.findElement(By
				.xpath("/html/body/main/section/div/div/section/section/section/form/section/div[5]/div[1]/div/input"));
		Thread.sleep(1000);
		parola.sendKeys("123456789t");
		Thread.sleep(1000);
		
		WebElement salveaza = driver
				.findElement(By.xpath("/html/body/main/section/div/div/section/section/section/form/footer/button"));
		Thread.sleep(1000);
		salveaza.click();
		String warning = driver.findElement(By.name("psgdpr")).getAttribute("validationMessage"); 
        Validation.lipsa_Bifare_Termeni();

	}

	@Test
	public void Creare_cont_valid() throws InterruptedException {
		WebElement Conectare_Cont = driver
				.findElement(By.xpath("/html/body/main/header/div/nav/div/div/div/div[2]/div/div[2]/a[2]"));
		Conectare_Cont.click();
		Thread.sleep(1000);
		
		WebElement Creare_Cont_Nou = driver.findElement(By.linkText("Nu ai cont? Creati unul aici"));
		Creare_Cont_Nou.click();
		Thread.sleep(1000);
		
		WebElement prenume = driver.findElement(
				By.xpath("/html/body/main/section/div/div/section/section/section/form/section/div[2]/div[1]/input"));
		prenume.sendKeys("Anatol");
		
		WebElement nume = driver.findElement(
				By.xpath("/html/body/main/section/div/div/section/section/section/form/section/div[3]/div[1]/input"));
		nume.sendKeys("Amy");
		
		WebElement email = driver.findElement(
				By.xpath("/html/body/main/section/div/div/section/section/section/form/section/div[4]/div[1]/input"));
		email.sendKeys("woqqxbrtqqqtq123@gmail.com");
		Thread.sleep(1000);
		
		WebElement parola = driver.findElement(By
				.xpath("/html/body/main/section/div/div/section/section/section/form/section/div[5]/div[1]/div/input"));
		Thread.sleep(1000);
		parola.sendKeys("123456789t");
		Thread.sleep(1000);
		
		WebElement acceptare_Termeni = driver.findElement(By.xpath(
				"/html/body/main/section/div/div/section/section/section/form/section/div[6]/div[1]/span/input"));
		Thread.sleep(3000);
		acceptare_Termeni.click();
		Thread.sleep(3000);
		
		WebElement salveaza = driver
				.findElement(By.xpath("/html/body/main/section/div/div/section/section/section/form/footer/button"));
		Thread.sleep(1000);
		salveaza.click();
		Thread.sleep(1000);
		
		WebElement Cont = driver
				.findElement(By.xpath("/html/body/main/header/div/nav/div/div/div/div[2]/div/div[2]/a[2]"));
		Cont.click();
		Thread.sleep(1000);
		Validation.crearea_Contului_Reusita();
		Thread.sleep(1000);
		
		WebElement Cutite = driver.findElement(
				By.xpath("/html/body/main/header/div/div[2]/div/div/div/div[2]/div/div/nav/div[2]/div/ul/li[3]/a"));
		Cutite.click();
		
		WebElement Pumnal = driver.findElement(By.xpath(
				"/html/body/main/section/div/div/div[2]/section/section/div[2]/div/div/article[7]/div/div/div[2]/div[1]/h1/a"));
		Pumnal.click();
		
		WebElement scrie_Recenzie = driver.findElement(
				By.xpath("/html/body/main/section/div/div/section/div/div[1]/div/div[2]/div[1]/div/div[2]/a[2]"));
		scrie_Recenzie.click();
		
		WebElement Stele = driver.findElement(By.xpath(
				"/html/body/main/section/div/div/section/div/div[1]/div/div[3]/div/div/div/div[2]/div[1]/div/div/div[2]/div/form/div/div/ul/li/div/label[5]"));
		Stele.click();
		
		WebElement titlu_Recenzie = driver.findElement(By.id("comment_title"));
		titlu_Recenzie.sendKeys("Sunt foarte multumita");
		
		WebElement Recenzie1 = driver.findElement(By.cssSelector("textarea.form-control"));
		Recenzie1.sendKeys("Comanda a ajuns foarte rapid si arata exact ca in poza");
		
		WebElement Trimite = driver.findElement(By.id("submitNewMessage"));
		Trimite.click();
		Thread.sleep(3000);
		Validation.adaugare_Recenzie();
		
		WebElement buton_Ok = driver.findElement(By.xpath(
				"/html/body/main/section/div/div/section/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/div/div/div[2]/div/p[2]/button/span"));
		buton_Ok.click();
	
	
	}
	}
