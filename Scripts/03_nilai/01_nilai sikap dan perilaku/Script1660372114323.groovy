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

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/input_Email or username_login'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/button_Login'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/Page_ANTHEA KEJAGUNG/a_Nilai'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/Page_ANTHEA KEJAGUNG/a_Nilai Sikap Perilaku'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/span_Pilih Jenis Pendidikan'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/input_concat(id(, , select2-opts_curriculum_a6a3de'), 
    'mapim')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/input_concat(id(, , select2-opts_curriculum_a6a3de'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/button_Pilih Jenis Penilaian_ms-2 searchbut_c880b9'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/span_Pilih Satdik'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/input_concat(id(, , select2-opts_curriculum_a6a3de'), 
    'mapim')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/input_concat(id(, , select2-opts_curriculum_a6a3de'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/span_Pilih Tahun'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/input_concat(id(, , select2-opts_curriculum_a6a3de'), 
    '20')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/input_concat(id(, , select2-opts_curriculum_a6a3de'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/span_Pilih Kelas'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/input_concat(id(, , select2-opts_curriculum_a6a3de'), 
    'kelas 1')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/input_concat(id(, , select2-opts_curriculum_a6a3de'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/span_Pilih Jenis Penilaian'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/button_Pilih Jenis Penilaian_ms-2 searchbut_c880b9'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/td_Nama'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/td_Nama'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/td_Nama'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/button_Excel'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/div_HomeKurikulumJenis DiklatMata Pelajaran_040426'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/button_Pilih Jenis Penilaian_ms-2 searchbut_c880b9'))

WebUI.takeFullPageScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/nilai/01_nilai sikap dan perilaku/div_ImportExcel'))

WebUI.closeBrowser()

