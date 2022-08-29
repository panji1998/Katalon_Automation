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

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_Email or username_login'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_Login'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/a_Admin'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/a_Survey'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/a_Tambah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_()_survey_name'), 
    'evaluasi 4')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/textarea_Deskripsi_survey_description'), 
    'survey untuk testing')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_()_display_per_page'), 
    '1')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_Tambah Pertanyaan'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/textarea_()_question_name'), 
    'isilah survey berikut ini')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_()_mandatory_question'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/select_Pilih Tipe JawabanPilihan Ganda (Rad_fa2f46'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_()_score_items'), 
    '2')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_()_nama_jawaban'), 
    'baik')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_()_nama_jawaban_1'), 
    'tidak')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_Tambah'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_Tambah Pertanyaan'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/textarea_()_question_name'), 
    'isilah pertanyaan berikut ini 2')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_()_mandatory_question'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/select_Pilih Tipe JawabanPilihan Ganda (Rad_fa2f46'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_()_score_items'), 
    '2')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_()_nama_jawaban'), 
    'baik')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_()_nama_jawaban_1'), 
    'tidak')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_Tambah'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_OK pertanyaan 2 (1)'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_Tambah Pertanyaan'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/textarea_()_question_name'), 
    'isilah survey berikut ini 3')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_()_mandatory_question'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/select_Pilih Tipe JawabanPilihan Ganda (Rad_fa2f46'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_Tambah'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_OK pertanyaan 3'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_Tambah Pertanyaan'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/textarea_()_question_name'), 
    'isilah pertanyaan berikut ini 4')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_()_mandatory_question'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/select_Pilih Tipe JawabanPilihan Ganda (Rad_fa2f46'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_Tambah'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_OK pertanyaan 4'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_Tambah Pertanyaan'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/textarea_()_question_name'), 
    'isilah jawaban pertanyaan berikutn ini 5')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_()_mandatory_question'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/select_Pilih Tipe JawabanPilihan Ganda (Rad_fa2f46'), 
    '5', true)

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_Tambah'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_OK pertanyaan 5'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_Simpan'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_OK untuk simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_()_survey_start_date'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/td_28'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_()_survey_finish_date'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/th_August 2022'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/span_Sep'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/td_10'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_()_is_all_participants'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_Simpan'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_OK untuk setting simpan'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_Dashboard Admin_tableSearch'), 
    'evaluasi 4')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_Dashboard Admin_ms-2 searchbutton ro_50a8ca'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/a_-_btn btn-light btn-sm'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_()_survey_name'), 
    'evaluasi 3 bagian 1')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_Simpan'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_OK fungsi ubah bagian 1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_()_survey_start_date'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/td_27'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_Simpan'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_OK fungsi ubah bagian 2'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_Dashboard Admin_tableSearch'), 
    'evaluasi 3 bagian 1')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_Dashboard Admin_ms-2 searchbutton ro_50a8ca'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/a_-_btn btn-light btn-sm_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/a_Kembali'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_Dashboard Admin_tableSearch'), 
    'evaluasi 3 bagian 1')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_Dashboard Admin_ms-2 searchbutton ro_50a8ca'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/a_-_btn btn-light btn-sm_1_2'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/a_Admin'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/a_Survey'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/input_Dashboard Admin_tableSearch'), 
    'evaluasi 3 bagian 1')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_Dashboard Admin_ms-2 searchbutton ro_50a8ca'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_-_btn btn-danger btn-sm delete'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_Ya, hapus'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/02_survey/button_OK untuk hapus'))

WebUI.closeBrowser()

