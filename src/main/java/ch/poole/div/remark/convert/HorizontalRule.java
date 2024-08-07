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

import org.jsoup.nodes.Element;

import ch.poole.div.remark.util.StringUtils;

/**
 * Handles a simple hr tag
 *
 * @author Phil DeJarnett
 */
public class HorizontalRule extends AbstractNodeHandler {

	public void handleNode(NodeHandler parent, Element node, DocumentConverter converter) {
		converter.output.startBlock();
		StringUtils.multiply(converter.output, '-', 20);
		converter.output.endBlock();
	}
}
