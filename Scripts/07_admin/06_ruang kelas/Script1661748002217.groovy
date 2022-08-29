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

WebUI.navigateToUrl('http://103.253.107.18:24400/')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/input_Email or username_login'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/button_Login'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/a_Admin'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/a_Ruang Kelas'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/button_Tambah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/input_()_room_code'), 
    'C-05')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/input_()_room_name'), 
    'kelas V')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/span_Satdik'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/li_Pusdiklat DTF'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/input_Kapasitas Ruang Kelas_room_capacity'), 
    '20')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/button_OK'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/input_Dashboard Admin_tableSearch'), 
    'c-05')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/button_Pilih Satdik_ms-2 searchbutton round_1e1cc7'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/a_Pusdiklat DTF_btn btn-light btn-sm no-but_7372ab'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/input_()_room_name'), 
    'kelas V')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/button_OK'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/input_Dashboard Admin_tableSearch'), 
    'c-05')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/button_Pilih Satdik_ms-2 searchbutton round_1e1cc7'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/a_Pusdiklat DTF_btn btn-light btn-sm no-but_7372ab_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/a_Kembali'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/input_Dashboard Admin_tableSearch'), 
    'c-05')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/button_Pilih Satdik_ms-2 searchbutton round_1e1cc7'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/button_Pusdiklat DTF_btn btn-light btn-sm d_b4e928'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/button_Ya, hapus'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/06_ruang kelas/button_OK'))

WebUI.closeBrowser()

