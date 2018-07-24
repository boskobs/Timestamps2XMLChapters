# Timestamps2XMLChapters
An app that converts timestamps into XML chapters

An input file should look like this:

2:08 Introduction
57:40 How its done
1:46:02 Credits

And a given output to that would look like this:

<?xml version="1.0" encoding="ISO-8859-1"?>
<!DOCTYPE Chapters SYSTEM "matroskachapters.dtd">
<Chapters>
<EditionEntry>
<ChapterAtom>
<ChapterTimeStart>2:08</ChapterTimeStart>
<ChapterTimeEnd>57:40</ChapterTimeEnd>
<ChapterDisplay>
<ChapterString>Introduction</ChapterString>
<ChapterLanguage>und</ChapterLanguage>
</ChapterDisplay>
</ChapterAtom>
<ChapterAtom>
<ChapterTimeStart>57:40</ChapterTimeStart>
<ChapterTimeEnd>1:46:02</ChapterTimeEnd>
<ChapterDisplay>
<ChapterString>How its done</ChapterString>
<ChapterLanguage>und</ChapterLanguage>
</ChapterDisplay>
</ChapterAtom>
<ChapterAtom>
<ChapterTimeStart>1:46:02</ChapterTimeStart>
<ChapterTimeEnd>1:55:12</ChapterTimeEnd>
<ChapterDisplay>
<ChapterString>Credits</ChapterString>
<ChapterLanguage>und</ChapterLanguage>
</ChapterDisplay>
</ChapterAtom>
</EditionEntry>
</Chapters>

Start the program like this:
java -jar ytToXml.jar ~/Desktop/sometimelines.txt /tmp/output.xml '1:55:12'
