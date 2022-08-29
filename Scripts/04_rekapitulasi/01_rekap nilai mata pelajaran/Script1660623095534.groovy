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

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/01_rekap nilai mata pelajaran/input_Email or username_login'), 
    '0102934830140000')

WebUI.setEncryptedText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/01_rekap nilai mata pelajaran/input_Password_password'), 
    'kEQfCA3lIgnHsTewXuZ6Gw==')

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/01_rekap nilai mata pelajaran/button_Login'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/01_rekap nilai mata pelajaran/a_Rekapitulasi'))

WebUI.click(findTestObject('ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/01_rekap nilai mata pelajaran/a_Rekap Nilai Mata Pelajaran'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/01_rekap nilai mata pelajaran/span_Diklat'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/01_rekap nilai mata pelajaran/input_concat(id(, , select2-opts_courses-re_331090'), 
    'ppj')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/01_rekap nilai mata pelajaran/input_concat(id(, , select2-opts_courses-re_331090'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/01_rekap nilai mata pelajaran/span_Pilih Satdik'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/01_rekap nilai mata pelajaran/input_concat(id(, , select2-opts_courses-re_331090'), 
    'mapi')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/01_rekap nilai mata pelajaran/input_concat(id(, , select2-opts_courses-re_331090'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/01_rekap nilai mata pelajaran/span_Pilih Kelas'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/01_rekap nilai mata pelajaran/input_concat(id(, , select2-opts_courses-re_331090'), 
    'kelas 2')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/01_rekap nilai mata pelajaran/input_concat(id(, , select2-opts_courses-re_331090'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/01_rekap nilai mata pelajaran/span_Pilih Mata Pelajaran'))

WebUI.setText(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/01_rekap nilai mata pelajaran/input_concat(id(, , select2-opts_courses-re_331090'), 
    'ek')

WebUI.sendKeys(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/01_rekap nilai mata pelajaran/input_concat(id(, , select2-opts_courses-re_331090'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/01_rekap nilai mata pelajaran/button__ms-2 searchbutton rounded px-3 py-2'))

WebUI.click(findTestObject('Object Repository/ANTHEA KEJAGUNG AUTOMATION VERSI 01/rekapitulasi/01_rekap nilai mata pelajaran/button_Excel'))

WebUI.closeBrowser()

