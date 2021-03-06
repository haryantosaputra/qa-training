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

WebUI.navigateToUrl('https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp')

WebUI.setText(findTestObject('Object Repository/BuatAkunGmail/Page_Buat Akun Google/input_Buat Akun Google_firstName'), 
    'cahyo')

WebUI.setText(findTestObject('Object Repository/BuatAkunGmail/Page_Buat Akun Google/input_Buat Akun Google_lastName'), 'sumbo')

WebUI.setText(findTestObject('Object Repository/BuatAkunGmail/Page_Buat Akun Google/input_Buat Akun Google_Username'), 'sumbocahyo')

WebUI.setEncryptedText(findTestObject('Object Repository/BuatAkunGmail/Page_Buat Akun Google/input_Gunakan alamat email saya saat ini se_55ce11'), 
    'Iyl26SXK+VcOvo6WFHzzRg==')

WebUI.setEncryptedText(findTestObject('Object Repository/BuatAkunGmail/Page_Buat Akun Google/input_Gunakan alamat email saya saat ini se_83a7dd'), 
    'xuQX9Z6/zsk6wwBuMIPNWw==')

WebUI.click(findTestObject('Object Repository/BuatAkunGmail/Page_Buat Akun Google/input_Gunakan minimal 8 karakter dengan cam_49a996'))

WebUI.setText(findTestObject('Object Repository/BuatAkunGmail/Page_Buat Akun Google/input_Gunakan alamat email saya saat ini se_83a7dd_1'), 
    'Okebro24')

WebUI.click(findTestObject('Object Repository/BuatAkunGmail/Page_Buat Akun Google/span_Login saja'))

