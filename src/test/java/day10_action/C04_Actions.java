package day10_action;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C04_Actions extends TestBase {


       //  /*
   // Yeni bir class olusturalim: MouseActions2
//1- https://demoqa.com/droppable adresine gidelim

        @Test
            public void test01() throws InterruptedException {
            driver.get("https://demoqa.com/droppable");

//2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
            Actions actions=new Actions(driver);
            WebElement tasinacakElement=driver.findElement(By.xpath("//div[@id='draggable']"));
            WebElement hedefElement= driver.findElement(By.xpath("//div[@id='droppable'][1]"));
            actions.dragAndDrop(tasinacakElement,hedefElement).perform();

//3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin
            WebElement sonucYaziElementi= driver.findElement(By.xpath("//*[text()='Dropped!']"));
            String expectedYazi="Dropped!";
            String actualElement=sonucYaziElementi.getText();
            Assert.assertEquals(expectedYazi,actualElement);
Thread.sleep(5000);
    }
}
