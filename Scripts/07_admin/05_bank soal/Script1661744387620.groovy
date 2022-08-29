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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/input_Email or username_login'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/button_Login'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/a_Admin'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/a_Bank Soal'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/a_Tambah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/input_()_examination_code'), 
    'K003')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/input_()_examination_name'), 
    'penyelidikan')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/span_--- Search ---'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/li_MP-002 - PBB'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/textarea_()_examination_description'), 
    'penyelidikan tingkat satu')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/input_Tidak Terbatas_examination_duration_type'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/input_Terbatas_examination_duration'), 
    '30')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/input_()_display_question_per_page'), 
    '1')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/input_()_go_to_prev_page'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/a_Tambah_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/input_()_section_name'), 
    'isian')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/input_()_section_order'), 
    '1')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/p'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/div_isilah dengan jaaban yang benar'), 
    '<p style="">isilah dengan jaaban yang benar</p>')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/input_()_section_percentage'), 
    '100')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/input_()_is_random'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/input_()_section_duration'), 
    '30')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/button_Simpan'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/button_OK untuk essay'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/a_isian_btn btn-light btn-sm no-button no-shadow'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/input_()_section_name'), 
    'Essay')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/button_Simpan'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/button_OK untuk ubah'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/a_Essay_btn btn-light btn-sm no-button no-shadow'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/a_Tambah_1_2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/p_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/div_sebutkan pasal yang mendukung tentang p_1fcb78'), 
    'sebutkan pasal yang mendukung tentang penyidikan')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/input_Contoh Soal_is_mandatory'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/input_()_maximum_point'), 
    '100')

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/select_Pilihan Ganda (Radio Button)Kotak Ce_14dda6'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/button_Simpan_1'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/05_bank soal/button_OK grup pertanyaan'))

WebUI.closeBrowser()

