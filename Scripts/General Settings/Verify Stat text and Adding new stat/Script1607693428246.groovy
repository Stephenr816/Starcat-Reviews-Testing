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

WebUI.setText(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Log In  Starcat Testing  WordPress/input_Username or Email Address_log'), 
    'hello@pauple.com')

WebUI.setEncryptedText(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Log In  Starcat Testing  WordPress/input_Password_pwd'), 
    'Pe+uo40tC36STRx7NIxSrQ==')

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Log In  Starcat Testing  WordPress/input_Remember Me_wp-submit'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Dashboard  Starcat Testing  WordPress/div_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.selectOptionByValue(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/select_SingleMultiple'), 
    'multiple', true)

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/input_Stats_scr_optionsglobal_stats1stat_name'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/div_StatsYou cannot add more.You cannot rem_bb1068'))

WebUI.setText(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/input_Stats_scr_optionsglobal_stats1stat_name'), 
    'Stephen')

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Posts  Starcat Testing  WordPress/a_Movie Review'))

WebUI.setText(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/input_Rating__scr_post_optionsstats-listste_79477d'), 
    '80')

WebUI.mouseOver(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/input_Move to Trash_save'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/input_Move to Trash_save'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/a_httpstest.starcatwp.com20200107movie-review'))

WebUI.verifyElementText(findTestObject('General Settings/Verify Stat text and Adding new stat/Page_Movie Review  Starcat Testing/div_stephen'), 
    'Stephen')

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/input_Stats_scr_optionsglobal_stats1stat_name'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/div_StatsYou cannot add more.You cannot rem_bb1068'))

WebUI.setText(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/input_Stats_scr_optionsglobal_stats1stat_name'), 
    'Criteria 2')

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Posts  Starcat Testing  WordPress/a_Movie Review'))

WebUI.setText(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/input_Rating__scr_post_optionsstats-listcri_be1163'), 
    '80')

WebUI.mouseOver(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/input_Move to Trash_save'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/input_Move to Trash_save'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/a_httpstest.starcatwp.com20200107movie-review'))

WebUI.verifyElementText(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Movie Review  Starcat Testing/div_criteria 2'), 
    'criteria 2')

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/i_You cannot remove more._fas fa-plus-circle'))

WebUI.setText(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/input_Stats_scr_optionsglobal_stats2stat_name'), 
    'Criteria 3')

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Posts  Starcat Testing  WordPress/a_Movie Review'))

WebUI.setText(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/input_Rating__scr_post_optionsstats-listcri_51690c'), 
    '80')

WebUI.mouseOver(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/input_Move to Trash_save'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/input_Move to Trash_save'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/a_View post'))

WebUI.verifyElementPresent(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Movie Review  Starcat Testing/div_criteria 3'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Movie Review  Starcat Testing/div_criteria 3'), 
    'criteria 3')

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/i_Stats_csf-repeater-remove csf-confirm fas_81fadd'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Posts  Starcat Testing  WordPress/a_Movie Review'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/a_httpstest.starcatwp.com20200107movie-review'))

WebUI.verifyElementNotPresent(findTestObject('Page_Movie Review  Starcat Testing/div_criteria 3'), 0)

WebUI.closeBrowser()

