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

'Nhập "Fresher"'
WebUI.setText(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/input_V tr mong mun_input-0-2-11 form-contr_9488d8'), 
    'Fresher')

'Nhập lương'
WebUI.setText(findTestObject('Object Repository/Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/input_Mc lng gn y nht_input-0-2-11 form-con_580030'), 
    '10.000.000')

'Chọn item "Thương lượng"'
WebUI.selectOptionByValue(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Thng lngCnh tranhHnNhp'), 
    'C', true)

'Chọn item "Nhân viên toàn thời gian"'
WebUI.selectOptionByValue(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Nhn vin ton thi gianNhn vin ton thi _5243c0'), 
    'A', true)

'Chọn item "Nhân viên mới đi làm"'
WebUI.selectOptionByValue(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Sinh vin  Thc tp sinhMi i lmNhn vinK_253329'), 
    'N', true)

'Di chuyển đến khung nhìn có tọa độ (250, 250)'
WebUI.scrollToPosition(250, 250)

'Click Thêm ngành nghề'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Thm ngnh ngh'))

'Nhấn chọn CNTT/Phần mềm'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_CNTT - Phn mm'))

'Click Vui lòng chọn'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Chon noi lam viec b8'))

'Nhấn chọn "Hà Nội"'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_H Ni'))

'Nhập "Rõ ràng"'
WebUI.setText(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/textarea_R rng'), 'Rõ ràng')

'Di chuyển đến khung nhìn có tọa độ (500, 500)'
WebUI.scrollToPosition(500, 500)

'Chọn "Có" ở mục Có thể đổi chỗ ở'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Cho o b8'))

'Chọn "Có" ở mục Có thể đi công tác'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Cong tac b8'))

'Nhấn button Tiếp tục'
WebUI.click(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

'Xác minh bước 8 thành công'
WebUI.verifyElementText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/h4_Trng thi h s'), 
    'Trạng thái hồ sơ')

