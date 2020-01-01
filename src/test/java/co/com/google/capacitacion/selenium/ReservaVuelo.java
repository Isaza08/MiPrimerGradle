package co.com.google.capacitacion.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReservaVuelo {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe"); // se especifica la propiedad y el valor del driver
		WebDriver driver = new ChromeDriver(); //creacion del objeto de tipo de WebDriver y con el constructor del chrome se inicializa
		driver.manage().window().maximize();//maximizar pantalla
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");//Abre el navegador en la ruta especifica
		
	//REGISTRO
//      driver.findElement(By.linkText("REGISTER")).click();//Click en la sección de registro
//		driver.findElement(By.name("firstName")).sendKeys("Christopher");
//		driver.findElement(By.name("lastName")).sendKeys("Vargas Isaza");
//		driver.findElement(By.name("phone")).sendKeys("3128049152");
//		driver.findElement(By.id("userName")).sendKeys("Christopher@unac.edu.co");
//		driver.findElement(By.name("address1")).sendKeys("Calle 48 # 16cc78");
//		driver.findElement(By.name("city")).sendKeys("Medellin");
//		driver.findElement(By.name("state")).sendKeys("Antioquia");
//		driver.findElement(By.name("postalCode")).sendKeys("789");
//		Select seleccionarPais = new Select(driver.findElement(By.name("country"))); //para acceder al select
//		seleccionarPais.selectByVisibleText("COLOMBIA");
//		driver.findElement(By.name("email")).sendKeys("christopher@unac.edu.co");
//		driver.findElement(By.name("password")).sendKeys("012523401");
//		driver.findElement(By.name("confirmPassword")).sendKeys("012523401");
//		driver.findElement(By.name("register")).click();
		
		//LOGIN
		driver.findElement(By.name("userName")).sendKeys("Hernan7589"); 
		driver.findElement(By.name("password")).sendKeys("Prueba999*");
		driver.findElement(By.name("login")).click();
		
		
		//SELECCION DEL VIAJE
		WebElement tipoDeViaje = driver.findElement(By.xpath("//input[@value='oneway']"));
		tipoDeViaje.click();
		
		Select seleccionarPasajeros = new Select(driver.findElement(By.name("passCount")));
		seleccionarPasajeros.selectByVisibleText("3");
		
		Select ciudadDeSalida= new Select(driver.findElement(By.name("fromPort")));
		ciudadDeSalida.selectByVisibleText("New York");
		
		Select mesDeSalida= new Select(driver.findElement(By.name("fromMonth")));
		mesDeSalida.selectByVisibleText("January");
		
		Select diaDeSalida= new Select(driver.findElement(By.name("fromDay")));
		diaDeSalida.selectByVisibleText("25");
		
		Select ciudadDeLlegada = new Select(driver.findElement(By.name("toPort")));
		ciudadDeLlegada.selectByVisibleText("Zurich");
		
		Select mesDeRetorno = new Select(driver.findElement(By.name("toMonth")));
		mesDeRetorno.selectByVisibleText("May");
		
		Select diaDeRetorno = new Select(driver.findElement(By.name("toDay")));
		diaDeRetorno.selectByVisibleText("10");
		
		WebElement preferenciaDeViaje = driver.findElement(By.xpath("//input[@value='First']"));
		preferenciaDeViaje.click();
		
		Select aerolinea = new Select(driver.findElement(By.name("airline")));
		aerolinea.selectByVisibleText("Blue Skies Airlines");
		
		driver.findElement(By.name("findFlights")).click();
		
		
		//SELECCION DEL PASAJE
		WebElement pasajeIda = driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']"));
		pasajeIda.click();
		
		WebElement pasajeRegreso = driver.findElement(By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30']"));
		pasajeRegreso.click();
		
		driver.findElement(By.name("reserveFlights")).click();
		
		
		//INFORMACION DEL PAGO
		driver.findElement(By.name("passFirst0")).sendKeys("Christopher"); 
		driver.findElement(By.name("passLast0")).sendKeys("Vargas"); 
		Select comida1 = new Select(driver.findElement(By.name("pass.0.meal")));
		comida1.selectByVisibleText("Bland");
		
		driver.findElement(By.name("passFirst1")).sendKeys("Maria"); 
		driver.findElement(By.name("passLast1")).sendKeys("Salazar"); 
		Select comida2 = new Select(driver.findElement(By.name("pass.1.meal")));
		comida2.selectByVisibleText("Low Calorie"); 
		
		driver.findElement(By.name("passFirst2")).sendKeys("Melissa"); 
		driver.findElement(By.name("passLast2")).sendKeys("Perez"); 
		Select comida3 = new Select(driver.findElement(By.name("pass.2.meal")));
		comida3.selectByVisibleText("Diabetic"); 
		
		
		//INFORMACION DE LA TARJETA DE CREDITO
		Select tarjetaDeCredito = new Select(driver.findElement(By.name("creditCard")));
		tarjetaDeCredito.selectByVisibleText("Visa");
		
		driver.findElement(By.name("creditnumber")).sendKeys("1234567898765432"); 
		
		Select mesDeExpiracion = new Select(driver.findElement(By.name("cc_exp_dt_mn")));
		mesDeExpiracion.selectByVisibleText("10");
		
		Select anhoDeExpiracion = new Select(driver.findElement(By.name("cc_exp_dt_yr")));
		anhoDeExpiracion.selectByVisibleText("2010");
		
		driver.findElement(By.name("cc_frst_name")).sendKeys("Christopher");
		driver.findElement(By.name("cc_last_name")).sendKeys("Vargas");
		
		//DIRECCION DE FACTURACION
		driver.findElement(By.name("billAddress1")).sendKeys("7429 Anstead Circle");
		driver.findElement(By.name("billCity")).sendKeys("Orlando");
		driver.findElement(By.name("billState")).sendKeys("Florida");
		driver.findElement(By.name("delZip")).sendKeys("7429");
		
		Select pais = new Select(driver.findElement(By.name("delCountry")));
		pais.selectByVisibleText("UNITED STATES");
		
		//DIRECCION DE ENTREGA
		driver.findElement(By.name("delAddress1")).sendKeys("7429 Anstead Circle");
		driver.findElement(By.name("delCity")).sendKeys("Orlando");
		driver.findElement(By.name("delState")).sendKeys("Florida");
		driver.findElement(By.name("delZip")).sendKeys("7429");
		
		Select pais2 = new Select(driver.findElement(By.name("delCountry")));
		pais2.selectByVisibleText("UNITED STATES");
		
		driver.findElement(By.name("buyFlights")).click();
	}
	

}
