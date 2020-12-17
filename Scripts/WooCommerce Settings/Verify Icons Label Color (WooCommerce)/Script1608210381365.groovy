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

WebUI.setText(findTestObject('Object Repository/WooCommerce Settings/Verify Icons Label Color (WooCommerce)/Page_Log In  Starcat Testing  WordPress/input_Username or Email Address_log'), 
    'hello@pauple.com')

WebUI.setEncryptedText(findTestObject('Object Repository/WooCommerce Settings/Verify Icons Label Color (WooCommerce)/Page_Log In  Starcat Testing  WordPress/input_Password_pwd'), 
    'Pe+uo40tC36STRx7NIxSrQ==')

WebUI.click(findTestObject('Object Repository/WooCommerce Settings/Verify Icons Label Color (WooCommerce)/Page_Log In  Starcat Testing  WordPress/input_Remember Me_wp-submit'))

WebUI.click(findTestObject('Object Repository/WooCommerce Settings/Verify Icons Label Color (WooCommerce)/Page_Dashboard  Starcat Testing  WordPress/div_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/WooCommerce Settings/Verify Icons Label Color (WooCommerce)/Page_Starcat Settings  Starcat Testing  WordPress/button_Select Color'))

WebUI.setText(findTestObject('Object Repository/WooCommerce Settings/Verify Icons Label Color (WooCommerce)/Page_Starcat Settings  Starcat Testing  WordPress/input_Color value_scr_optionswoo_stats_icon_34ac5e'), 
    '#f21d1d')

WebUI.click(findTestObject('Object Repository/WooCommerce Settings/Verify Icons Label Color (WooCommerce)/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.mouseOver(findTestObject('Object Repository/WooCommerce Settings/Verify Icons Label Color (WooCommerce)/Page_Starcat Settings  Starcat Testing  WordPress/div_Products'))

WebUI.click(findTestObject('Object Repository/WooCommerce Settings/Verify Icons Label Color (WooCommerce)/Page_Starcat Settings  Starcat Testing  WordPress/div_Products'))

WebUI.mouseOver(findTestObject('Object Repository/WooCommerce Settings/Verify Icons Label Color (WooCommerce)/Page_Products  Starcat Testing  WordPress/a_Apple iPhone 11 (64GB)  Black'))

WebUI.click(findTestObject('Object Repository/WooCommerce Settings/Verify Icons Label Color (WooCommerce)/Page_Products  Starcat Testing  WordPress/a_View'))

WebUI.click(findTestObject('Object Repository/WooCommerce Settings/Verify Icons Label Color (WooCommerce)/Page_Apple iPhone 11 (64GB)  Black  Starcat_e378c8/a_Reviews (1)'))


css_color = WebUI.getCSSValue(findTestObject('Object Repository/WooCommerce Settings/Verify Icons Label Color (WooCommerce)/Page_Apple iPhone 11 (64GB)  Black  Starcat_e378c8/div_4.8'),
	'color')

println(css_color)

WebUI.verifyEqual(css_color, 'rgba(242, 29, 29, 1)')

WebUI.closeBrowser()

