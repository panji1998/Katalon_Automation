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

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/input_Email or username_login'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/button_Login'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/a_User'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/a_Kepala Bandiklat'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/input_Bank Soal_tableSearch'), 
    'ardi')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/button_Bank Soal_ms-2 searchbutton rounded _ada804'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/input_Bank Soal_tableSearch'), 
    '1')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/button_Bank Soal_ms-2 searchbutton rounded _ada804'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/input_Bank Soal_tableSearch'), 
    '')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/button_Bank Soal_ms-2 searchbutton rounded _ada804'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/td_NIP'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/td_NIP'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/td_Nama'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/td_Nama'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/td_Nama'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/button_Tambah'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/span_--- Search ---'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/input_Simpan_select2-search__field'), 
    'muha')

WebUI.delay(3)

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/li_MUHAMMAD SOFYAN - 09234892347'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/button_OK'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/button_Tambah'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/a_Kembali'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/button_Tambah'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/button_Kepala Bandiklat_btn no-border bg-gr_4cf654'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/01_kepala bandiklat/select_102550100'), 
    '25', true)

WebUI.delay(3)

WebUI.closeBrowser()

