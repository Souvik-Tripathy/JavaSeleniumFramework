package utils;

public class ExcelUtilsTest {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		ExcelUtils ex = new ExcelUtils(projectPath+"/excel/data.xlsx", "Sheet1");
		
		ex.getRowCount();
		ex.getCellDataNumber(1, 1);
		ex.getCellDataString(1, 0);
		ex.getColCount();

	}

}
