
public class ReadingData {
	
	public static void main(String[]args)
	
	{
		Xls_Reader xls=new Xls_Reader("C:\\Users\\sures\\Desktop\\Notes\\Data.xlsx");
		int rows=xls.getRowCount("Login");
		System.out.println("Total rows are.."+rows);
		int cols=xls.getColumnCount("Login");
		System.out.println("Total number of columns are..."+cols);
		String data=xls.getCellData("Login", "Password", 3);
		System.out.println(data);
		data=xls.getCellData("Login",0 ,3);
		System.out.println(data);
		
		xls.setCellData("Login", "Password", 6, "Selenium");
	}
}
