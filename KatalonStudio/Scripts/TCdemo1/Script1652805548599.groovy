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

WebUI.selectOptionByValue(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Thang sinh'), '9', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_nam sinh'), 
    '2001', true)

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

'Nhập số điện thoại'
WebUI.setText(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/input_in thoi_input-0-2-11 form-control rou_f16c99'), 
    '0978227010')

'Click Vui lòng chọn'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Chon country'))

'Click chọn item "Việt Nam"'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Viet Nam'))

'Click Vui lòng chọn'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Chon province'))

'Click chọn item "Hưng Yên"'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Hng Yn'))

'Click Vui lòng chọn'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Chon distric'))

'Click chọn huyện "Phù Cừ"'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Huyn Ph C'))

'Nhập "Thôn Quế Lâm, xã Minh Hoàng"'
WebUI.setText(findTestObject('demodiachib2/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/input_diachib2'), 'Thôn Quế Lâm, xã Minh Hoàng')

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Chon trinh do hoc van'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_K s'))

WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Chon truong'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_H S phm K Thut Hng Yn'))

WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Chon chuyen nganh'))

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Khoa hc My tnh  Cng ngh thng tin'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Thang bd b3'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_nam bd b3'), 
    '2018', true)

WebUI.selectOptionByValue(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Thang kt b3'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_nam kt b3'), '2022', 
    true)

WebUI.setText(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/textarea_z'), 'z')

WebUI.setText(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/textarea_zz'), 'zz')

WebUI.click(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

