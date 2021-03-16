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

WebUI.setText(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_Log In  Starcat Testing  WordPress/input_Username or Email Address_log'), 
    'hello@pauple.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_Log In  Starcat Testing  WordPress/input_Password_pwd'), 
    'Pe+uo40tC36STRx7NIxSrQ==')

WebUI.click(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_Log In  Starcat Testing  WordPress/input_Remember Me_wp-submit'))

WebUI.click(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_Posts  Starcat Testing  WordPress/div_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.click(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_Starcat Settings  Starcat Testing  WordPress/a_Posts_search-choice-close'))

WebUI.click(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_Starcat Settings  Starcat Testing  WordPress/a_Posts_search-choice-close'))

WebUI.click(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.click(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_Dashboard  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_Posts  Starcat Testing  WordPress/a_Add New'))

WebUI.setText(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_Add New Post  Starcat Testing  WordPress/input_Add title_post_title'), 
    'User Review Form Shortcode')

WebUI.click(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_Add New Post  Starcat Testing  WordPress/a_Add Starcat Reviews Shortcodes'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_Add New Post  Starcat Testing  WordPress/select_Select a shortcodeStarcat Review Ove_fdef13'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_Add New Post  Starcat Testing  WordPress/input_Enter the Post ID (or) Page ID_starca_4f486d'), 
    '13')

WebUI.click(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_Add New Post  Starcat Testing  WordPress/a_Insert Shortcode'))

WebUI.click(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_Add New Post  Starcat Testing  WordPress/input_Move to Trash_publish'))

WebUI.navigateToUrl('https://test.starcatwp.com/wp-admin/post.php?post=339&action=edit')

WebUI.click(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_Edit Post  Starcat Testing  WordPress/a_View post'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_User Review Form Shortcode  Starcat Testing/h2_Leave a Review'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_User Review Form Shortcode  Starcat Testing/input_Leave a Review_title'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_User Review Form Shortcode  Starcat Testing/div_Submit'), 
    0)

WebUI.click(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_User Review Form Shortcode  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_Starcat Settings  Starcat Testing  WordPress/div_Posts'))

WebUI.mouseOver(findTestObject('Object Repository/Shortcodes/User review form shortcode/Page_Posts  Starcat Testing  WordPress/a_Trash'))

WebUI.click(findTestObject('Page_Posts  Starcat Testing  WordPress/a_Trash'))

WebUI.delay(5)

WebUI.closeBrowser()

