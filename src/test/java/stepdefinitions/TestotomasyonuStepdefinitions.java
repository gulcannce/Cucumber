package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.K;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestotomasyonuStepdefinitions {
    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();



    @Given("kullanıcı test otomasyonu sayfasına gider")
    public void kullanıcı_test_otomasyonu_sayfasına_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));


    }
    @When("arama kutusuna phone yazıp aratır")
    public void arama_kutusuna_phone_yazıp_aratır() {
        testotomasyonuPage.aramakutusu.sendKeys("phone" + Keys.ENTER);
        

    }
    @Then("arama sonucunda ürün bulunabildiğini test eder")
    public void arama_sonucunda_ürün_bulunabildiğini_test_eder() {
        Assertions.assertTrue(testotomasyonuPage.sonucElementleriList.size()>0);

    }
    @Then("sayfayı kapatır")
    public void sayfayı_kapatır() {
        Driver.quitDriver();

    }

    @When("arama kutusuna dress yazıp aratır")
    public void aramaKutusunaDressYazıpAratır() {
        testotomasyonuPage.aramakutusu.sendKeys("dress" + Keys.ENTER);
    }

    @When("arama kutusuna samsung yazıp aratır")
    public void aramaKutusunaSamsungYazıpAratır() {
        testotomasyonuPage.aramakutusu.sendKeys("samsung" + Keys.ENTER);
    }


    @When("arama kutusuna {string} yazıp aratır")
    public void aramaKutusunaYazıpAratır(String istenenKelime) {

        testotomasyonuPage.aramakutusu.sendKeys(istenenKelime + Keys.ENTER);
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int beklenecekSure) {

        try {
            Thread.sleep(beklenecekSure*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String configdenIstenenUrl) {
        Driver.getDriver().get(   ConfigReader.getProperty(configdenIstenenUrl)   );

    }
    @Then("account butonuna basar")
    public void account_butonuna_basar() {
        testotomasyonuPage.accountLinki.click();
    }
    @Then("email olarak {string} girer")
    public void email_olarak_girer(String configVerilenEmail) {
        testotomasyonuPage.loginEmailKutusu.sendKeys(  ConfigReader.getProperty(configVerilenEmail)     );
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String configVerilenPassword) {
        testotomasyonuPage.loginPasswordKutusu
                .sendKeys(   ConfigReader.getProperty(configVerilenPassword)   );
    }
    @Then("signIn butonuna basar")
    public void sign_in_butonuna_basar() {
        testotomasyonuPage.loginSiginButonu
                .click();
    }
    @Then("basarili giris yapilabildigini test eder")
    public void basarili_giris_yapilabildigini_test_eder() {
        Assertions.assertTrue(  testotomasyonuPage.logOutButonu.isDisplayed());

    }

    @And("giriş yapılamadıgını test eder")
    public void girişYapılamadıgınıTestEderTestEder() {

        Assertions.assertTrue(testotomasyonuPage.loginSiginButonu.isDisplayed());
    }
}


