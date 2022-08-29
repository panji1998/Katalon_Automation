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

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/04_laporan peserta/input_Email or username_login'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/04_laporan peserta/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/04_laporan peserta/button_Login'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/04_laporan peserta/a_Rekapitulasi'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/04_laporan peserta/a_Laporan Peserta'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/04_laporan peserta/select_Database KejaksaanDIKLAT CIPTA KERJA_cf26e2'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/04_laporan peserta/span_Pilih Satdik'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/04_laporan peserta/input_concat(id(, , select2-organizing_agen_3891ff'), 
    'mapim')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/04_laporan peserta/input_concat(id(, , select2-organizing_agen_3891ff'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/04_laporan peserta/span_Kelas_select2-selection select2-selection--single'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/04_laporan peserta/li_PPPJ GELOMBANG II TAHUN 2016 - Kelas 2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/04_laporan peserta/select_ViewExport to Excel'), 
    'excell', true)

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/04_laporan peserta/button_Proses'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/04_laporan peserta/select_ViewExport to Excel'), 
    'html', true)

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/04_laporan peserta/button_Proses'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/04_laporan peserta/div_No PesertaNamaNIKNIPPangkatJabatanSatke_9f3e2c'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/04_laporan peserta/a_Kembali'))

WebUI.closeBrowser()

