import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.starcatwp.com/wp-login.php?redirect_to=https%3A%2F%2Ftest.starcatwp.com%2Fwp-admin%2F&reauth=1')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Log In  Starcat Testing  WordPress/input_Username or Email Address_log'), 
    'hello@pauple.com')

WebUI.setEncryptedText(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Log In  Starcat Testing  WordPress/input_Password_pwd'), 
    'Pe+uo40tC36STRx7NIxSrQ==')

WebUI.click(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Log In  Starcat Testing  WordPress/input_Remember Me_wp-submit'))

WebUI.click(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Dashboard  Starcat Testing  WordPress/div_Products'))

WebUI.click(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Products  Starcat Testing  WordPress/a_Apple iPhone 11 (64GB)  Black'))

WebUI.verifyElementPresent(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Edit product  Starcat Testing  WordPress/a_Stats'), 
    0)

WebUI.click(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Edit product  Starcat Testing  WordPress/a_httpstest.starcatwp.comproductapple-iphon_a220d6'))

WebUI.acceptAlert()

WebUI.verifyElementPresent(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Apple iPhone 11 (64GB)  Black  Starcat_e378c8/div_Apple iPhone 11 (64GB)  Black_stars-result'), 
    0)

WebUI.click(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Apple iPhone 11 (64GB)  Black  Starcat_e378c8/a_Reviews (1)'))

WebUI.verifyElementPresent(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Apple iPhone 11 (64GB)  Black  Starcat_e378c8/h4_Author Rating'), 
    0)

WebUI.click(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Apple iPhone 11 (64GB)  Black  Starcat_e378c8/a_Starcat Settings'))

WebUI.click(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Starcat Settings  Starcat Testing  WordPress/a_Woocommerce Settings'))

WebUI.click(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Starcat Settings  Starcat Testing  WordPress/span_Off'))

WebUI.click(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.click(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Starcat Settings  Starcat Testing  WordPress/div_Products'))

WebUI.click(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Products  Starcat Testing  WordPress/a_Apple iPhone 11 (64GB)  Black'))

WebUI.verifyElementNotPresent(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Edit product  Starcat Testing  WordPress/a_Stats'), 
    0)

WebUI.click(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Edit product  Starcat Testing  WordPress/a_httpstest.starcatwp.comproductapple-iphon_a220d6'))

WebUI.acceptAlert()

WebUI.verifyElementNotPresent(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Apple iPhone 11 (64GB)  Black  Starcat_e378c8/div_Apple iPhone 11 (64GB)  Black_stars-result'), 
    0)

WebUI.click(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Apple iPhone 11 (64GB)  Black  Starcat_e378c8/a_Reviews (1)'))

WebUI.verifyElementNotPresent(findTestObject('WooCommerce Settings/Verify Enable Starcat for WooCommerce/Page_Apple iPhone 11 (64GB)  Black  Starcat_e378c8/h4_Author Rating'), 
    0)

WebUI.closeBrowser()

