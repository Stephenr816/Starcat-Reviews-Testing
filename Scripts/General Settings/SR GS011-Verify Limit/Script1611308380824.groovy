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

WebUI.setText(findTestObject('Object Repository/General Settings/Verify Limit/Page_Log In  Starcat Testing  WordPress/input_Username or Email Address_log'), 
    'hello@pauple.com')

WebUI.setEncryptedText(findTestObject('Object Repository/General Settings/Verify Limit/Page_Log In  Starcat Testing  WordPress/input_Password_pwd'), 
    'Pe+uo40tC36STRx7NIxSrQ==')

WebUI.click(findTestObject('Object Repository/General Settings/Verify Limit/Page_Log In  Starcat Testing  WordPress/input_Remember Me_wp-submit'))

WebUI.mouseOver(findTestObject('Object Repository/General Settings/Verify Limit/Page_Starcat Settings  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Limit/Page_Starcat Settings  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Limit/Page_Posts  Starcat Testing  WordPress/a_Movie Review'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Limit/Page_Edit Post  Starcat Testing  WordPress/a_httpstest.starcatwp.com20200107movie-review'))

WebUI.verifyElementText(findTestObject('General Settings/Verify Limit/Page_Movie Review  Starcat Testing/div_4.5'), '4.5')

WebUI.click(findTestObject('Object Repository/General Settings/Verify Limit/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Limit/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.setText(findTestObject('Object Repository/General Settings/Verify Limit/Page_Starcat Settings  Starcat Testing  WordPress/input_Limit_scr_optionsstats-stars-limit'), 
    '10')

WebUI.click(findTestObject('Object Repository/General Settings/Verify Limit/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.mouseOver(findTestObject('Object Repository/General Settings/Verify Limit/Page_Starcat Settings  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Limit/Page_Starcat Settings  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Limit/Page_Posts  Starcat Testing  WordPress/a_Movie Review'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Limit/Page_Edit Post  Starcat Testing  WordPress/a_httpstest.starcatwp.com20200107movie-review'))

WebUI.verifyElementText(findTestObject('General Settings/Verify Limit/Page_Movie Review  Starcat Testing/div_9'), '9')

WebUI.click(findTestObject('Object Repository/General Settings/Verify Limit/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Limit/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.setText(findTestObject('Object Repository/General Settings/Verify Limit/Page_Starcat Settings  Starcat Testing  WordPress/input_Limit_scr_optionsstats-stars-limit'), 
    '5')

WebUI.click(findTestObject('Object Repository/General Settings/Verify Limit/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.closeBrowser()
