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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.careerlink.vn/')

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/i_ng k_cli-angle-down ml-xl-3 mr-1'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/a_ng nhp'))

WebUI.setText(findTestObject('Object Repository/demovip/Page_ng nhp bng ti khon CareerLink  Viec la_c221a4/input_Ngi tm vic ng nhp__username'), 
    'hoanganh04092001@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/demovip/Page_ng nhp bng ti khon CareerLink  Viec la_c221a4/input_Chng ti va gi li link kch hot n email_ae56e9'), 
    'eW9W0JjMqIcinpLPwXABsQ==')

WebUI.click(findTestObject('Object Repository/demovip/Page_ng nhp bng ti khon CareerLink  Viec la_c221a4/button_ng nhp'))

WebUI.verifyElementText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/span_Nguyn Hong Anh'), 
    'Nguyễn Hoàng Anh')

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/a_H s xin vic(3)'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Qun l h s - Ngi tm vic  Viec lam, Tim _02c3de/button_To h s mi'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Qun l h s - Ngi tm vic  Viec lam, Tim _02c3de/a_Khuyn khchTo h s theo tng bc6 bc yu cu  h_81939d'))

WebUI.setText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/input__input-0-2-11 form-control rounded-left'), 
    'xxxx')

WebUI.selectOptionByValue(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Vit NamVit kiuNc ngoi'), 
    'L', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_123456789101112131415161718192021222_566da4'), 
    '22', true)

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div__checkmark'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div__checkmark'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

WebUI.verifyElementText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/h4_Thng tin lin h'), 
    'Thông tin liên hệ')

WebUI.setText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/input_in thoi_input-0-2-11 form-control rou_f16c99'), 
    '0123456789')

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Vui lng chn'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Viet Nam'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Vui lng chn'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_H Ni'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Vui lng chn'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Qun Hai B Trng'))

WebUI.setText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/input_a ch ng_input-0-2-11 form-control rou_cfd822'), 
    'xxxxx')

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

WebUI.verifyElementText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/h4_Hc vn'), 
    'Học vấn')

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Vui lng chn'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_K s'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Vui lng chn'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_H Y Phm Ngc Thch'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Vui lng chn'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Nha Khoa'))

WebUI.selectOptionByValue(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Thng 1Thng 2Thng 3Thng 4Thng 5Thng 6_909065'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_195119521953195419551956195719581959_19f315'), 
    '2018', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Thng 1Thng 2Thng 3Thng 4Thng 5Thng 6_909065'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_195119521953195419551956195719581959_19f315'), 
    '2022', true)

WebUI.setText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/textarea_x'), 
    'x')

WebUI.setText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/textarea_xx'), 
    'xx')

WebUI.setText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/textarea_xxx'), 
    'xxx')

WebUI.setText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/textarea_xxxx'), 
    'xxxx')

WebUI.setText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/textarea_xxxxx'), 
    'xxxxx')

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

WebUI.verifyElementText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/h4_Ngoi ng'), 
    'Ngoại ngữ')

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

WebUI.verifyElementText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/h4_Kinh nghip lm vic'), 
    'Kinh nghiệp làm việc')

WebUI.selectOptionByValue(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Vui lng chn0123456789101112131415161_7edffe'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

WebUI.verifyElementText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/h4_Ngi tham kho'), 
    'Người tham khảo')

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

WebUI.verifyElementText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/h4_K nng'), 
    'Kỹ năng')

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

WebUI.verifyElementText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/h4_Mc tiu ngh nghip'), 
    'Mục tiêu nghề nghiệp')

WebUI.setText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/input_V tr mong mun_input-0-2-11 form-contr_9488d8'), 
    'xxx')

WebUI.setText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/input_Mc lng gn y nht_input-0-2-11 form-con_580030'), 
    '10.000.000')

WebUI.selectOptionByValue(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Thng lngCnh tranhHnNhp'), 
    'N', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Nhn vin ton thi gianNhn vin ton thi _5243c0'), 
    'A', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/select_Sinh vin  Thc tp sinhMi i lmNhn vinK_253329'), 
    'N', true)

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Thm ngnh ngh'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_CNTT - Phn mm'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Vui lng chn'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_H Ni'))

WebUI.setText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/textarea_x_1'), 
    'x')

WebUI.setText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/textarea_xx_1'), 
    'xx')

WebUI.setText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/textarea_xxx_1'), 
    'xxx')

WebUI.setText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/textarea_xxxx_1'), 
    'xxxx')

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_C th i ch_checkmark'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_C th i ch_checkmark'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Tip tc'))

WebUI.verifyElementText(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/h4_Trng thi h s'), 
    'Trạng thái hồ sơ')

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/div_Trng thi h s_checkmark'))

WebUI.click(findTestObject('Object Repository/demovip/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/button_Lu h s'))

WebUI.verifyElementText(findTestObject('Object Repository/demovip/Page_Qun l h s - Ngi tm vic  Viec lam, Tim _02c3de/a_xxxxang ch'), 
    'xxxxĐang chờ')

WebUI.closeBrowser()

