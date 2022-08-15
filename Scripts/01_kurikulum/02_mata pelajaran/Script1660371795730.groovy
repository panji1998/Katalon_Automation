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

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_Email or username_login'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/button_Login'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/a_Kurikulum'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/a_Mata Pelajaran'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_Bank Soal_tableSearch'), 
    'pbb')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_Bank Soal_tableSearch'), 
    '')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/span_Pilih Tahun Kurikulum'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_concat(id(, , select2-opts_year-conta_6c8c76'), 
    '2016')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_concat(id(, , select2-opts_year-conta_6c8c76'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/span_Pilih Jenis Diklat'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_concat(id(, , select2-opts_year-conta_6c8c76'), 
    'mapim')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_concat(id(, , select2-opts_year-conta_6c8c76'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/span_Pilih Tahun Kurikulum'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_concat(id(, , select2-opts_year-conta_6c8c76'), 
    '2016')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_concat(id(, , select2-opts_year-conta_6c8c76'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/a_Tambah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_()_lesson_code'), 
    'MP-1000')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_()_lesson_name'), 
    'Ilmu Pertambangan')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_Tahun_lesson_year'), 
    '2016')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/span_Nama Jenis Diklat'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_concat(id(, , select2-opts_year-conta_6c8c76'), 
    'pertamba')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_concat(id(, , select2-opts_year-conta_6c8c76'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/span_Kelompok Mata Pelajaran'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_concat(id(, , select2-opts_year-conta_6c8c76'), 
    'Peminatan')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_concat(id(, , select2-opts_year-conta_6c8c76'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_()_minimum_score'), 
    '70')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_()_lesson_duration'), 
    '32')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_()_lesson_per_hours'), 
    '45')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/textarea_Standard Kompetensi_lesson_core_co_e70ca9'), 
    'Paham dan mengerti Ilmu Pertambangan')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/a_Detail Mata Pelajaran'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/a_Topik'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/a_Tambah_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_()_topic_name'), 
    'Perancangan undang-undang mendirikan pertambangan')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/li_Pembahasan Sub Topik_select2-search sele_a7ba76'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_concat(id(, , select2-opts_year-conta_6c8c76'), 
    'rancang susun undang-undang')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_Jumlah Jam Pelajaran per Topik_topic_hours'), 
    '32')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/a_Literatur'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/textarea_Fungsi_document_name'), 
    'pertambangan')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/textarea_Fungsi_document_description'), 
    'pertambangan')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/button_Tambah'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/button_Fungsi_btn btn-danger btn-sm'))

WebUI.uploadFile(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/upload literatur'), 'D:\\ANTHEA KEJAGUNG AUTOMATION VERSI 01\\kurikulum\\mata pelajaran\\dokumen\\pertambangan.pdf')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/button_Simpan'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/button_OK literature'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/a_Kembali'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_Bank Soal_tableSearch'), 
    'mp-1000')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/button_Pilih Jenis Diklat_ms-2 searchbutton_983a29'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/a_Peminatan_btn btn-light btn-sm no-button _39792a'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_()_minimum_score'), 
    '75')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/a_Import'))

WebUI.switchToWindowTitle('Badiklat Kejaksaan RI')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/a_Klik Untuk Download'))

WebUI.switchToWindowTitle('Badiklat Kejaksaan RI')

WebUI.uploadFile(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/import mata_pelajaran'), 'D:\\ANTHEA KEJAGUNG AUTOMATION VERSI 01\\kurikulum\\mata pelajaran\\dokumen\\template_mata_pelajaran.xlsx')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_Lewati baris nomer 1 (Judul)_skip'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/button_Submit'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/a_Kembali_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/a_Mata Pelajaran_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/a_Import Topik'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/a_Klik Untuk Download_1'))

WebUI.uploadFile(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/import topik'), 'D:\\ANTHEA KEJAGUNG AUTOMATION VERSI 01\\kurikulum\\mata pelajaran\\dokumen\\template_loader_topik.xlsx')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/input_Lewati baris nomer 1 (Judul)_skip'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/button_Submit'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/02_mata pelajaran/a_Kembali_1_2'))

WebUI.closeBrowser()

