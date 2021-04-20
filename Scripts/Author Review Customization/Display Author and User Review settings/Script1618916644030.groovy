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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.starcatwp.com/wp-login.php?redirect_to=https%3A%2F%2Ftest.starcatwp.com%2Fwp-admin%2F&reauth=1')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Log In  Starcat Testing  WordPress/input_Username or Email Address_log'), 
    'hello@pauple.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Log In  Starcat Testing  WordPress/input_Password_pwd'), 
    'Pe+uo40tC36STRx7NIxSrQ==')

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Log In  Starcat Testing  WordPress/input_Remember Me_wp-submit'))

WebUI.navigateToUrl('https://test.starcatwp.com/2020/01/07/movie-review/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/Author Rating'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/User Rating'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/Pros and Cons'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/User Review Form'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/User Review List'), 
    0)

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Starcat Settings  Starcat Testing  WordPress/a_Posts_search-choice-close'))

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Starcat Settings  Starcat Testing  WordPress/a_User Reviews'))

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Starcat Settings  Starcat Testing  WordPress/a_Posts_search-choice-close'))

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.delay(5)

WebUI.navigateToUrl('https://test.starcatwp.com/2020/01/07/movie-review/')

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/Author Rating'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/User Rating'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/Pros and Cons'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/User Review Form'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/User Review List'), 
    0)

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/a_Edit Post'))

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Edit Post  Starcat Testing  WordPress/a_Author Review Settings'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Edit Post  Starcat Testing  WordPress/select_Apply Global SettingsShowDont Show'), 
    'show', true)

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Edit Post  Starcat Testing  WordPress/input_Move to Trash_save'))

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Edit Post  Starcat Testing  WordPress/a_httpstest.starcatwp.com20200107movie-review'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/Author Rating'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/User Rating'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/User Review Form'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/User Review List'), 
    0)

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/a_Edit Post'))

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Edit Post  Starcat Testing  WordPress/a_User Review Settings'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Edit Post  Starcat Testing  WordPress/select_Apply Global SettingsShowDont Show_1'), 
    'show', true)

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Edit Post  Starcat Testing  WordPress/input_Move to Trash_save'))

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Edit Post  Starcat Testing  WordPress/a_httpstest.starcatwp.com20200107movie-review'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/Author Rating'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/User Rating'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/User Review Form'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/User Review List'), 
    0)

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Starcat Settings  Starcat Testing  WordPress/input_Where to include Author Reviews_chose_3b9dc4'))

WebUI.click(findTestObject('Author Review Customization/Verify Author and User Review Display Settings/Page_Starcat Settings  Starcat Testing  WordPress/li_Posts'))

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Starcat Settings  Starcat Testing  WordPress/a_User Reviews'))

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Starcat Settings  Starcat Testing  WordPress/input_Where to include Author Reviews_chose_3b9dc4'))

WebUI.click(findTestObject('Author Review Customization/Verify Author and User Review Display Settings/Page_Starcat Settings  Starcat Testing  WordPress/li_Posts_1'))

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Starcat Settings  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Posts  Starcat Testing  WordPress/a_Movie Review'))

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Edit Post  Starcat Testing  WordPress/a_Author Review Settings'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Edit Post  Starcat Testing  WordPress/select_Apply Global SettingsShowDont Show'), 
    'dont_show', true)

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Edit Post  Starcat Testing  WordPress/input_Move to Trash_save'))

WebUI.click(findTestObject('Page_Edit Post  Starcat Testing  WordPress/a_httpstest.starcatwp.com20200107movie-review'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/Author Rating'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/User Rating'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/User Review Form'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/User Review List'), 
    0)

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/a_Edit Post'))

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Edit Post  Starcat Testing  WordPress/a_User Review Settings'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Edit Post  Starcat Testing  WordPress/select_Apply Global SettingsShowDont Show_1'), 
    'dont_show', true)

WebUI.click(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Edit Post  Starcat Testing  WordPress/input_Move to Trash_save'))

WebUI.click(findTestObject('Author Review Customization/Verify Author and User Review Display Settings/Page_Edit Post  Starcat Testing  WordPress/a_httpstest.starcatwp.com20200107movie-review'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/Author Rating'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/User Rating'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/User Review Form'), 
    0)

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Author Review Customization/Verify Author and User Review Display Settings/Page_Movie Review  Starcat Testing/User Review List'), 
    0)

WebUI.closeBrowser()

