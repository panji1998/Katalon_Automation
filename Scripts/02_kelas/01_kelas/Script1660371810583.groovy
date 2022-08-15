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

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Email or username_login'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Login'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kelas'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kelas_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Bank Soal_tableSearch'), 
    '002')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Bank Soal_tableSearch'), 
    '')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/span_Pilih Jenis Diklat'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'map')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/span_Pilih Satdik'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'mapim')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/span_Pilih Tahun'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    '20')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/span_Pilih Status Penilaian'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'len')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Tambah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_()_class_name'), 
    'PPJ 2016 kelas 4')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/span_--- Search ---'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'diklat ci')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/span_--- Search ---_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'mapim')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_AngkatanBatch_class_batch'), 
    '10/XI')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Lokasi_class_location'), 
    'Bogor')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_()_class_max_participants'), 
    '10')

WebUI.uploadFile(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Gambar Thumbnail_photo'), 'D:\\ANTHEA KEJAGUNG AUTOMATION VERSI 01\\kelas\\kelas\\dokumen\\PPPJ gel 2016.jpg')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/span_--- Search ---_1_2'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'ali')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/span_Tambah'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/span_--- Search ---_1_2'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'seti')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/span_Tambah'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_(4234324324234324) - SETIAWAN BUDHI _b90032'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Simpan_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Atur Jadwal'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Frekuensi_schedule_frequency'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Jam_schedule_start_time'), 
    '08:00')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_sd_schedule_finish_time'), 
    '09:00')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/span_--- Search ---_1_2'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'rima')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/span_--- Search ---_1_2_3'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'kela')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Simpan_2'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_OK_2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Atur Jadwal'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/select_SeninSelasa RabuKamis JumatSabtu Minggu'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_sd_event_start_times'), 
    '08:00')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_sd_event_finish_times'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_sd_event_finish_times'), 
    '1:000')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/span_--- Search ---_1_2'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'ali')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/span_--- Search ---_1_2_3'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'kelas')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Simpan_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_OK'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Bank Soal_tableSearch'), 
    'utama')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Bank Soal_tableSearch'), 
    'senin')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Bank Soal_tableSearch'), 
    '')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/span_Terjadwal dan Tak Terjadwal'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    'ter')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_concat(id(, , select2-opts_curiculums_2d1902'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kalender'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Peserta'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Tambah'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_-_checkuser'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Tambah_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Unduh Dokumen'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_-_btn btn-light btn-sm no-button no-shadow'))

WebUI.rightClick(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_-_btn btn-light btn-sm no-button no-shadow'))

WebUI.switchToWindowTitle('Badiklat Kejaksaan RI')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/i_-_icon-1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_-_btn btn-light btn-sm waves-effect waves-light'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Nilai Mata Pelajaran'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kehadiran'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kembali'))

WebUI.switchToWindowTitle('Badiklat Kejaksaan RI')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_-_btn btn-light btn-sm no-button no-shadow_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kembali_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Template Sertifikat'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Ubah'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Batal'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Peserta'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Jadwal'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kelas_1_2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kelas'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kelas_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Bank Soal_tableSearch'), 
    '33')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Import'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Lewati baris nomer 1 (Judul)_skip'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Submit'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kembali_1_2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kelas_1_2_3'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Bank Soal_tableSearch'), 
    '33')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Belum Lengkap_btn btn-light btn-sm no-but_994e61'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Lokasi_class_location'), 
    'Bogor,jawa barat')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Simpan_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kelas'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kelas_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Bank Soal_tableSearch'), 
    '33')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Belum Lengkap_btn btn-light btn-sm no-but_994e61_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_RIMA MIFTACHUL FAHRUDIN_btn btn-light btn_cd2615'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/select_HadirTidak HadirSakitIzinDispensasi'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kembali_1_2_3'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Loader Absensi'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Lewati baris nomer 1 (Judul)_skip'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Proses'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Nilai'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_UJian_btn btn-light btn-sm waves-effect w_c4cd91'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_-_btn btn-light btn-sm no-button no-shadow'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Quiz_score_items'), 
    '87')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Simpan_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_-_btn btn-light btn-sm no-button no-shadow'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_UJian_score_items'), 
    '65')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Simpan_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kembali_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Quiz_btn btn-light btn-sm waves-effect wa_624323'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_-_btn btn-light btn-sm no-button no-shadow'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Ujian_score_items (1)'), 
    '65')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Simpan_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kembali_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Nilai Sikap Perilaku'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Nilai Sikap Perilaku_btn btn-light btn-sm_cda777'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Tobato tumoto timo_btn btn-light btn_bbf96f'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Nilai Sikap Perilaku_score_items'), 
    '90')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Simpan_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kembali_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Status Kelulusan Diklat'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Import Nilai'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Lewati baris nomer 1 (Judul)_skip'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Proses'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Kunci Nilai'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Ya, Kunci'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kelas'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kelas_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Bank Soal_tableSearch'), 
    '33')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Belum Lengkap_btn btn-light btn-sm no-but_994e61'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Template Sertifikat'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Unduh Semua Sertifikat'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kelas_1_2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kelas'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Kelas_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Bank Soal_tableSearch'), 
    '33')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Lengkap_btn btn-light btn-sm no-button no-shadow'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Pilih'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/input_Bank Soal_tableSearch'), 
    'ujian')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/a_Offline_btn btn-light btn-sm no-button no-shadow'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_Simpan_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/button_OK'))

WebUI.closeBrowser()

