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

WebUI.navigateToUrl('https://www.careerlink.vn/nguoi-tim-viec/login')

WebUI.setText(findTestObject('Object Repository/demodiachib2/Page_ng nhp bng ti khon CareerLink  Viec la_c221a4/input_Ngi tm vic ng nhp__username'), 
    'hoanganh04092001@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/demodiachib2/Page_ng nhp bng ti khon CareerLink  Viec la_c221a4/input_Chng ti va gi li link kch hot n email_ae56e9'), 
    'eW9W0JjMqIcinpLPwXABsQ==')

WebUI.click(findTestObject('Object Repository/demodiachib2/Page_ng nhp bng ti khon CareerLink  Viec la_c221a4/button_ng nhp'))

WebUI.click(findTestObject('Object Repository/demodiachib2/Page_Qun l h s - Ngi tm vic  Viec lam, Tim _02c3de/i_Bn tm_lni lni-pencil'))

WebUI.click(findTestObject('Object Repository/demodiachib2/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/i_Thng tin lin h_lni lni-pencil'))

WebUI.setText(findTestObject('Object Repository/demodiachib2/Page_Kim vic lm trn Mng tuyn dng trc tuyn  _e37634/input_diachib2'), 
    '357 Bạch Mai')

WebUI.closeBrowser()

