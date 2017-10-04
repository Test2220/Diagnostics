import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class CSVWriterTest {
	
	@Test
	public void test() throws IOException {
		String filename = "tempFile";
		CSVWriter writer = new CSVWriter(filename);
		writer.appendRow(new String[]{"data1","data2"});
		writer.close();
		CSVReader reader = new CSVReader(filename);
		String[] line1 = reader.readRow();
		assertArrayEquals(line1, new String[]{"data1","data2"});
		String[] line2 = reader.readRow();
		assertArrayEquals(line2, null);
		
		reader.close();
	}
}
