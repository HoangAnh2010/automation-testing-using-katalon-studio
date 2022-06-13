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

'Click Trạng thái hồ sơ'
WebUI.click(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Trng thi h s_checkmark'))

'Nhấn button Lưu hồ sơ'
WebUI.click(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Lu h s'))

'Xác minh bước 9 thành công'
WebUI.verifyElementText(findTestObject('Object Repository/demovip/Page_Qun l h s - Ngi tm vic  Viec lam, Tim _02c3de/a_xxxxang ch'), 
    'HỒ SƠ XIN VIỆCĐang chờ')

