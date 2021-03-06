package readCsvFile;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class Main {

	public static void main(String[] args) {

		String fileName = "D:/EDU/JAVA Native/IO/readCsvFile/src/main/resources/file/DataKaryawan.csv";
		try (CSVReader reader = new CSVReader(new FileReader(fileName))) {

			// Read all row
			// List<String[]> r = reader.readAll();
			// r.forEach(x -> System.out.println(Arrays.toString(x)));

			// Read row without header
			String[] lineInArray;
			int i = 0;
			try {
				while ((lineInArray = reader.readNext()) != null) {
					i++;
					if (i <= 1) {
						continue;
					}
					System.out.println(lineInArray[0]);
				}
			} catch (CsvValidationException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
