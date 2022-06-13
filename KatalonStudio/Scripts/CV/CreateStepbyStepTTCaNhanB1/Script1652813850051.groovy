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

'Click Hồ sơ xin việc'
WebUI.click(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/a_H s xin vic(2)'))

'Click Tạo mới hồ sơ'
WebUI.click(findTestObject('Object Repository/Page_Qun l h s - Ngi tm vic  Viec lam, Tim _02c3de/button_To h s mi'))

'Click Tạo hồ sơ theo từng bước'
WebUI.click(findTestObject('Object Repository/Page_Qun l h s - Ngi tm vic  Viec lam, Tim _02c3de/a_Khuyn khchTo h s theo tng bc6 bc yu cu  h_81939d'))

'Nhập nội dung vào ô Tiêu đề hồ sơ'
WebUI.setText(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/input__input-0-2-11 form-control rounded-left'), 
    'HỒ SƠ XIN VIỆC')

'Click vào ô Họ tên'
WebUI.click(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/input__input-0-2-11 form-control rounded-left_1'))

'Chọn "Việt Nam" ở combobox Quốc tịch'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Vit NamVit kiuNc ngoi'), 
    'L', true)

'Di chuyển đến khung nhìn có tọa độ (150, 150)'
WebUI.scrollToPosition(150, 150)

'Chọn "20" ở combobox Ngày sinh'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_123456789101112131415161718192021222_566da4'), 
    '20', true)

'Chọn "9" ở combobox Tháng sinh'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Thng 1Thng 2Thng 3Thng 4Thng 5Thng 6_909065'), 
    '9', true)

'Chọn "2001" ở combobox Năm sinh'
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_195119521953195419551956195719581959_19f315'), 
    '2001', true)

'Chọn giá trị ở trường Tình trạng hôn nhân'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div__checkmarkRelationship'))

'Chọn giá trị ở trường Giới tính'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div__checkmarkSex'))

'Nhấn button Tiếp tục'
WebUI.click(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

'Xác minh bước 1 đã thành công'
WebUI.verifyElementText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/h4_Thng tin lin h'), 
    'Thông tin liên hệ')

