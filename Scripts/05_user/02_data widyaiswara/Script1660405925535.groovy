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

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/input_Email or username_login'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/button_Login'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/a_User (1)'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/a_Data Widyaiswara (1)'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/input_Bank Soal_tableSearch'), 
    'itang')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/button_Bank Soal_ms-2 searchbutton rounded _ada804'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/input_Bank Soal_tableSearch'), 
    '')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/i_Bank Soal_fa fa-search text-white'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/button_Bank Soal_ms-2 searchbutton rounded _ada804'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/input_Bank Soal_tableSearch'), 
    'juru')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/button_Bank Soal_ms-2 searchbutton rounded _ada804'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/input_Bank Soal_tableSearch'), 
    'sd')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/button_Bank Soal_ms-2 searchbutton rounded _ada804'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/input_Bank Soal_tableSearch'), 
    '23 juli')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/button_Bank Soal_ms-2 searchbutton rounded _ada804'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/input_Bank Soal_tableSearch'), 
    '')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/button_Bank Soal_ms-2 searchbutton rounded _ada804'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/td_Nama'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/td_Nama'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/button_Tambah'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/span_--- Search ---'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/input_Simpan_select2-search__field'), 
    'cara')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/li_Caramel Cream - 1990849343485488'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/button_OK'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/input_Bank Soal_tableSearch'), 
    'muhammad')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/button_Bank Soal_ms-2 searchbutton rounded _ada804'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/button_Tambah'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/a_Kembali'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/button_Tambah'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/button_Widyaiswara_btn no-border bg-grey-so_766168'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/select_102550100'), 
    '25', true)

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/input_Bank Soal_tableSearch'), 
    '')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/02_data widyaiswara/button_Bank Soal_ms-2 searchbutton rounded _ada804'))

WebUI.delay(3)

WebUI.closeBrowser()

