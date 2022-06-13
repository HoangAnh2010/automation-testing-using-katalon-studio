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

WebUI.callTestCase(findTestCase('CV/CreateStepbyStepKNLamViecB5'), [:], FailureHandling.STOP_ON_FAILURE)

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

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_CNTT - Phn mm'))

WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Chon noi lam viec b8'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_H Ni'))

WebUI.setText(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/textarea_z_1'), 
    'z')

WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Cho o b8'))

WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Cong tac b8'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

