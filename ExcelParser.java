package com.aeries.utils.excelparser;

/**
 * Created by balaji on 7/30/2018.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelParser {

    public static void main(String[] args) throws IOException {

        InputStream file = new FileInputStream(new File("C:\\Users\\balaji\\IdeaProjects\\utils\\excel-parser\\src\\main\\resources\\AERIS 30 July.XLSX"));
        Workbook workbook = new XSSFWorkbook(file);

        Sheet sheet = workbook.getSheetAt(0);

        Map<Integer, List<String>> data = new HashMap<>();
        int i = 0;
        for (Row row : sheet) {
            data.put(i, new ArrayList<>());

            for (Cell cell : row) {
                switch (cell.getCellTypeEnum()) {

                    case STRING:
                        data.get(i).add(cell.getRichStringCellValue().getString());
                        break;

                    case NUMERIC:
                        if (DateUtil.isCellDateFormatted(cell)) {
                            data.get(i).add(cell.getDateCellValue() + "");
                        } else {
                            data.get(i).add(cell.getNumericCellValue() + "");
                        }
                        break;

                    case BOOLEAN:
                        data.get(i).add(cell.getBooleanCellValue() + "");
                        break;

                    case FORMULA:
                        data.get(i).add(cell.getCellFormula() + "");
                        break;

                    default:
                        data.get(new Integer(i)).add(" ");
                }
            }
            i++;
        }
        for (Map.Entry<Integer, List<String>> entry : data.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }


}