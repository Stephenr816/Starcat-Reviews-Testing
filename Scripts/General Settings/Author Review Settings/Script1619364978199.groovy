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

WebUI.setText(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Log In  Starcat Testing  WordPress/input_Username or Email Address_log'), 
    'hello@pauple.com')

WebUI.setEncryptedText(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Log In  Starcat Testing  WordPress/input_Password_pwd'), 
    'Pe+uo40tC36STRx7NIxSrQ==')

WebUI.click(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Log In  Starcat Testing  WordPress/input_Remember Me_wp-submit'))

WebUI.navigateToUrl('https://test.starcatwp.com/2020/01/07/movie-review/')

WebUI.verifyElementPresent(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Movie Review  Starcat Testing/Author Rating'), 
    0)

WebUI.click(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Starcat Settings  Starcat Testing  WordPress/a_Posts_search-choice-close'))

WebUI.click(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.delay(3)

WebUI.navigateToUrl('https://test.starcatwp.com/2020/01/07/movie-review/')

WebUI.verifyElementNotPresent(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Movie Review  Starcat Testing/Author Rating'), 
    0)

WebUI.navigateToUrl('https://test.starcatwp.com/movie-page/')

WebUI.verifyElementPresent(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Movie Review  Starcat Testing/Author Rating'), 
    0)

WebUI.click(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Movie page  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Starcat Settings  Starcat Testing  WordPress/a_Posts_search-choice-close - Copy'))

WebUI.click(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.delay(3)

WebUI.navigateToUrl('https://test.starcatwp.com/movie-page/')

WebUI.verifyElementNotPresent(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Movie Review  Starcat Testing/Author Rating'), 
    0)

WebUI.click(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Movie page  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Starcat Settings  Starcat Testing  WordPress/input_Where to include Author Reviews_chose_3b9dc4'))

WebUI.click(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Starcat Settings  Starcat Testing  WordPress/li_Posts'))

WebUI.click(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Starcat Settings  Starcat Testing  WordPress/input_Where to include Author Reviews_chose_3b9dc4'))

WebUI.click(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Starcat Settings  Starcat Testing  WordPress/li_Pages'))

WebUI.click(findTestObject('Object Repository/General Settings/SR GS001-Verify Where to Include Author Reviews/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.delay(3)

WebUI.navigateToUrl('https://test.starcatwp.com/2020/01/07/movie-review/')

WebUI.verifyElementPresent(findTestObject('General Settings/SR GS003-Verify Enable Pros and Cons/Page_Movie Review  Starcat Testing/Pros and Cons'), 
    0)

WebUI.click(findTestObject('General Settings/SR GS003-Verify Enable Pros and Cons/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('General Settings/SR GS003-Verify Enable Pros and Cons/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.click(findTestObject('General Settings/SR GS003-Verify Enable Pros and Cons/Page_Starcat Settings  Starcat Testing  WordPress/Disable Pros and Cons'))

WebUI.click(findTestObject('General Settings/SR GS003-Verify Enable Pros and Cons/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.delay(3)

WebUI.navigateToUrl('https://test.starcatwp.com/2020/01/07/movie-review/')

WebUI.verifyElementNotPresent(findTestObject('General Settings/SR GS003-Verify Enable Pros and Cons/Page_Movie Review  Starcat Testing/Pros and Cons'), 
    0)

WebUI.click(findTestObject('General Settings/SR GS003-Verify Enable Pros and Cons/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('General Settings/SR GS003-Verify Enable Pros and Cons/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.click(findTestObject('General Settings/SR GS003-Verify Enable Pros and Cons/Page_Starcat Settings  Starcat Testing  WordPress/Disable Pros and Cons'))

WebUI.click(findTestObject('General Settings/SR GS003-Verify Enable Pros and Cons/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.delay(3)

WebUI.navigateToUrl('https://test.starcatwp.com/2020/01/07/movie-review/')

WebUI.verifyElementVisible(findTestObject('General Settings/SR GS004-Verify Single or Multiple Stat/Page_Movie Review  Starcat Testing/div_criteria 2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('General Settings/SR GS004-Verify Single or Multiple Stat/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('General Settings/SR GS004-Verify Single or Multiple Stat/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.selectOptionByValue(findTestObject('General Settings/SR GS004-Verify Single or Multiple Stat/Page_Starcat Settings  Starcat Testing  WordPress/select_SingleMultiple'), 
    'single', true)

WebUI.click(findTestObject('General Settings/SR GS004-Verify Single or Multiple Stat/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.delay(3)

WebUI.navigateToUrl('https://test.starcatwp.com/2020/01/07/movie-review/')

WebUI.verifyElementNotPresent(findTestObject('General Settings/SR GS004-Verify Single or Multiple Stat/Page_Movie Review  Starcat Testing/div_criteria 2'), 
    0)

WebUI.click(findTestObject('General Settings/SR GS004-Verify Single or Multiple Stat/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('General Settings/SR GS004-Verify Single or Multiple Stat/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.selectOptionByValue(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/select_SingleMultiple'), 
    'multiple', true)

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/input_Stats_scr_optionsglobal_stats1stat_name'))

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/div_StatsYou cannot add more.You cannot rem_bb1068'))

WebUI.setText(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/input_Stats_scr_optionsglobal_stats1stat_name'), 
    'Stephen')

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.mouseOver(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Posts  Starcat Testing  WordPress/a_Movie Review'))

WebUI.setText(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/input_Rating__scr_post_optionsstats-listste_79477d'), 
    '80')

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/input_Move to Trash_save'))

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/a_httpstest.starcatwp.com20200107movie-review'))

WebUI.verifyElementText(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Movie Review  Starcat Testing/div_stephen'), 
    'Stephen')

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/input_Stats_scr_optionsglobal_stats1stat_name'))

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/div_StatsYou cannot add more.You cannot rem_bb1068'))

WebUI.setText(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/input_Stats_scr_optionsglobal_stats1stat_name'), 
    'Criteria 2')

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.mouseOver(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Posts  Starcat Testing  WordPress/a_Movie Review'))

WebUI.setText(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/input_Rating__scr_post_optionsstats-listcri_be1163'), 
    '80')

WebUI.mouseOver(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/input_Move to Trash_save'))

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/input_Move to Trash_save'))

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/a_httpstest.starcatwp.com20200107movie-review'))

WebUI.verifyElementText(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Movie Review  Starcat Testing/div_criteria 2'), 
    'Criteria 2')

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/i_You cannot remove more._fas fa-plus-circle'))

WebUI.setText(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/input_Stats_scr_optionsglobal_stats2stat_name'), 
    'Criteria 3')

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.mouseOver(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/div_Posts'))

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Posts  Starcat Testing  WordPress/a_Movie Review'))

WebUI.setText(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/input_Rating__scr_post_optionsstats-listcri_51690c'), 
    '80')

WebUI.mouseOver(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/input_Move to Trash_save'))

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/input_Move to Trash_save'))

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Edit Post  Starcat Testing  WordPress/a_View post'))

WebUI.verifyElementPresent(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Movie Review  Starcat Testing/div_criteria 3'), 
    0)

WebUI.verifyElementText(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Movie Review  Starcat Testing/div_criteria 3'), 
    'Criteria 3')

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/i_Stats_csf-repeater-remove csf-confirm fas_81fadd'))

WebUI.acceptAlert()

WebUI.click(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.delay(3)

WebUI.navigateToUrl('https://test.starcatwp.com/2020/01/07/movie-review/')

WebUI.verifyElementNotPresent(findTestObject('General Settings/SR GS005-Verify Stat text and Adding new stat/Page_Movie Review  Starcat Testing/div_criteria 3'), 
    0)

WebUI.verifyElementPresent(findTestObject('General Settings/SR GS007-Verify Show Rating Label/Page_Movie Review  Starcat Testing/div_4.5'), 
    0)

WebUI.click(findTestObject('General Settings/SR GS007-Verify Show Rating Label/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('General Settings/SR GS007-Verify Show Rating Label/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.click(findTestObject('General Settings/SR GS007-Verify Show Rating Label/Page_Starcat Settings  Starcat Testing  WordPress/Disable Rating Label'))

WebUI.click(findTestObject('General Settings/SR GS007-Verify Show Rating Label/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.delay(3)

WebUI.navigateToUrl('https://test.starcatwp.com/2020/01/07/movie-review/')

WebUI.verifyElementNotPresent(findTestObject('General Settings/SR GS007-Verify Show Rating Label/Page_Movie Review  Starcat Testing/div_4.5'), 
    0)

WebUI.verifyElementPresent(findTestObject('General Settings/Verify Icons(Star and Heart Icon)/Page_Movie Review  Starcat Testing/i_overall_star icon'), 
    0)

WebUI.click(findTestObject('General Settings/SR GS007-Verify Show Rating Label/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Icons(Star and Heart Icon)/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.mouseOver(findTestObject('General Settings/SR GS007-Verify Show Rating Label/Page_Starcat Settings  Starcat Testing  WordPress/Disable Rating Label'))

WebUI.click(findTestObject('General Settings/SR GS007-Verify Show Rating Label/Page_Starcat Settings  Starcat Testing  WordPress/Disable Rating Label'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Icons(Star and Heart Icon)/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.click(findTestObject('General Settings/Verify Icons(Star and Heart Icon)/Page_Starcat Settings  Starcat Testing  WordPress/input_Icons_search'))

WebUI.click(findTestObject('General Settings/Verify Icons(Star and Heart Icon)/Page_Starcat Settings  Starcat Testing  WordPress/div_Heart'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Icons(Star and Heart Icon)/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.delay(3)

WebUI.navigateToUrl('https://test.starcatwp.com/2020/01/07/movie-review/')

WebUI.verifyElementNotPresent(findTestObject('General Settings/Verify Icons(Star and Heart Icon)/Page_Movie Review  Starcat Testing/i_overall_star icon'), 
    0)

WebUI.verifyElementPresent(findTestObject('General Settings/Verify Icons(Star and Heart Icon)/Page_Movie Review  Starcat Testing/i_overall_heart icon'), 
    0)

WebUI.click(findTestObject('General Settings/SR GS007-Verify Show Rating Label/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Icons(Star and Heart Icon)/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.click(findTestObject('General Settings/Verify Icons(Star and Heart Icon)/Page_Starcat Settings  Starcat Testing  WordPress/input_Icons_search'))

WebUI.click(findTestObject('General Settings/Verify Icons color/Page_Starcat Settings  Starcat Testing  WordPress/div_Star'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Icons color/Page_Starcat Settings  Starcat Testing  WordPress/button_Select Color'))

WebUI.setText(findTestObject('Object Repository/General Settings/Verify Icons color/Page_Starcat Settings  Starcat Testing  WordPress/input_Color value_scr_optionsstats-icons-color'), 
    '#f21d1d')

WebUI.click(findTestObject('Object Repository/General Settings/Verify Icons color/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.delay(3)

WebUI.navigateToUrl('https://test.starcatwp.com/2020/01/07/movie-review/')

css_color = WebUI.getCSSValue(findTestObject('General Settings/Verify Icons color/Page_Movie Review  Starcat Testing/i_overall_star icon'), 
    'color')

println(css_color)

WebUI.verifyEqual(css_color, 'rgba(221, 221, 221, 1)')

WebUI.click(findTestObject('General Settings/SR GS007-Verify Show Rating Label/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Icons(Star and Heart Icon)/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Icon Label color/Page_Starcat Settings  Starcat Testing  WordPress/button_Select Color'))

WebUI.setText(findTestObject('Object Repository/General Settings/Verify Icon Label color/Page_Starcat Settings  Starcat Testing  WordPress/input_Color value_scr_optionsstats-icons-la_82d9f8'), 
    '#f21d1d')

WebUI.click(findTestObject('Object Repository/General Settings/Verify Icon Label color/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.delay(3)

WebUI.navigateToUrl('https://test.starcatwp.com/2020/01/07/movie-review/')

WebUI.click(findTestObject('General Settings/Verify Icon Label color/Page_Movie Review  Starcat Testing/div_4.5'))

css_color = WebUI.getCSSValue(findTestObject('General Settings/Verify Icon Label color/Page_Movie Review  Starcat Testing/div_4.5'), 
    'color')

println(css_color)

WebUI.verifyEqual(css_color, 'rgba(242, 29, 29, 1)')

WebUI.verifyElementText(findTestObject('General Settings/Verify Limit/Page_Movie Review  Starcat Testing/div_4.5'), '4.5')

WebUI.click(findTestObject('Object Repository/General Settings/Verify Limit/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Limit/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.setText(findTestObject('Object Repository/General Settings/Verify Limit/Page_Starcat Settings  Starcat Testing  WordPress/input_Limit_scr_optionsstats-stars-limit'), 
    '10')

WebUI.click(findTestObject('Object Repository/General Settings/Verify Limit/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.delay(3)

WebUI.navigateToUrl('https://test.starcatwp.com/2020/01/07/movie-review/')

WebUI.verifyElementText(findTestObject('General Settings/Verify Limit/Page_Movie Review  Starcat Testing/div_9'), '9')

WebUI.click(findTestObject('Object Repository/General Settings/Verify Limit/Page_Movie Review  Starcat Testing/a_Starcat Settings'))

WebUI.click(findTestObject('Object Repository/General Settings/Verify Limit/Page_Starcat Settings  Starcat Testing  WordPress/a_General Settings'))

WebUI.setText(findTestObject('Object Repository/General Settings/Verify Limit/Page_Starcat Settings  Starcat Testing  WordPress/input_Limit_scr_optionsstats-stars-limit'), 
    '5')

WebUI.click(findTestObject('Object Repository/General Settings/Verify Limit/Page_Starcat Settings  Starcat Testing  WordPress/input_You have unsaved changes, save your c_a04d4d'))

WebUI.delay(3)

WebUI.closeBrowser()

