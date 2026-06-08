package com.automation.utils;


import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;

public class ExcelUtil {

    public static String getData(
            int row,
            int cell)
            throws Exception {

        FileInputStream file =new FileInputStream("src/test/resources/testdata/login.xlsx");

        Workbook wb =WorkbookFactory.create(file);

        Sheet sheet =
                wb.getSheet("Login");

        String value =
                sheet
                .getRow(row)
                .getCell(cell)
                .getStringCellValue();

        wb.close();

        return value;
    }
}