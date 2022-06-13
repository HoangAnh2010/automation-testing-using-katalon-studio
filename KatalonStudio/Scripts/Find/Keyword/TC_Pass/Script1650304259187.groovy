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

'Mở trình duyệt'
WebUI.openBrowser('')

'Chuyển hướng đến trang web CareerLink'
WebUI.navigateToUrl('https://www.careerlink.vn/')

'Click chọn Ngành nghề/Địa điểm'
WebUI.click(findTestObject('Object Repository/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/span_Ngnh ngh a im'))

'Nhập từ khóa tìm kiếm'
WebUI.setText(findTestObject('Object Repository/Page_Tm kim vic lm nhanh vi CAREERLINK.VN/input_T kha tm kim ph bin_97c1f175-a67e-4d6_07b6cc'), 
    '')

'Click vào Địa điểm'
WebUI.click(findTestObject('Object Repository/Page_Tm kim vic lm nhanh vi CAREERLINK.VN/input_H Ch Minh_80a9edd1-9e44-4780-8964-a46_f1e68e'))

'Chọn "Hà Nội"'
WebUI.click(findTestObject('Object Repository/Page_Tm kim vic lm nhanh vi CAREERLINK.VN/div_H Ni'))

'Nhấn [Tìm kiếm]'
WebUI.click(findTestObject('Object Repository/Page_Tuyn dng, tm kim vic lm ti H Ni  Caree_ca541a/i_H Ni_lni lni-search-alt mr-xl-2'))

'Xác minh kết quả'
WebUI.verifyElementText(findTestObject('Object Repository/Page_Tuyn dng, tm kim vic lm ti H Ni  Caree_ca541a/h1_Vic lm ti H Ni'), 
    'Việc làm tại Hà Nội')

