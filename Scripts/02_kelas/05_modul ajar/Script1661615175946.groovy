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

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/input_Email or username_login'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/button_Login'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_Kelas'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_Modul Ajar'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/input_Bank Soal_tableSearch'), 
    'dtf')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/button_Bank Soal_ms-2 searchbutton rounded _ada804'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_C-01 - Kelas 1_btn btn-light btn-sm no-bu_35d304'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_Kembali'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/input_Bank Soal_tableSearch'), 
    '001')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/button_Bank Soal_ms-2 searchbutton rounded _ada804'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/input_Bank Soal_tableSearch'), 
    'Eksekusi')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/button_Bank Soal_ms-2 searchbutton rounded _ada804'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_C-02 - Kelas II_btn btn-light btn-sm no-button no-shadow'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/button_-_btn btn-light btn-sm no-button no-shadow'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/button_-_btn btn-light btn-sm no-button no-shadow'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_Kembali_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/button_-_btn btn-light btn-sm no-button no-shadow'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/button_- MUH ROFIK_btn no-border bg-grey-so_c1698f'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_Kembali'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_C-02 - Kelas II_btn btn-light btn-sm no-b_5249a2'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/input_Bank Soal_tableSearch'), 
    'selasa')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/button_Bank Soal_ms-2 searchbutton rounded _ada804'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/input_Bank Soal_tableSearch'), 
    '')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/span_All'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/input_concat(id(, , select2-uploading_statu_77ffa8'), 
    'sudah')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/input_concat(id(, , select2-uploading_statu_77ffa8'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/button_Bank Soal_ms-2 searchbutton rounded _ada804'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_Kembali'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_C-02 - Kelas II_btn btn-light btn-sm no-b_5249a2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_Senin, 01 Agustus 2022_btn btn-light btn-_478799'))

WebUI.setText(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/textarea_Fungsi_material_name'), 'pertambangan')

WebUI.setText(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/textarea_Fungsi_material_description'), 
    'modul pembelajaran untuk pertambangan')

WebUI.uploadFile(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/input_Fungsi_material_file'), 'D:\\ANTHEA KEJAGUNG AUTOMATION VERSI 01\\kelas\\modul ajar\\dokumen\\pertambangan.pdf')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/button_Simpan upload file'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/button_OK berhasil disi,pan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_Kembali_1_2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_Kembali'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_C-02 - Kelas II_btn btn-light btn-sm no-b_5249a2_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_Online_btn btn-light btn-sm no-button no-shadow'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/button_Simpan'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/button_OK untuk ujian'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_Online_btn btn-light btn-sm no-button no-shadow'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_Kembali_1_2_3'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_Online_btn btn-light btn-sm no-button no-shadow'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_Monitoring'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_Export Excel'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_Unduh File Jawaban'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_Kembali_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kelas/03_modul ajar/a_Kembali_1_2_3_4_5'))

WebUI.closeBrowser()

