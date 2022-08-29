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

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/input_Email or username_login'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/button_Login'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/a_Kurikulum'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/a_Evaluasi Kurikulum'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/input_Bank Soal_tableSearch'), 
    '00000')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/button_Pilih Kelas_ms-2 searchbutton rounde_172e76'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/input_Bank Soal_tableSearch'), 
    'agama dan budi pekerti')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/button_Pilih Kelas_ms-2 searchbutton rounde_172e76'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/input_Bank Soal_tableSearch'), 
    '10')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/button_Pilih Kelas_ms-2 searchbutton rounde_172e76'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/input_Bank Soal_tableSearch'), 
    'pppj gelombang')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/button_Pilih Kelas_ms-2 searchbutton rounde_172e76'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/input_Bank Soal_tableSearch'), 
    '6')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/button_Pilih Kelas_ms-2 searchbutton rounde_172e76'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/input_Bank Soal_tableSearch'), 
    '')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/button_Pilih Kelas_ms-2 searchbutton rounde_172e76'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/span_Pilih Jenis Diklat'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/input_concat(id(, , select2-opts_curriculum_a6a3de'), 
    'map')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/input_concat(id(, , select2-opts_curriculum_a6a3de'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/button_Pilih Kelas_ms-2 searchbutton rounde_172e76'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/span_Pilih Satdik'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/input_concat(id(, , select2-opts_curriculum_a6a3de'), 
    'mapim')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/input_concat(id(, , select2-opts_curriculum_a6a3de'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/button_Pilih Kelas_ms-2 searchbutton rounde_172e76'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/span_Pilih Tahun'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/input_concat(id(, , select2-opts_curriculum_a6a3de'), 
    '20')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/input_concat(id(, , select2-opts_curriculum_a6a3de'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/button_Pilih Kelas_ms-2 searchbutton rounde_172e76'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/span_Pilih Kelas'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/input_concat(id(, , select2-opts_curriculum_a6a3de'), 
    'pppj gelombang II tahun 2016 - kelas 1')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/input_concat(id(, , select2-opts_curriculum_a6a3de'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/button_Pilih Kelas_ms-2 searchbutton rounde_172e76'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/td_Mata Pelajaran'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/01_kurikulum/04_evaluasi kurikulum/td_Kelas'))

WebUI.closeBrowser()

