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

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Email or username_login'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Login'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Kurikulum'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Diklat'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Bank Soal_tableSearch'), 
    '12')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Bank Soal_tableSearch'), 
    '')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/span_Pilih Jenis Diklat'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'mapim')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Tambah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_course_code'), 
    'DK-1003')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_course_name'), 
    'Diklat Fungsional')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/span_--- Search ---'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'mapim')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_course_start_date'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/th_'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/td_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_course_end_date'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/td_31'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Jumlah Jam - Teori_course_duration_teory'), 
    '12')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Jumlah Jam - Praktek_course_duration__03e586'), 
    '12')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_course_max_participants'), 
    '20')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/textarea_Tujuan Diklat_course_purpose'), 
    'Fungsional')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Nilai Minimum Kelulusan_course_minimu_71e3ec'), 
    '75')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/span_--- Search ---_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'akad')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_OK'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Bank Soal_tableSearch'), 
    '1003')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Import'))

WebUI.uploadFile(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/import 1'), 
    'D:\\ANTHEA KEJAGUNG AUTOMATION VERSI 01\\kurikulum\\diklat\\dokumen\\1template_loader_courses.xlsx')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Lewati baris nomer 1 (Judul)_skip'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Submit'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Kembali'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Diklat_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Import Mata Pelajaran'))

WebUI.uploadFile(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/import 2'), 
    'D:\\ANTHEA KEJAGUNG AUTOMATION VERSI 01\\kurikulum\\diklat\\dokumen\\2template_loader_integrate_lesson.xlsx')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Lewati baris nomer 1 (Judul)_skip'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Submit'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Kembali_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Diklat_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Bank Soal_tableSearch'), 
    '1003')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Diklat Fungsional_btn btn-light btn-sm no_be9983'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_course_code'), 
    'DK-1004')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_OK'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Bank Soal_tableSearch'), 
    '1004')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_unread messages'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Tambah Mata Pelajaran'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/span_--- Search ---_1_2'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'e')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/li_MP-016 - Eksekusi'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/Page_Badiklat Kejaksaan RI/button_Simpan mapel eksekusi'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/Page_Badiklat Kejaksaan RI/button_OK mapel eksekusi'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Tambah Mata Pelajaran'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/Page_Badiklat Kejaksaan RI/button_Simpan mapel kosong'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Mata Pelajaran_btn no-border bg-grey_39a1df'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Tambah Mata Pelajaran'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Kembali_1_2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Tambah Mata Pelajaran'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/span_--- Search ---_1_2'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'p')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/li_MP-014 - Penuntutan'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/Page_Badiklat Kejaksaan RI/button_Simpan mapel penuntutan'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/Page_Badiklat Kejaksaan RI/button_OK mapel penuntutan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Mata Pelajaran Utama_btn btn-light b_f42ee5'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Yes, delete it'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/Page_Badiklat Kejaksaan RI/button_OK hapus mapel penuntutan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Mata Pelajaran Utama_btn btn-light btn-sm_391d0e'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Literatur'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Komponen Penilaian'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Tambah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_score_item_name'), 
    'teori')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_score_item_weight'), 
    '60')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_score_item_minimum'), 
    '70')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/Page_Badiklat Kejaksaan RI/button_Simpan komponen penilaian'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/Page_Badiklat Kejaksaan RI/button_OK komponen penilaian'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Tambah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_score_item_name'), 
    'praktik')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_score_item_weight'), 
    '40')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_score_item_minimum'), 
    '70')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Tambah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_score_item_name'), 
    'efv')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_score_item_weight'), 
    '65')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_score_item_minimum'), 
    '70')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Mata Pelajaran_btn no-border bg-grey_39a1df'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Kembali_1_2_3'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Kembali_1_2_3_4'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Bank Soal_tableSearch'), 
    '1004')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Diklat Fungsional_btn btn-light btn-sm no_be9983_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Tambah_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_score_type_name'), 
    '1')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_score_type_weight'), 
    '50')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/span_--- Kelompok Menu ---'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'aka')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Nilai Minimal Kelulusan_score_type_minimum'), 
    '70')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Nilai Maksimal Kelulusan_score_type_maximum'), 
    '95')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/span_--- Search ---_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'aka')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_OK'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_score_type_weight'), 
    '0')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Skala Nilai Akademik_btn btn-light b_b20a66'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Ya, hapus'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_OK'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Bank Soal_tableSearch'), 
    'akademik')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Skala Nilai Akademik_btn btn-light btn-sm_6a6e18'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Nilai Minimal Kelulusan_score_type_minimum'), 
    '70')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Nilai Maksimal Kelulusan_score_type_maximum'), 
    '')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Nilai Minimal Kelulusan_score_type_minimum'), 
    '')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_OK'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Bank Soal_tableSearch'), 
    'akademik')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Skala Nilai Akademik_btn btn-light btn-sm_6a6e18_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Tambah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_score_group_code'), 
    'tri')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_score_group_name'), 
    'esk')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_score_group_weight'), 
    '0')

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/select_YaTidak'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_esk_btn btn-light btn-sm no-button n_29eab1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Ya, hapus'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Kembali_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Kembali_1_2_3_4'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Bank Soal_tableSearch'), 
    '1004')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Diklat Fungsional_btn btn-light btn-sm no_be9983_1_2'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_course_code'), 
    'DK-1005')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_()_course_name'), 
    'Diklat Fungsional 6')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_OK'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Bank Soal_tableSearch'), 
    '1004')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Diklat Fungsional_btn btn-light btn-sm no_be9983_1_2_3'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Kalender'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/div_HUT RI'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Kembali_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Import Jadwal'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Submit'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Kembali_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Jadwal'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Atur Jadwal'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_sd_schedule_start'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/td_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_sd_schedule_finish'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/td_13'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Frekuensi_schedule_frequency'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Jam_schedule_start_time'), 
    '08:00')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_sd_schedule_finish_time'), 
    '10:00')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Jadwal'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Kurikulum'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Diklat'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Bank Soal_tableSearch'), 
    '1004')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Diklat Fungsional_btn btn-light btn-sm no_be9983_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Ubah'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Batal'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Kurikulum'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/a_Diklat'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/input_Bank Soal_tableSearch'), 
    '1004')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/Page_Badiklat Kejaksaan RI/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.closeBrowser()

