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

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/input_Email or username_login'), 
    '0102934830140000')

WebUI.maximizeWindow()

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/button_Login'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/a_e-Library'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/a_Manajemen e-Library'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/input_Bank Soal_tableSearch'), 
    '003')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/button_All_ms-2 searchbutton rounded px-3 py-2'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/input_Bank Soal_tableSearch'), 
    '')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/span_All'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/input_concat(id(, , select2-literatur_type__d7a54f'), 
    'buku')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/input_concat(id(, , select2-literatur_type__d7a54f'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/button_All_ms-2 searchbutton rounded px-3 py-2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/button_Tambah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/input__library_code'), 
    'kode-01')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/input__literatur_title'), 
    'testing e-book')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/input__literatur_author'), 
    'testing XYZ')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/input__literatur_publisher'), 
    'Mitra Jaksa Agung')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/input__literatur_publication_year'), 
    '2017')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/input_ISBNISSN_literatur_isbn'), 
    '009-001-0021-31-4')

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/select_BukuDokumene-BookJurnal'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/span_Kategori'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/input_concat(id(, , select2-literatur_type__d7a54f'), 
    'um')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/input_concat(id(, , select2-literatur_type__d7a54f'), 
    Keys.chord(Keys.ENTER))

not_run: WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/li_Subjek_select2-search select2-search--inline'))

not_run: WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/input_concat(id(, , select2-literatur_type__d7a54f'), 
    'A')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/textarea_Deskripsi_literatur_description'), 
    'Jangan disebarluaskan')

WebUI.uploadFile(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/input_File_literatur_file'), 
    'D:\\ANTHEA KEJAGUNG AUTOMATION VERSI 01\\e-library\\managament library\\dokumen\\hukum pidana.pdf')

WebUI.uploadFile(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/input_Thumbnail_literatur_thumbnail'), 
    'D:\\ANTHEA KEJAGUNG AUTOMATION VERSI 01\\e-library\\managament library\\dokumen\\testing.jpg')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/button_Simpan untuk tambah'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/button_All_ms-2 searchbutton rounded px-3 py-2'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/input_Bank Soal_tableSearch'), 
    '001')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/button_All_ms-2 searchbutton rounded px-3 py-2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/a_Umum_btn btn-light btn-sm no-button no-shadow'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/textarea_Deskripsi_literatur_description'), 
    'Membahas tetang Kepemimpinan Leadership sebagai wujud tanggung jawab')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/button_Submit'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/button_OK untuk ubah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/input_Bank Soal_tableSearch'), 
    'kode-01')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/e-library/02_managament library/button_All_ms-2 searchbutton rounded px-3 py-2'))

WebUI.closeBrowser()

