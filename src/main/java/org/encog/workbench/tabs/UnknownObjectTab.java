/*
 * Encog(tm) Workbench v3.2
 * http://www.heatonresearch.com/encog/
 * https://github.com/encog/encog-java-workbench
 *
 * Copyright 2008-2013 Heaton Research, Inc.
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
 *   
 * For more information on Heaton Research copyrights, licenses 
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package org.encog.workbench.tabs;

import org.encog.util.HTMLReport;
import org.encog.workbench.frames.document.tree.ProjectEGFile;

public class UnknownObjectTab extends HTMLTab {

	public UnknownObjectTab(ProjectEGFile encogObject) {
		super(encogObject);
		HTMLReport report = new HTMLReport();
		report.beginHTML();
		String title = "Unknown Encog Object Type";
		report.title(title);
		report.beginBody();
		report.h1(title);
		report.para("Unknown Object: " + encogObject.getEncogType());
		report.endBody();
		report.endHTML();
		this.display(report.toString());
		
	}
	
	@Override
	public String getName() {
		return "Unknown :" + this.getEncogObject().getName();
	}

}
