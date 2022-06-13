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

'Thực hiện lại test case Tìm kiếm'
WebUI.callTestCase(findTestCase('Find/Keyword/TC_Pass'), [:], FailureHandling.STOP_ON_FAILURE)

'Click vào 1 kết quả'
WebUI.click(findTestObject('Object Repository/Page_Tuyn dng, tm kim vic lm ti H Ni  Caree_ca541a/a_TUYN GP NHN VIN KINH DOANH QUC T'))

'Xác minh tiêu đề thông tin tuyển dụng'
WebUI.verifyElementText(findTestObject('Object Repository/Page_TUYN GP NHN VIN KINH DOANH QUC T - CNG_c4805c/h1_TUYN GP NHN VIN KINH DOANH QUC T'), 
    '[TUYỂN GẤP] NHÂN VIÊN KINH DOANH QUỐC TẾ')

'Xác minh tên công ty của thông tin tuyển dụng'
WebUI.verifyElementText(findTestObject('Object Repository/Page_TUYN GP NHN VIN KINH DOANH QUC T - CNG_c4805c/span_CNG TY TNHH NC GII KHT TN'), 
    'CÔNG TY TNHH NƯỚC GIẢI KHÁT TÂN ĐÔ')

'Xác minh mức lương của thông tin tuyển dụng'
WebUI.verifyElementText(findTestObject('Object Repository/Page_TUYN GP NHN VIN KINH DOANH QUC T - CNG_c4805c/p_10.000.000 VND - 50.000.000 VNDMONTH'), 
    '10.000.000 VND - 50.000.000 VND\n\n\nMONTH')

'Đóng trình duyệt'
CustomKeywords.'myKeyword.closeBrower'()

