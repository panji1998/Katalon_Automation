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

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/02_rekap nilai diklat/input_Email or username_login'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/02_rekap nilai diklat/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/02_rekap nilai diklat/button_Login'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/02_rekap nilai diklat/a_Rekapitulasi'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/02_rekap nilai diklat/a_Rekap Nilai Diklat'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/02_rekap nilai diklat/select_AdministrasiDatabase POLRI'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/02_rekap nilai diklat/select_Database KejaksaanDIKLAT CIPTA KERJA_cf26e2'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/02_rekap nilai diklat/span_Pilih Satdik'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/02_rekap nilai diklat/input_concat(id(, , select2-organizing_agen_3891ff'), 
    'mapim')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/02_rekap nilai diklat/input_concat(id(, , select2-organizing_agen_3891ff'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/02_rekap nilai diklat/select_Kelompok PenilaianSub Kelompok Penilaian (1)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/02_rekap nilai diklat/select_Kelompok PenilaianSub Kelompok Penilaian (1)'), 
    '1', true)

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/02_rekap nilai diklat/span_()_select2-selection select2-selection--single'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/02_rekap nilai diklat/input_concat(id(, , select2-organizing_agen_3891ff'), 
    'kelas 2')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/02_rekap nilai diklat/input_concat(id(, , select2-organizing_agen_3891ff'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/02_rekap nilai diklat/select_ViewExport to Excel (1)'), 
    'excell', true)

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/02_rekap nilai diklat/button_Proses'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/02_rekap nilai diklat/select_ViewExport to Excel'), 
    'html', true)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/02_rekap nilai diklat/button_Proses'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/02_rekap nilai diklat/a_Kembali'))

WebUI.closeBrowser()

