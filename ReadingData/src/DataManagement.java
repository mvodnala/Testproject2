
public class DataManagement {

	public static void main(String[] args) {
		Xls_Reader xls=new Xls_Reader("C:\\Users\\sures\\Desktop\\Notes\\Data.xlsx");
        String sheetName="Data";
        String testCaseName="TestC";
        //reads data for only testCaseName
        
        int testStartRowNum=1;
        while(!xls.getCellData(sheetName, 0, testStartRowNum).equals(testCaseName)) {
        testStartRowNum++;
        }
        System.out.println("Test satrts from row-"+testStartRowNum);
        int colStartRowNum=testStartRowNum+1;
        int dataStartRowNum=testStartRowNum+2;
        
        //calculate rows of data
        int rows=0;
        while(!xls.getCellData(sheetName, 0, dataStartRowNum+rows).equals("")) {
        	rows++;
          }
        System.out.println("Total rows are-"+rows);
        
        //calculate columns of data
        int cols=0;
        while(!xls.getCellData(sheetName, cols, colStartRowNum).equals("")) {
        	cols++;
          }
        System.out.println("Total columns are-"+cols); 
        
        //read data
        for(int rNum=dataStartRowNum;rNum<dataStartRowNum+rows;rNum++) {
        	for(int cNum=0;cNum<cols;cNum++) {
        		System.out.println(xls.getCellData(sheetName, cNum, rNum));
        	}
        }
	}

}
