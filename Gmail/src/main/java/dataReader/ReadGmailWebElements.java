package dataReader;

import base.CommonApi;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.How;
        import org.openqa.selenium.support.PageFactory;
        import reader.Readxls;

        import java.util.ArrayList;
        import java.util.List;

public class ReadGmailWebElements extends CommonApi {
    @FindBy(how = How.XPATH, xpath = "//h2[contains(text(),'About')]")
    WebElement about;
    @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='About American Express'][contains(text(),'About American Express')]")
    WebElement aboutAmericanExpress;
    @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='Investor Relations'][contains(text(),'Investor Relations')]")
    WebElement investorRelations;
    @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='Careers'][contains(text(),'Careers')]")
    WebElement careers;
    @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='Site Map'][contains(text(),'Site Map')]")
    WebElement siteMap;
    @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='Contact Us'][contains(text(),'Contact Us')]")
    WebElement contactUs;
    @FindBy(how = How.XPATH, xpath = "//h2[contains(text(),'Products & Services')]")
    WebElement productAndServices;
    @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='Credit Cards'][contains(text(),'Credit Cards')]")
    WebElement creditCards;
    @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='Small Business Credit Cards'][contains(text(),'Small Business Credit Cards')]")
    WebElement smallBusinessCreditCards;
    @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='Corporate Cards'][contains(text(),'Corporate Cards')]")
    WebElement corporateCards;
    @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='Prepaid Cards'][contains(text(),'Prepaid Cards')]")
    WebElement prepaidCards;
    @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='Savings Accounts & CDs'][contains(text(),'Savings Accounts & CDs')]")
    WebElement savingsAcoountsAndCds;
    @FindBy(xpath = "//ul[@class='axp-footer__dls__margin0___2Eiav axp-footer__dls__ulNav___31Cq4 axp-footer__dls__margin2T___1ZSVS axp-footer__dls__listLinks___2zEla']//a[@title='Gift Cards'][contains(text(),'Gift Cards')]")
    WebElement giftCards;

    public List webElementList(){
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(about);
        webElements.add(aboutAmericanExpress);
        webElements.add(investorRelations);
        webElements.add(careers);
        webElements.add(siteMap);
        webElements.add(contactUs);

        List<String> list = new ArrayList<>();
        for (int i = 0; i<webElements.size();i++){
            list.add(webElements.get(i).getText());
        }
        System.out.println(list);
        return list;
    }
    public List webElementList1(){
        List<WebElement> webElements1 = new ArrayList<>();
        webElements1.add(productAndServices);
        webElements1.add(creditCards);
        webElements1.add(smallBusinessCreditCards);
        webElements1.add (corporateCards);
        webElements1.add(prepaidCards);
        webElements1.add(savingsAcoountsAndCds);
        webElements1.add(giftCards);

        List<String> list = new ArrayList<>();
        for (int i = 0; i<webElements1.size();i++){
            list.add(webElements1.get(i).getText());
        }
        System.out.println(list);
        return list;
    }
    //Readxls readxls = PageFactory.initElements(driver,Readxls.class);
    Readxls xlData = new Readxls("/Users/nazibahfariha/Downloads/TeamAutomation2018-master/Gmail/Data/Gmail.xlsx");

    public List expectedWebElement(){
        int rowcount = xlData.getRowCount("HomeReview your privacy setting");
        List<String> expect = new ArrayList<>();
        for(int i = 1; i <= rowcount; i++){
            expect.add(xlData.getCellData("HomeReview your privacy setting","HomeReview your privacy setting",i));
        }
        System.out.println(expect);
        return expect;
    }

    Readxls xlData1 = new Readxls("/Users/nazibahfariha/Downloads/TeamAutomation2018-master/Gmail/Data/Gmail.xlsx");
    public List expectedWebElement1(){
        int rowcount = xlData1.getRowCount("Payments & Sub");
        List<String> expect = new ArrayList<>();
        for(int i = 1; i <= rowcount; i++){
            expect.add(xlData1.getCellData("Payments & Sub","Payments & Sub",i));
        }
        System.out.println(expect);
        return expect;
    }
}