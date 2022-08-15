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

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/input username'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/input password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/button_Login'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/click Kurikulum'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/klik Jenis Diklat'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/input_Bank Soal_tableSearch'), 
    'mapim')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/klik simbol search'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/td_Nama Jenis Diklat'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/td_Nama Jenis Diklat'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/button_Tambah'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/input_()_curriculum_name'), 
    'Pertambangan')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/input_Tanggal Mulai_curriculum_date_start'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/th_'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/th_'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/td_1'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/input_Tanggal Selesai_curriculum_date_finish'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/th_'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/th_'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/td_31'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/textarea_Objektif_curriculum_objective'), 
    'Jadwal materi DIKLAT PERTAMBANGAN selama tahun 2022\nManajemen Pertambangan Rakyat Bagi Instansi Pemerintah sebagai wujud Penyelenggaraan Otonomi Daerah yang Bertanggungjawab.\nKegiatan Usaha Pertambangan Mineral Dan Batubara Berdasarkan Peraturan Pemerintah Nomor 1 Tahun 2017.\nStrategi Pengembangan Wilayah Pertambangan Rakyat\nTata Cara Monitoring dan Pengawasan Pertambangan\nMekanisme Evaluasi Dokumen Amdal Bidang Pertambangan\nPenggunaan Program GIS ( Sistem Informasi Geografis ) pada Bidang Pertambangan\nTata Cara Perhitungan Royalti Mineral dan Batu Bara\nEvaluasi Cadangan Bahan Galian\nAudit PNBP Sub Sektor Mineral dan Batu Bara\nStrategi Pengembangan Wilayah Pertambangan Rakyat\nSosialisasi Peraturan Pemerintah No. 1 Tahun 2014 Perubahan Kedua Atas Peraturan Pemerintah No. 23 Tahun 2010 Tentang Pelaksanaan Kegiatan Usaha Pertambangan Mineral dan Batu Bara')

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/textarea_Tujuan_curriculum_goal'), 
    'mencapai tujuan pertambangan yang efektif dan efisien dalam rangka menciptakan optimasi pengusahaan pertambangan umum.')

WebUI.uploadFile(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/upload file'), 'D:\\ANTHEA KEJAGUNG AUTOMATION VERSI 01\\kurikulum\\jenis diklat\\dokumen\\diklat pertambangan.jpg')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/button_OK'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/a_Pertambangan_btn btn-light btn-sm no-butt_590262'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/a_Kembali'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/a_Pertambangan_btn btn-light btn-sm no-butt_590262'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/textarea_Objektif_curriculum_objective'), 
    'Jadwal materi DIKLAT PERTAMBANGAN  tahun 2022\nManajemen Pertambangan Rakyat Bagi Instansi Pemerintah sebagai wujud Penyelenggaraan Otonomi Daerah yang Bertanggungjawab.\nKegiatan Usaha Pertambangan Mineral Dan Batubara Berdasarkan Peraturan Pemerintah Nomor 1 Tahun 2017.\nStrategi Pengembangan Wilayah Pertambangan Rakyat\nTata Cara Monitoring dan Pengawasan Pertambangan\nMekanisme Evaluasi Dokumen Amdal Bidang Pertambangan\nPenggunaan Program GIS ( Sistem Informasi Geografis ) pada Bidang Pertambangan\nTata Cara Perhitungan Royalti Mineral dan Batu Bara\nEvaluasi Cadangan Bahan Galian\nAudit PNBP Sub Sektor Mineral dan Batu Bara\nStrategi Pengembangan Wilayah Pertambangan Rakyat\nSosialisasi Peraturan Pemerintah No. 1 Tahun 2014 Perubahan Kedua Atas Peraturan Pemerintah No. 23 Tahun 2010 Tentang Pelaksanaan Kegiatan Usaha Pertambangan Mineral dan Batu Bara')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/button_Simpan'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/kurikulum/01_jenis diklat/button_OK'))

WebUI.closeBrowser()

