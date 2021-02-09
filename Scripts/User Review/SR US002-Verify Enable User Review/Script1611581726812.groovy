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

WebUI.setText(findTestObject('Object Repository/User reviews/Verify Enable User Review/Page_Log In  Starcat Testing  WordPress/input_Username or Email Address_log'), 
    'hello@pauple.com')

WebUI.setEncryptedText(findTestObject('Object Repository/User reviews/Verify Enable User Review/Page_Log In  Starcat Testing  WordPress/input_Password_pwd'), 
    'Pe+uo40tC36STRx7NIxSrQ==')

WebUI.click(findTestObject('Object Repository/User reviews/Verify Enable User Review/Page_Log In  Starcat Testing  WordPress/input_Remember Me_wp-submit'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Enable User Review/Page_Dashboard  Starcat Testing  WordPress/div_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Enable User Review/Page_Starcat Settings  Starcat Testing  WordPress/a_User Reviews'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Enable User Review/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_3727b9'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/User reviews/Verify Enable User Review/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Enable User Review/Page_Starcat Settings  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Enable User Review/Page_Posts  Starcat Testing  WordPress/a_Movie Review'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Enable User Review/Page_Edit Post  Starcat Testing  WordPress/a_httpstest.starcatwp.com20200107movie-review'))

WebUI.verifyElementVisible(findTestObject('Object Repository/User reviews/Verify Enable User Review/Page_Movie Review  Starcat Testing/h2_Leave a Review'))

WebUI.verifyElementVisible(findTestObject('Object Repository/User reviews/Verify Enable User Review/Page_Movie Review  Starcat Testing/textarea_criteria 2_description'))

WebUI.verifyElementVisible(findTestObject('Object Repository/User reviews/Verify Enable User Review/Page_Movie Review  Starcat Testing/div_Submit'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Enable User Review/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Enable User Review/Page_Starcat Settings  Starcat Testing  WordPress/a_User Reviews'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Enable User Review/Page_Starcat Settings  Starcat Testing  WordPress/span_Off'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Enable User Review/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Enable User Review/Page_Starcat Settings  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Enable User Review/Page_Posts  Starcat Testing  WordPress/a_Movie Review'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Enable User Review/Page_Edit Post  Starcat Testing  WordPress/a_httpstest.starcatwp.com20200107movie-review'))

WebUI.verifyElementNotPresent(findTestObject('User reviews/Verify Enable User Review/Page_Movie Review  Starcat Testing/h2_Leave a Review'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('User reviews/Verify Enable User Review/Page_Movie Review  Starcat Testing/textarea_criteria 2_description'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('User reviews/Verify Enable User Review/Page_Movie Review  Starcat Testing/div_Submit'), 
    0)

WebUI.closeBrowser()

