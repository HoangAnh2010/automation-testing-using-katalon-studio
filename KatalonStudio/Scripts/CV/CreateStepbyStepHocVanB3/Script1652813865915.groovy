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

'Click Vui lòng chọn'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Chon trinh do hoc van'))

'Click chọn item "Kỹ sư"'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_K s'))

'Di chuyển đến khung nhìn có tọa độ (150, 150)'
WebUI.scrollToPosition(150, 150)

'Click Vui lòng chọn'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Chon truong'))

'Click chọn item "Đại học Sư phạm Kỹ thuật Hưng Yên"'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_H S phm K Thut Hng Yn'))

'Click Vui lòng chọn'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Chon chuyen nganh'))

'Click chọn item "Khoa học máy tính/Công nghệ thông tin"'
WebUI.click(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Khoa hc My tnh  Cng ngh thng tin'))

'Click chọn item "8"'
WebUI.selectOptionByValue(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Thang bd b3'), 
    '7', true)

'Click chọn item "2018"'
WebUI.selectOptionByValue(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_nam bd b3'), '2018', 
    true)

'Click chọn item "5"'
WebUI.selectOptionByValue(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Thang kt b3'), 
    '4', true)

'Click chọn item "2022"'
WebUI.selectOptionByValue(findTestObject('Demo/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_nam kt b3'), '2022', 
    true)

'Nhấn button Tiếp tục'
WebUI.click(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

'Nhấn button Tiếp tục'
WebUI.click(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

'Xác minh bước 3 đã thành công'
WebUI.verifyElementText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/h4_Ngoi ng'), 
    'Ngoại ngữ')

'Nhấn button Tiếp tục'
WebUI.click(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

'Xác minh bước 4 đã thành công'
WebUI.verifyElementText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/h4_Kinh nghip lm vic'), 
    'Kinh nghiệp làm việc')

