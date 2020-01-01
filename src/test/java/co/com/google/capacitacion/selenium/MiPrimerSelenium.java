package co.com.google.capacitacion.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiPrimerSelenium {

	public static void main(String[] args) {
		
		//Propidedad, valor(Ruta)
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe"); // se especifica la propiedad y el valor del driver
		WebDriver christopher = new ChromeDriver(); //creacion del objeto de tipo de WebDriver y con el constructor del chrome se inicializa
		christopher.manage().window().maximize();//maximizar pantalla
		christopher.get("https://www.google.com");//Abre el navegador en la ruta especifica
		
		christopher.findElement(By.name("q")).sendKeys("quesito");//busca el elemento y le envia el texto
		christopher.findElement(By.name("q")).sendKeys(Keys.ENTER);//se le envia el enter a la casilla de texto
		
		christopher.quit();
	}

}
