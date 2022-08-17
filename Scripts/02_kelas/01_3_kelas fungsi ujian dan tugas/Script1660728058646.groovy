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

WebUI.navigateToUrl('http://101.255.121.243:1180/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_Email or username_login'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_Login'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/a_Kelas'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/a_Kelas_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_Bank Soal_tableSearch'), 
    'kelas 4')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/a_Belum Lengkap_btn btn-light btn-sm no-but_994e61'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_Pilih Modul_tableSearchSchedules'), 
    'agama')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_Pilih Modul_ms-2 searchbutton rounded px-3 py-2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/a_Pilih'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/a_Online_btn btn-light btn-sm no-button no-shadow'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_()_assignment_name'), 
    '00002  -  PPPJ GELOMBANG II TAHUN 2016 - Kelas 2 - Agama dan Budi Pekerti')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_()_assignment_start_date'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/td_17'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_()_assignment_finish_date'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/td_17'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/textarea_Penyelenggaraan Ujian Agama dan Bu_a15b4a'), 
    'Penyelenggaraan Ujian Agama dan Budi Pekerti\nIsilah dengan jawaban yang tepat')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_()_assignment_location'), 
    'Jakarta Barat')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/a_Online_btn btn-light btn-sm no-button no-shadow_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_Tidak Terbatas_examination_duration_type'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_Terbatas_examination_duration'), 
    '120')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_()_display_question_per_page'), 
    '1')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_()_go_to_prev_page'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_()_go_to_prev_page'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_()_assignment_attemps'), 
    '1')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_Simpan grup setting pertanyaan'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_OK grup setting pertanyaan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/a_Tambah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_()_section_name'), 
    'pertanyaan 3')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_()_section_order'), 
    '3')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/p'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/div_isi dengan tepat'), 
    'isi dengan tepat')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_()_section_percentage'), 
    '0')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_()_is_random'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_()_section_duration'), 
    '0')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_Simpan'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_OK grup pertanyaan'))

WebUI.setText(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_Peserta Ujian_tableSearch'), 
    '0')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_Peserta grup ujian'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_pertanyaan 3_btn btn-light btn-sm no_709ff6'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_Ya, hapus'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_OK'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_Bank Soal_tableSearch'), 
    '40')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/a_hafalan dalam bentuk video_btn btn-light _f3e1b7'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_()_section_name'), 
    'hafalan dalam bentuk video')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_Simpan'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_OK fungsi ubah grup pertanyaan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/a_hafalan dalam bentuk video_btn btn-light _f3e1b7_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/a_Tambah_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/div_pertanyaan 4'), 
    'pertanyaan dasar')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_Contoh Soal_is_mandatory'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/input_()_maximum_point'), 
    '100')

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/select_Pilihan Ganda (Radio Button)Kotak Ce_14dda6'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_Simpan_1'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_OK next pertanyaan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_-_btn btn-light btn-sm no-button no-shadow'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_-_btn btn-light btn-sm no-button no-_392466'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_Ya, hapus'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/a_Kembali'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/a_Peserta Ujian'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/a_Kelas'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungsu ujian/a_Kelas_1'))

WebUI.closeBrowser()

