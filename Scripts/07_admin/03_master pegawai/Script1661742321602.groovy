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

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_Email or username_login'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/button_Login'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/03_master pegawai/a_Admin'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/03_master pegawai/a_Master Pegawai'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_Import_tableSearch'), 
    '08')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/button_All_ms-2 searchbutton rounded px-3 py-2'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_Import_tableSearch'), 
    'ahmad')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/button_All_ms-2 searchbutton rounded px-3 py-2'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_Import_tableSearch'), 
    '')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/button_All_ms-2 searchbutton rounded px-3 py-2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/span_All'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_concat(id(, , select2-employee_filter_4b8f55'), 
    'empl')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_concat(id(, , select2-employee_filter_4b8f55'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/button_All_ms-2 searchbutton rounded px-3 py-2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/a_Tambah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_No Peserta_participant_code'), 
    '1009')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_()_user_nik'), 
    '1212110198123465')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_()_user_name'), 
    'Leris Permata Purnama')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/textarea_Alamat Lengkap_user_address'), 
    'Jalan Raya Danau Maninjau Nomor 15 \nRT 01 RW 05, Kelurahan Gedangan, Kecamatan Magersari\nKota Mojokerto')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_()_user_pob'), 
    'Mojokerto')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_()_user_dob'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/th_August 2022'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/th_2022'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/th_'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/th_'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/th_'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/span_1995'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/span_Jun'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/td_9'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/select_MaleFemale'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/select_IslamProtestanKatolikHinduBudhaKonghucu'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_()_user_email'), 
    'purnama11_leris@gmail.com')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_No Telepon_user_phone'), 
    '081284634928')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_()_user_hp'), 
    '082195382593')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/span_Pencarian'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_concat(id(, , select2-employee_filter_4b8f55'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/li_SD'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_TMT_job_start'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/th_August 2022'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/th_2022'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/span_2019'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/span_Jan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/td_9'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_Angkatan_user_batch'), 
    'IV')

WebUI.selectOptionByValue(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/select_WIBWITAWIT'), 
    'WITA', true)

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_No Rekening_account_number'), 
    '123148591458694')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_NPWP_tax_number'), 
    '13.443.653.5-654.345')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_()_nip'), 
    '1998758492445')

WebUI.setText(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/03_master pegawai/input_()_nrp'), 
    '47284738539579486948')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/span_Pencarian_1'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/li_Juru Muda'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_()_emp_position pangkat'), 
    'Pengatur Muda')

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/span_Pilih Satker'))

WebUI.setText(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input__select2-search__field'), 
    'jawa')

WebUI.sendKeys(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input__select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/button_OK'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/a_Kembali'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/03_master pegawai/a_Admin'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/admin/03_master pegawai/a_Master Pegawai'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_Import_tableSearch'), 
    'leris')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/button_All_ms-2 searchbutton rounded px-3 py-2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/a_Kejaksaan Tinggi Jawa Timur_btn btn-light_55d698'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/input_()_user_name'), 
    'Leris Permata Purnama Sari')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/user/07_master Pegawai/button_OK'))

WebUI.closeBrowser()

