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

WebUI.callTestCase(findTestCase('Signin/TCPassNoVariable'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/a_H s xin vic(1)'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Qun l h s - Ngi tm vic  Viec lam, Tim _02c3de/button_To h s mi'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Qun l h s - Ngi tm vic  Viec lam, Tim _02c3de/h5_To h s theo tng bc'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div__checkmarkRelationship'))

WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div__checkmarkSex'))

WebUI.setText(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/input__input-0-2-11 form-control rounded-left'), 
    'xxx')

WebUI.selectOptionByValue(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Vit NamVit kiuNc ngoi'), 
    'L', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_ngay sinh'), 
    '20', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Thang bd b3'), 
    '9', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_nam sinh'), 
    '2001', true)

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Chon country'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Viet Nam'))

WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Chon province'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Hng Yn'))

WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Chon distric'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Huyn Ph C'))

WebUI.setText(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/input_a ch ng_input-0-2-11 form-control rou_cfd822'), 
    'xxxx')

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

WebUI.setText(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/input_in thoi_input-0-2-11 form-control rou_f16c99'), 
    '0978227010')

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Chon country'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_C nhn'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_C nhn'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_K s'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Chon country'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_H S phm K Thut Hng Yn'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Chon country'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Khoa hc My tnh  Cng ngh thng tin'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Thang bd b3'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_nam bd b3'), 
    '2018', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Thang bd b3'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_nam bd b3'), 
    '2022', true)

WebUI.setText(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/textarea_z'), 'z')

WebUI.setText(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/textarea_zz'), 'zz')

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Vui lng chn0123456789101112131415161_7edffe'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

WebUI.setText(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/input_V tr mong mun_input-0-2-11 form-contr_9488d8'), 
    'x')

WebUI.setText(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/input_Mc lng gn y nht_input-0-2-11 form-con_580030'), 
    '10.000.000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Thng lngCnh tranhHnNhp'), 
    'C', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Nhn vin ton thi gianNhn vin ton thi _5243c0'), 
    'A', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Sinh vin  Thc tp sinhMi i lmNhn vinK_253329'), 
    'N', true)

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Thm ngnh ngh'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Thm ngnh ngh'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_CNTT - Phn mm'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Chon country'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_H Ni'))

WebUI.setText(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/textarea_z_1'), 
    'z')

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Cho o b8'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Cho o b8'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Lu h s'))

WebUI.closeBrowser()

