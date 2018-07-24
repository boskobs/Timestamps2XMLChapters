package ytToXml;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		if (args.length < 3) {
			System.out.println(
					"First argument is the input;\nSecond argument is the output;\nThird argument is the end of the last chapter.");
			return;
		}
		String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n<!DOCTYPE Chapters SYSTEM \"matroskachapters.dtd\">\n<Chapters>\n<EditionEntry>\n";
		List<String> lista = Arrays.asList(Static.get(args[0]).split("\n"));
		for (int x = 0; x < lista.size(); x++) {
			String start = lista.get(x).split(" ", 2)[0];
			String end = "";
			if (lista.size() - 1 >= x + 1)
				end = lista.get(x + 1).split(" ", 2)[0];
			else
				end = args[2];
			String chapter = lista.get(x).split(" ", 2)[1];
			xml += "<ChapterAtom>\n<ChapterTimeStart>" + start + "</ChapterTimeStart>\n<ChapterTimeEnd>" + end
					+ "</ChapterTimeEnd>\n<ChapterDisplay>\n<ChapterString>" + chapter
					+ "</ChapterString>\n<ChapterLanguage>und</ChapterLanguage>\n</ChapterDisplay>\n</ChapterAtom>\n";
		}
		xml += "</EditionEntry>\n</Chapters>";
		Static.write(args[1], xml);
	}
}
