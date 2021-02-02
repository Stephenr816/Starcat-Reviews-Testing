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

WebUI.setText(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Log In  Starcat Testing  WordPress/input_Username or Email Address_log'), 
    'hello@pauple.com')

WebUI.setEncryptedText(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Log In  Starcat Testing  WordPress/input_Password_pwd'), 
    'Pe+uo40tC36STRx7NIxSrQ==')

WebUI.click(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Log In  Starcat Testing  WordPress/input_Remember Me_wp-submit'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Dashboard  Starcat Testing  WordPress/div_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Starcat Settings  Starcat Testing  WordPress/a_User Reviews'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_3727b9'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.starcatwp.com/wp-login.php?redirect_to=https%3A%2F%2Ftest.starcatwp.com%2Fwp-admin%2F&reauth=1')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Log In  Starcat Testing  WordPress/input_Username or Email Address_log'), 
    'editor')

WebUI.setEncryptedText(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Log In  Starcat Testing  WordPress/input_Password_pwd'), 
    'MGXm4pa98Sc=')

WebUI.click(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Log In  Starcat Testing  WordPress/input_Remember Me_wp-submit'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Dashboard  Starcat Testing  WordPress/div_Posts'))

WebUI.mouseOver(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Posts  Starcat Testing  WordPress/a_Movie Review'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Posts  Starcat Testing  WordPress/a_View'))

WebUI.verifyElementVisible(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Movie Review  Starcat Testing/h2_Leave a Review'))

WebUI.verifyElementVisible(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Movie Review  Starcat Testing/textarea_criteria 2_description'))

WebUI.setText(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Movie Review  Starcat Testing/input_Leave a Review_title'), 
    'Editor Review Test')

WebUI.click(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Movie Review  Starcat Testing/i_criteria 1_star outline icon'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Movie Review  Starcat Testing/i_criteria 1_star outline icon - Copy'))

WebUI.setText(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Movie Review  Starcat Testing/textarea_criteria 2_description'), 
    'This is editor review test')

WebUI.click(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Movie Review  Starcat Testing/input_Pros_search'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Movie Review  Starcat Testing/div_Best movie ever'))

WebUI.selectOptionByValue(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Movie Review  Starcat Testing/select_Type new or select existing pros  Be_ea9b91'), 
    'best_movie_ever', true)

WebUI.click(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Movie Review  Starcat Testing/input_Cons_search'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Movie Review  Starcat Testing/div_Confusing at times'))

WebUI.selectOptionByValue(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Movie Review  Starcat Testing/select_Type new or select existing cons  Co_eca8df'), 
    'confusing_at_times', true)

WebUI.click(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Movie Review  Starcat Testing/div_Submit'))

WebUI.delay(6)

WebUI.refresh()

WebUI.verifyElementNotVisible(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Movie Review  Starcat Testing/h2_Leave a Review'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotVisible(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Movie Review  Starcat Testing/textarea_criteria 2_description'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.starcatwp.com/wp-login.php?redirect_to=https%3A%2F%2Ftest.starcatwp.com%2Fwp-admin%2F&reauth=1')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Log In  Starcat Testing  WordPress/input_Username or Email Address_log'), 
    'hello@pauple.com')

WebUI.setEncryptedText(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Log In  Starcat Testing  WordPress/input_Password_pwd'), 
    'Pe+uo40tC36STRx7NIxSrQ==')

WebUI.click(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Log In  Starcat Testing  WordPress/input_Remember Me_wp-submit'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify Same user Multiple review test option is not enabled/Page_Dashboard  Starcat Testing  WordPress/div_User Reviews 1'))

WebUI.mouseOver(findTestObject('User reviews/Verify Same user Multiple review test option is not enabled/Page_User Reviews  Starcat Testing  WordPress/p_This is editor review test'))

WebUI.click(findTestObject('User reviews/Verify Same user Multiple review test option is not enabled/Page_User Reviews  Starcat Testing  WordPress/a_Trash'))

WebUI.delay(2)

WebUI.closeBrowser()

