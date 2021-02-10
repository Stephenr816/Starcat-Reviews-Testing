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

WebUI.setText(findTestObject('General Settings/Verify Where to Include Reviews/Page_Log In  Starcat Testing  WordPress/input_Username or Email Address_log'), 
    'hello@pauple.com')

WebUI.setEncryptedText(findTestObject('General Settings/Verify Where to Include Reviews/Page_Log In  Starcat Testing  WordPress/input_Password_pwd'), 
    'Pe+uo40tC36STRx7NIxSrQ==')

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Log In  Starcat Testing  WordPress/input_Remember Me_wp-submit'))

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Dashboard  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Posts  Starcat Testing  WordPress/a_Movie Review'))

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Edit Post  Starcat Testing  WordPress/a_httpstest.starcatwp.com20200107movie-review'))

WebUI.verifyElementVisible(findTestObject('General Settings/Verify Where to Include Reviews/Page_Movie Review  Starcat Testing/div_Author Rating overall4.5criteria 15criteria 24'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('General Settings/Verify Where to Include Reviews/Page_Movie Review  Starcat Testing/div_Users Rating (2) overall4.5criteria 14._b2f7c1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('General Settings/Verify Where to Include Reviews/Page_Movie Review  Starcat Testing/div_Pros  ConsBest movie everVery Interesti_e17a50'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Starcat Settings  Starcat Testing  WordPress/a_Posts_search-choice-close'))

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Starcat Settings  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Posts  Starcat Testing  WordPress/a_Movie Review'))

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Edit Post  Starcat Testing  WordPress/a_httpstest.starcatwp.com20200107movie-review'))

WebUI.verifyElementNotPresent(findTestObject('General Settings/Verify Where to Include Reviews/Page_Movie Review  Starcat Testing/div_Author Rating overall4.5criteria 15criteria 24'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('General Settings/Verify Where to Include Reviews/Page_Movie Review  Starcat Testing/div_Users Rating (2) overall4.5criteria 14._b2f7c1'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('General Settings/Verify Where to Include Reviews/Page_Movie Review  Starcat Testing/div_Pros  ConsBest movie everVery Interesti_e17a50'), 
    0)

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Starcat Settings  Starcat Testing  WordPress/div_Pages'))

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Pages  Starcat Testing  WordPress/a_Movie page'))

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Edit Page  Starcat Testing  WordPress/a_httpstest.starcatwp.commovie-page'))

WebUI.acceptAlert()

WebUI.verifyElementVisible(findTestObject('General Settings/Verify Where to Include Reviews/Page_Movie page  Starcat Testing/div_Author Rating overall4criteria 15criteria 23'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('General Settings/Verify Where to Include Reviews/Page_Movie page  Starcat Testing/div_Users Rating (1) overall4.8criteria 15c_e0c04f'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('General Settings/Verify Where to Include Reviews/Page_Movie page  Starcat Testing/div_Pros  ConsGutHatHutterPoor Movie'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Movie page  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Starcat Settings  Starcat Testing  WordPress/a_Posts_search-choice-close - Copy'))

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Starcat Settings  Starcat Testing  WordPress/div_Pages'))

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Pages  Starcat Testing  WordPress/a_Movie page'))

WebUI.click(findTestObject('General Settings/Verify Where to Include Reviews/Page_Edit Page  Starcat Testing  WordPress/a_httpstest.starcatwp.commovie-page'))

WebUI.acceptAlert()

WebUI.verifyElementNotPresent(findTestObject('General Settings/Verify Where to Include Reviews/Page_Movie page  Starcat Testing/div_Author Rating overall4criteria 15criteria 23'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('General Settings/Verify Where to Include Reviews/Page_Movie page  Starcat Testing/div_Users Rating (1) overall4.8criteria 15c_e0c04f'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('General Settings/Verify Where to Include Reviews/Page_Movie page  Starcat Testing/div_Pros  ConsGutHatHutterPoor Movie'), 
    0)

WebUI.closeBrowser()

