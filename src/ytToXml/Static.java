package ytToXml;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Static {
	private Static() {
	}

	public static String get(String gde) throws IOException {
		Path path = Paths.get(gde);
		Charset charset = StandardCharsets.UTF_8;
		return new String(Files.readAllBytes(path), charset);
	}

	public static void write(String gde, String str) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(gde));
		writer.write(str);
		writer.close();
	}
}
