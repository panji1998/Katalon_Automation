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

WebUI.navigateToUrl(parameter)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/input_Email or username_login'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/button_Login'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/a_User (1)'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/a_Administrator (1)'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/input_Bank Soal_tableSearch'), 
    'alfa')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/button_Status_ms-2 searchbutton rounded px-3 py-2'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/input_Bank Soal_tableSearch'), 
    '')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/button_Status_ms-2 searchbutton rounded px-3 py-2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/span_Role'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/input_concat(id(, , select2-opt_role_admini_6be142'), 
    'admin')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/input_concat(id(, , select2-opt_role_admini_6be142'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/button_Status_ms-2 searchbutton rounded px-3 py-2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/span_Satdik'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/input_concat(id(, , select2-opt_role_admini_6be142'), 
    'mapim')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/input_concat(id(, , select2-opt_role_admini_6be142'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/button_Status_ms-2 searchbutton rounded px-3 py-2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/span_Status'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/input_concat(id(, , select2-opt_role_admini_6be142'), 
    'aktif')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/input_concat(id(, , select2-opt_role_admini_6be142'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/button_Status_ms-2 searchbutton rounded px-3 py-2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/button_Tambah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/input_()_user_name'), 
    'jona_tan')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/input_()_user_email'), 
    'jona_tan121@gmail.com')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/select_YaTidak'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/select_YaTidak'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/button_Simpan administrator'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/button_OK administrator'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/a_2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/a_3'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/a_Next'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/a_3'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/a_Previous'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/04_administrator/select_102550100'), 
    '25', true)

WebUI.closeBrowser()

