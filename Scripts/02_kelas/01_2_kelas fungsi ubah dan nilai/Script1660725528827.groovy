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

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_Email or username_login'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_Login'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Kelas'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Kelas_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_Bank Soal_tableSearch'), 
    'kelas 4')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Belum Lengkap_btn btn-light btn-sm no-but_994e61'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_()_class_name'), 
    'PPPJ GELOMBANG II TAHUN 2016 - Kelas 4')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Kelas'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Kelas_1'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_Bank Soal_tableSearch'), 
    'kelas 4')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_Pilih Status Penilaian_ms-2 searchbu_483279'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Belum Lengkap_btn btn-light btn-sm no-but_994e61_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_Kunci Nilai'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_RIMA MIFTACHUL FAHRUDIN_btn btn-light btn_cd2615'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/select_HadirTidak HadirSakitIzinDispensasi'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Kembali'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Loader Absensi'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_Lewati baris nomer 1 (Judul)_skip'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_Proses'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Nilai'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_teori_btn btn-light btn-sm waves-effect w_bf616c'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_-_btn btn-light btn-sm no-button no-shadow'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_praktik_score_items'), 
    '80')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_teori_score_items'), 
    '78')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_Simpan praktik dan teori'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_OK praktik dan teori'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Kembali_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_praktik_btn btn-light btn-sm waves-effect_421e01'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_-_btn btn-light btn-sm no-button no-shadow'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_teori_score_items_1'), 
    '56')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_praktik_score_items_1'), 
    '87')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_Simpan praktik dan teori'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_OK praktik dan teori'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Kembali_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_praktik_btn btn-light btn-sm waves-effect_421e01_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_-_btn btn-light btn-sm no-button no-shadow'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_teori_score_items_1_2'), 
    '87')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_praktik_score_items_1_2'), 
    '67')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_Simpan praktik dan teori'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_OK praktik dan teori'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Kembali_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_praktik_btn btn-light btn-sm waves-effect_421e01_1_2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_-_btn btn-light btn-sm no-button no-shadow'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_teori_score_items_1_2_3'), 
    '87')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_praktik_score_items_1_2_3'), 
    '67')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_Simpan praktik dan teori'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_OK praktik dan teori'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Kembali_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_praktik_btn btn-light btn-sm waves-effect_421e01_1_2_3'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_-_btn btn-light btn-sm no-button no-shadow'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Kembali_1_2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Kembali_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_praktik_btn btn-light btn-sm waves-effect_421e01_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_-_btn btn-light btn-sm no-button no-shadow'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_teori_score_items_1_2_3_4'), 
    '87')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_praktik_score_items_1_2_3_4'), 
    '67')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_Simpan praktik dan teori'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_OK praktik dan teori'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Kembali_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_praktik_btn btn-light btn-sm waves-effect_421e01_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_-_btn btn-light btn-sm no-button no-shadow'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_teori_score_items_1_2_3_4_5'), 
    '78')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_praktik_score_items_1_2_3_4_5'), 
    '87')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_Simpan praktik dan teori'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_OK praktik dan teori'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Kembali_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_praktik_btn btn-light btn-sm waves-effect_421e01_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_-_btn btn-light btn-sm no-button no-shadow'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_teori_score_items_1_2_3_4_5_6'), 
    '67')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_praktik_score_items_1_2_3_4_5_6'), 
    '98')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_Simpan praktik dan teori'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_OK praktik dan teori'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Kembali_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_praktik_btn btn-light btn-sm waves-effect_421e01_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_-_btn btn-light btn-sm no-button no-shadow'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_teori_score_items_1_2_3_4_5_6_7'), 
    '78')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_praktik_score_items_1_2_3_4_5_6_7'), 
    '87')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_Simpan praktik dan teori'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_OK praktik dan teori'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Kembali_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_praktik_btn btn-light btn-sm waves-effect_421e01_1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_-_btn btn-light btn-sm no-button no-shadow'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_teori_score_items_1_2_3_4_5_6_7_8'), 
    '77')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_praktik_score_items_1_2_3_4_5_6_7_8'), 
    '69')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_Simpan praktik dan teori'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_OK praktik dan teori'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Kembali_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Nilai Sikap Perilaku'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Nilai Sikap Perilaku_btn btn-light btn-sm_cda777'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_LULUS VEPBRI APRIYANTO_btn btn-light_0b39f2'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/input_Nilai Sikap Perilaku_score_items'), 
    '99')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_Simpan praktik dan teori'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_OK praktik dan teori'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Kembali_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Status Kelulusan Diklat'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_Kunci Nilai_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/a_Import Nilai'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/01-kelas/02_fungsi ubah dan nilai/button_Proses'))

WebUI.closeBrowser()

