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

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Email or username_login'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Login'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Kurikulum'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Diklat'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Bank Soal_tableSearch'), 
    'mapim')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/span_Pilih Jenis Diklat'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'mapim')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Tambah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_()_course_code'), 
    'KD-1001')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_()_course_name'), 
    'Tambang')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/span_--- Search ---'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'perta')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_()_course_start_date'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/th_'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/td_6'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_()_course_end_date'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/th_'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/td_30'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Jumlah Jam - Teori_course_duration_teory'), 
    '10')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Jumlah Jam - Praktek_course_duration__03e586'), 
    '22')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_()_course_max_participants'), 
    '15')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/textarea_Tujuan Diklat_course_purpose'), 
    'Memahami undang - undang dalam pertambangan')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Nilai Minimum Kelulusan_course_minimu_71e3ec'), 
    '75')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/span_--- Search ---_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'akademik')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/textarea_Prasyarat Peserta_course_requisite'), 
    'semua bisa mengikuti diklat tambang')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/span_--- Search ---_1_2'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'teknis')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/span_Tambah'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/span_--- Search ---_1_2'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'agu')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/span_Tambah'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Diklat Jaksa Agung_no-button'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Simpan diklat'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/div_DiklatKode Diklat ()Nama Diklat ()Nama _563373'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Submit'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Diklat Jaksa Agung_no-button'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Import'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Klik Untuk Download'))

WebUI.uploadFile(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/import file 1'), 'D:\\ANTHEA KEJAGUNG AUTOMATION VERSI 01\\kurikulum\\diklat\\dokumen\\1template_loader_courses.xlsx')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Lewati baris nomer 1 (Judul)_skip'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Submit_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Kembali'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Diklat_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Import Mata Pelajaran'))

WebUI.switchToWindowTitle('Badiklat Kejaksaan RI')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Klik Untuk Download_1'))

WebUI.switchToWindowTitle('Badiklat Kejaksaan RI')

WebUI.uploadFile(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/import file 2'), 'D:\\ANTHEA KEJAGUNG AUTOMATION VERSI 01\\kurikulum\\diklat\\dokumen\\2template_loader_integrate_lesson.xlsx')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Lewati baris nomer 1 (Judul)_skip'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Submit_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Kembali_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Diklat_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Bank Soal_tableSearch'), 
    '1000')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Tambang_btn btn-light btn-sm no-button no-shadow'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/textarea_Tujuan Diklat_course_purpose'), 
    'Memahami undang - undang dalam pertambangan Nasional')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/span_--- Search ---_1_2'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'tekn')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_OK'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Bank Soal_tableSearch'), 
    '1000')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_unread messages'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Tambah Mata Pelajaran'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/span_--- Search ---_1_2_3'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'ekse')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Tambah Mata Pelajaran'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/span_--- Search ---_1_2_3'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'tambang')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_OK'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Bank Soal_tableSearch'), 
    'eksekusi')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Mata Pelajaran Utama_btn btn-light btn-sm_391d0e'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Detail Mata Pelajaran'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Bank Soal_tableSearch'), 
    'eksekusi')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Mata Pelajaran Utama_btn btn-light b_f42ee5'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Yes, delete it'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Peminatan_btn btn-light btn-sm no-button _39792a'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Literatur'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Komponen Penilaian'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Tambah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input__score_item_name'), 
    'teori')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input__score_item_weight'), 
    '60')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input__score_item_minimum'), 
    '75')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Tambah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input__score_item_name'), 
    'praktikum')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input__score_item_weight'), 
    '40')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input__score_item_minimum'), 
    '75')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_praktikum_btn btn-light btn-sm no-button _e62fbb'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input__score_item_name'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Tambah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input__score_item_name'), 
    'quiz')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input__score_item_weight'), 
    '10')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input__score_item_minimum'), 
    '80')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Kembali_1_2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_praktikum_btn btn-light btn-sm no-bu_f25cc0'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Ya, hapus'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Tambah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input__score_item_name'), 
    'praktikun')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input__score_item_weight'), 
    '40')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input__score_item_minimum'), 
    '75')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Kembali_1_2_3'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Kembali_1_2_3_4'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Bank Soal_tableSearch'), 
    '1000')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Tambang_btn btn-light btn-sm no-button no-shadow_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Bank Soal_tableSearch'), 
    'akademik')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Tambah_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_()_score_type_name'), 
    'bobot 3')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/span_--- Kelompok Menu ---'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'sikap')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_()_score_type_weight'), 
    '20')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Nilai Minimal Kelulusan_score_type_minimum'), 
    '75')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Nilai Maksimal Kelulusan_score_type_maximum'), 
    '95')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/span_--- Search ---_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'sikap')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Kembali_1_2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Skala Nilai Akademik_btn btn-light btn-sm_6a6e18'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_praktikum_btn btn-light btn-sm no-button _e62fbb'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Kembali_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/td_Pembobotan Nilai'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/td_Pembobotan Nilai'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Kembali_1_2_3_4'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Bank Soal_tableSearch'), 
    '1000')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Tambang_btn btn-light btn-sm no-button no-shadow_1_2'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_()_course_code'), 
    'KD-1001')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_OK'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_()_course_name'), 
    'Tambang I')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_OK'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Bank Soal_tableSearch'), 
    '1000')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Tambang_btn btn-light btn-sm no-button no-shadow_1_2_3'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Kalender'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Kelas'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Kurikulum'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Diklat'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Bank Soal_tableSearch'), 
    '1000')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Tambang_btn btn-light btn-sm no-button no-shadow_1_2_3'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Import Jadwal'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Klik Untuk Download_1_2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Lewati baris nomer 1 (Judul)_skip'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Lewati baris nomer 1 (Judul)_skip'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Submit_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Kembali_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Jadwal'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Atur Jadwal'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_sd_schedule_start'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/th_'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/th_'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/td_6'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/body_Badiklat Kejaksaan RINotifikasiKelas A_665d43'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/th_'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/td_30'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Frekuensi_schedule_frequency'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Jam_schedule_start_time'), 
    '08:00')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_sd_schedule_finish_time'), 
    '11:00')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Jadwal'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Kelas'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Kurikulum'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Diklat'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_Bank Soal_tableSearch'), 
    '1000')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/a_Tambang_btn btn-light btn-sm no-button no-shadow_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Ubah'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/span_--- Search ---_1_2_3_4'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    't')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/03_diklat/button_Batal'))

WebUI.closeBrowser()

