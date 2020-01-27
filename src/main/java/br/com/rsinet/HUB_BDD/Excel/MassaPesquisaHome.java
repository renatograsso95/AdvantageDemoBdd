package br.com.rsinet.HUB_BDD.Excel;

public class MassaPesquisaHome {
	public String HP_Pro() throws Exception {
	ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "BuscaHome");
	String HPPro = ExcelUtils.getCellData(0, 0);
	return HPPro;
	}
}
