package br.com.rsinet.HUB_BDD.Excel;

public class MassaLupa {

	public String PesquisaProduto01() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "BuscaLupa");
		
		String pesqProduto01 = ExcelUtils.getCellData(0, 0);
		return pesqProduto01;
	}
	
	public String ClicaProduto01() throws Exception{
		String clickProduto01 = ExcelUtils.getCellData(1, 0	);
		return clickProduto01;
	}
	
	public String ProdutoInvalido() throws Exception {
		String produtoInvalido = ExcelUtils.getCellData(0, 1);
		return produtoInvalido;
	}
}
