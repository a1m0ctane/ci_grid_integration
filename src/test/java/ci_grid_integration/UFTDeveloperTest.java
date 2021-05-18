package ci_grid_integration;

import com.hp.lft.report.ReportException;
import com.hp.lft.report.Reporter;
import com.hp.lft.sdk.web.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;

import unittesting.*;

public class UFTDeveloperTest extends UnitTestClassBase {

    public UFTDeveloperTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new UFTDeveloperTest();
        globalSetup(UFTDeveloperTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void ChromeLinux() throws GeneralLeanFtException, InterruptedException {
        BrowserDescription browserDesc = new BrowserDescription.Builder().build();
        browserDesc.set("ostype", "Linux");
        browserDesc.set("type", BrowserType.CHROME);
        mainTest(browserDesc);

    }


    @Test
    public void FirefoxLinux() throws GeneralLeanFtException, InterruptedException {
        BrowserDescription browserDesc = new BrowserDescription.Builder().build();
        browserDesc.set("ostype", "Linux");
        browserDesc.set("type", BrowserType.FIREFOX);

        mainTest(browserDesc);
    }

    @Test
    public void ChromeAny() throws GeneralLeanFtException, InterruptedException {
        BrowserDescription browserDesc = new BrowserDescription.Builder().build();
        browserDesc.set("type", BrowserType.CHROME);

        mainTest(browserDesc);
    }


    @Test
    public void FirefoxAny() throws GeneralLeanFtException, InterruptedException {
        BrowserDescription browserDesc = new BrowserDescription.Builder().build();
        browserDesc.set("type", BrowserType.FIREFOX);

        mainTest(browserDesc);
    }

    @Test
    public void EdgeWindows() throws GeneralLeanFtException, InterruptedException {
        BrowserDescription browserDesc = new BrowserDescription.Builder().build();
        browserDesc.set("ostype", "Windows");
        browserDesc.set("type", BrowserType.EDGE_CHROMIUM);

        mainTest(browserDesc);
    }



    private void mainTest(BrowserDescription pBrowser) throws GeneralLeanFtException, InterruptedException {

        Browser browser = BrowserFactory.launch(pBrowser);

        browser.navigate("https://www.advantageonlineshopping.com/#/");
        Thread.sleep(3000);
        AOSapp AppUT = new AOSapp(browser);

        AppUT.Homepage().UserMenu().click();
        AppUT.Homepage().Username().setValue("Amir");
        AppUT.Homepage().Password().setValue("Khan");
        AppUT.Homepage().Login().click();

        Thread.sleep(5000);

        browser.close();


    }

}