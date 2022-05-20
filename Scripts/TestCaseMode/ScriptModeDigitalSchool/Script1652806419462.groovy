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

//GROOVY
WebUI.openBrowser("")

WebUI.navigateToUrl("https://pksdigitalschool.id/")

WebUI.click(findTestObject('Object Repository/logindigitalschool/Page_PKS Digital School/a_Member Area'))

WebUI.setText(findTestObject('Object Repository/logindigitalschool/Page_Login Member PKS Digital School/input_Email Address_email'), "haryantosaputra.inc@gmail.com")

WebUI.setEncryptedText(findTestObject('Object Repository/logindigitalschool/Page_Login Member PKS Digital School/input_Password_password'), "SVHhkfLKbWH2exXO5G3v0A==")

WebUI.click(findTestObject('Object Repository/logindigitalschool/Page_Login Member PKS Digital School/button_Log In'))

WebUI.verifyTextPresent("Member Area", false)

WebUI.closeBrowser()