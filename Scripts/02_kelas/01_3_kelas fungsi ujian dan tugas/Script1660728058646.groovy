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

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_Email or username_login'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_Login'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/a_Kelas'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/a_Kelas_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_Bank Soal_tableSearch'), 
    'kelas 4')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/a_Belum Lengkap_btn btn-light btn-sm no-but_994e61'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_Pilih Modul_tableSearchSchedules'), 
    'eksekusi')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_Pilih Modul_ms-2 searchbutton rounded px-3 py-2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/a_Pilih'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/a_Online_btn btn-light btn-sm no-button no-shadow'))

WebUI.selectOptionByValue(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/select_Pilih JenisUjianTugasQuiz'), 
    '2', true)

WebUI.sendKeys(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/select_Pilih JenisUjianTugasQuiz'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_()_assignment_name'), 
    '00002  -  PPPJ GELOMBANG II TAHUN 2016 - Kelas 2 - Agama dan Budi Pekerti')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_()_assignment_start_date'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/td_17'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_()_assignment_finish_date'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/td_17'))

WebUI.setText(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_()_assignment_start_hour'), 
    '0800')

WebUI.setText(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_()_assignment_finish_hour'), 
    '1200')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/textarea_Penyelenggaraan Ujian Agama dan Bu_a15b4a'), 
    'Penyelenggaraan Ujian Agama dan Budi Pekerti\nIsilah dengan jawaban yang tepat')

WebUI.selectOptionByValue(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/select_Pilih MetodeOnlineOffline'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/select_Pilih SifatBuka BukuTutup Buku'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_()_assignment_location'), 
    'Jakarta Barat')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_OK'))

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/a_Online_btn btn-light btn-sm no-button no-shadow_1'))

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_Tidak Terbatas_examination_duration_type'))

not_run: WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_Terbatas_examination_duration'), 
    '120')

not_run: WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_()_display_question_per_page'), 
    '1')

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_()_go_to_prev_page'))

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_()_go_to_prev_page'))

not_run: WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_()_assignment_attemps'), 
    '1')

not_run: WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_Simpan grup setting pertanyaan'))

not_run: WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_OK grup setting pertanyaan'))

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/a_Tambah'))

not_run: WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_()_section_name'), 
    'pertanyaan 3')

not_run: WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_()_section_order'), 
    '3')

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/p'))

not_run: WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/div_isi dengan tepat'), 
    'isi dengan tepat')

not_run: WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_()_section_percentage'), 
    '0')

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_()_is_random'))

not_run: WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_()_section_duration'), 
    '0')

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_Simpan'))

not_run: WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_OK grup pertanyaan'))

not_run: WebUI.setText(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_Peserta Ujian_tableSearch'), 
    '0')

not_run: WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_Peserta grup ujian'))

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_pertanyaan 3_btn btn-light btn-sm no_709ff6'))

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_Ya, hapus'))

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_OK'))

not_run: WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_Bank Soal_tableSearch'), 
    '40')

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/a_hafalan dalam bentuk video_btn btn-light _f3e1b7'))

not_run: WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_()_section_name'), 
    'hafalan dalam bentuk video')

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_Simpan'))

not_run: WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_OK fungsi ubah grup pertanyaan'))

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/a_hafalan dalam bentuk video_btn btn-light _f3e1b7_1'))

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/a_Tambah_1'))

not_run: WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/div_pertanyaan 4'), 
    'pertanyaan dasar')

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_Contoh Soal_is_mandatory'))

not_run: WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/input_()_maximum_point'), 
    '100')

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/select_Pilihan Ganda (Radio Button)Kotak Ce_14dda6'), 
    '4', true)

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_Simpan_1'))

not_run: WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_OK next pertanyaan'))

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_-_btn btn-light btn-sm no-button no-shadow'))

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_-_btn btn-light btn-sm no-button no-_392466'))

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_Ya, hapus'))

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/button_OK'))

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/a_Kembali'))

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/a_Peserta Ujian'))

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/a_Kelas'))

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/03_fungs ujian dan tugas/a_Kelas_1'))

not_run: WebUI.closeBrowser()

