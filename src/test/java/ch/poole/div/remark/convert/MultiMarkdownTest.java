/*
 * Copyright 2011 OverZealous Creations, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ch.poole.div.remark.convert;

import org.junit.Test;

import ch.poole.div.remark.Options;
import ch.poole.div.remark.Remark;

/**
 * @author Phil DeJarnett
 */
public class MultiMarkdownTest extends RemarkTester {

	@Override
	public Remark setupRemark() {
		return new Remark(Options.multiMarkdown());
	}

	@Test public void testAbbr()			throws Exception { test("abbr"); }
	@Test public void testAnchor()			throws Exception { test("anchor"); }
	@Test public void testBlockQuote()		throws Exception { test("blockquote"); }
	@Test public void testHeader()			throws Exception { test("header"); }
	@Test public void testBreak()			throws Exception { test("break"); }
	@Test public void testCodeblock()		throws Exception { test("codeblock"); }
	@Test public void testDefinitions()		throws Exception { test("definitions", "enabled"); }
	@Test public void testHorizontalRule()	throws Exception { test("horizontalrule"); }
	@Test public void testImage()			throws Exception { test("image"); }
	@Test public void testInlineCode()		throws Exception { test("inlinecode"); }
	@Test public void testInlineStyle()		throws Exception { test("inlinestyle"); }
	@Test public void testListOrdered()		throws Exception { test("listordered"); }
	@Test public void testListUnordered()	throws Exception { test("listunordered"); }
	@Test public void testParagraph()		throws Exception { test("paragraph"); }
	@Test public void testTables()			throws Exception { test("tables", "multimarkdown"); }
	@Test public void testUnknownHTML()		throws Exception { test("unknownHTML"); }
	
}
