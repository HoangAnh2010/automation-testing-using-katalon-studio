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

'Di chuyển đến khung nhìn có tọa độ (150, 150)'
WebUI.scrollToPosition(150, 150)

'Click Vui lòng chọn'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Chon distric'))

'Click chọn huyện "Phù Cừ"'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Huyn Ph C'))

'Nhập "Thôn Quế Lâm, xã Minh Hoàng"'
WebUI.setText(findTestObject('demodiachib2/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/input_diachib2'), 'Thôn Quế Lâm, xã Minh Hoàng')

'Nhấn button Tiếp tục'
WebUI.click(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

'Xác minh bước 2 đã thành công'
WebUI.verifyElementText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/h4_Hc vn'), 
    'Học vấn')

