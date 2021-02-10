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

WebUI.setText(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Log In  Starcat Testing  WordPress/input_Username or Email Address_log'), 
    'hello@pauple.com')

WebUI.setEncryptedText(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Log In  Starcat Testing  WordPress/input_Password_pwd'), 
    'Pe+uo40tC36STRx7NIxSrQ==')

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Log In  Starcat Testing  WordPress/input_Remember Me_wp-submit'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Dashboard  Starcat Testing  WordPress/div_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Starcat Settings  Starcat Testing  WordPress/a_User Reviews'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_3727b9'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.starcatwp.com/wp-login.php?redirect_to=https%3A%2F%2Ftest.starcatwp.com%2Fwp-admin%2F&reauth=1')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Log In  Starcat Testing  WordPress/input_Username or Email Address_log'), 
    'editor')

WebUI.setEncryptedText(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Log In  Starcat Testing  WordPress/input_Password_pwd'), 
    'MGXm4pa98Sc=')

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Log In  Starcat Testing  WordPress/input_Remember Me_wp-submit'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Dashboard  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Posts  Starcat Testing  WordPress/a_Movie Review'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Edit Post  Starcat Testing  WordPress/a_httpstest.starcatwp.com20200107movie-review'))

WebUI.setText(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/input_Leave a Review_title'), 
    'Editor Automated test')

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/i_criteria 1_star outline icon'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/i_criteria 1_star outline icon - Copy'))

WebUI.setText(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/textarea_criteria 2_description'), 
    'This is editor automated test')

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/input_Pros_search'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/div_Best movie ever'))

WebUI.selectOptionByValue(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/select_Type new or select existing pros  Be_ea9b91'), 
    'best_movie_ever', true)

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/input_Cons_search'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/div_Confusing at times'))

WebUI.selectOptionByValue(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/select_Type new or select existing cons  Co_eca8df'), 
    'confusing_at_times', true)

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/div_Submit'))

WebUI.delay(15)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.starcatwp.com/wp-login.php?redirect_to=https%3A%2F%2Ftest.starcatwp.com%2Fwp-admin%2F&reauth=1')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Log In  Starcat Testing  WordPress/input_Username or Email Address_log'), 
    'hello@pauple.com')

WebUI.setEncryptedText(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Log In  Starcat Testing  WordPress/input_Password_pwd'), 
    'Pe+uo40tC36STRx7NIxSrQ==')

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Log In  Starcat Testing  WordPress/input_Remember Me_wp-submit'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Dashboard  Starcat Testing  WordPress/div_User Reviews 1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_User Reviews  Starcat Testing  WordPress/strong_editor'))

WebUI.verifyElementVisible(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_User Reviews  Starcat Testing  WordPress/p_This is editor automated test'))

WebUI.verifyElementText(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_User Reviews  Starcat Testing  WordPress/p_This is editor automated test'), 
    'This is editor automated test')

WebUI.mouseOver(findTestObject('User reviews/Verify User reviews are published properly/Page_User Reviews  Starcat Testing  WordPress/ApproveUnapprove  Spam  Trash'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_User Reviews  Starcat Testing  WordPress/a_Trash'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_User Reviews  Starcat Testing  WordPress/div_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Starcat Settings  Starcat Testing  WordPress/a_User Reviews'))

WebUI.selectOptionByValue(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Starcat Settings  Starcat Testing  WordPress/select_Logged In UsersEveryone'), 
    'everyone', true)

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.starcatwp.com/2020/01/07/movie-review/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/input_Leave a Review_name'), 
    'Automator')

WebUI.setText(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/input_Leave a Review_email'), 
    'automator@gmail.com')

WebUI.setText(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/input_Leave a Review_website'), 
    'automated.com')

WebUI.setText(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/input_Leave a Review_title'), 
    'Automated Review')

WebUI.click(findTestObject('User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/i_criteria 1_star outline icon - Copy (1)'))

WebUI.click(findTestObject('User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/i_criteria 1_star outline icon - Copy (2)'))

WebUI.setText(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/textarea_criteria 2_description'), 
    'This is automated review')

WebUI.click(findTestObject('User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/input_Pros_search - Copy'))

WebUI.click(findTestObject('User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/div_Best movie ever - Copy'))

WebUI.selectOptionByValue(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/select_Type new or select existing pros  Be_ea9b91'), 
    'best_movie_ever', true)

WebUI.click(findTestObject('User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/input_Cons_search - Copy'))

WebUI.click(findTestObject('User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/div_Confusing at times - Copy'))

WebUI.selectOptionByValue(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/select_Type new or select existing cons  Co_eca8df'), 
    'confusing_at_times', true)

WebUI.click(findTestObject('User reviews/Verify User reviews are published properly/Page_Movie Review  Starcat Testing/div_Submit - Copy'))

WebUI.delay(10)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.starcatwp.com/wp-login.php?redirect_to=https%3A%2F%2Ftest.starcatwp.com%2Fwp-admin%2F&reauth=1')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Log In  Starcat Testing  WordPress/input_Username or Email Address_log'), 
    'hello@pauple.com')

WebUI.setEncryptedText(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Log In  Starcat Testing  WordPress/input_Password_pwd'), 
    'Pe+uo40tC36STRx7NIxSrQ==')

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Log In  Starcat Testing  WordPress/input_Remember Me_wp-submit'))

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_Dashboard  Starcat Testing  WordPress/div_User Reviews 1'))

WebUI.verifyElementText(findTestObject('User reviews/Verify User reviews are published properly/Page_User Reviews  Starcat Testing  WordPress/strong_Automator'), 
    'Automator')

WebUI.verifyElementText(findTestObject('User reviews/Verify User reviews are published properly/Page_User Reviews  Starcat Testing  WordPress/a_automated.com'), 
    'automated.com')

WebUI.verifyElementText(findTestObject('User reviews/Verify User reviews are published properly/Page_User Reviews  Starcat Testing  WordPress/a_automatorgmail.com'), 
    'automator@gmail.com')

WebUI.verifyElementText(findTestObject('User reviews/Verify User reviews are published properly/Page_User Reviews  Starcat Testing  WordPress/p_This is automated review'), 
    'This is automated review')

WebUI.mouseOver(findTestObject('User reviews/Verify User reviews are published properly/Page_User Reviews  Starcat Testing  WordPress/p_This is automated review'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/User reviews/Verify User reviews are published properly/Page_User Reviews  Starcat Testing  WordPress/a_Trash_1'))

WebUI.closeBrowser()

