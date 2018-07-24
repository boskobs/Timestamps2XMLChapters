# Timestamps2XMLChapters
An app that converts timestamps into XML chapters

An input file should look like this:
<pre>
2:08 Introduction
57:40 How its done
1:46:02 Credits
</pre>
And a given output to that would look like this:

<pre><code>
&lt;?xml version="1.0" encoding="ISO-8859-1"?&gt;
&lt;!DOCTYPE Chapters SYSTEM "matroskachapters.dtd"&gt;
&lt;Chapters&gt;
&lt;EditionEntry&gt;
&lt;ChapterAtom&gt;
&lt;ChapterTimeStart&gt;2:08&lt;/ChapterTimeStart&gt;
&lt;ChapterTimeEnd&gt;57:40&lt;/ChapterTimeEnd&gt;
&lt;ChapterDisplay&gt;
&lt;ChapterString&gt;Introduction&lt;/ChapterString&gt;
&lt;ChapterLanguage&gt;und&lt;/ChapterLanguage&gt;
&lt;/ChapterDisplay&gt;
&lt;/ChapterAtom&gt;
&lt;ChapterAtom&gt;
&lt;ChapterTimeStart&gt;57:40&lt;/ChapterTimeStart&gt;
&lt;ChapterTimeEnd&gt;1:46:02&lt;/ChapterTimeEnd&gt;
&lt;ChapterDisplay&gt;
&lt;ChapterString&gt;How its done&lt;/ChapterString&gt;
&lt;ChapterLanguage&gt;und&lt;/ChapterLanguage&gt;
&lt;/ChapterDisplay&gt;
&lt;/ChapterAtom&gt;
&lt;ChapterAtom&gt;
&lt;ChapterTimeStart&gt;1:46:02&lt;/ChapterTimeStart&gt;
&lt;ChapterTimeEnd&gt;1:55:12&lt;/ChapterTimeEnd&gt;
&lt;ChapterDisplay&gt;
&lt;ChapterString&gt;Credits&lt;/ChapterString&gt;
&lt;ChapterLanguage&gt;und&lt;/ChapterLanguage&gt;
&lt;/ChapterDisplay&gt;
&lt;/ChapterAtom&gt;
&lt;/EditionEntry&gt;
&lt;/Chapters&gt;
</code></pre>
Start the program like this:
java -jar ytToXml.jar ~/Desktop/sometimelines.txt /tmp/output.xml '1:55:12'
