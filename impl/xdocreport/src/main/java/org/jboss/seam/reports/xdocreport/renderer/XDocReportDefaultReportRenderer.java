/**
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.seam.reports.xdocreport.renderer;

import java.io.IOException;
import java.io.OutputStream;

import javax.enterprise.inject.Default;

import org.jboss.seam.reports.Report;
import org.jboss.seam.reports.ReportRenderer;
import org.jboss.seam.reports.exceptions.ReportException;
import org.jboss.seam.reports.xdocreport.XDocReportSeamReport;
import org.jboss.seam.reports.xdocreport.annotations.XDocReport;

import fr.opensagres.xdocreport.core.XDocReportException;
import fr.opensagres.xdocreport.document.IXDocReport;
import fr.opensagres.xdocreport.template.IContext;

@XDocReport
@Default
public class XDocReportDefaultReportRenderer implements ReportRenderer {

    @Override
    public void render(Report report, OutputStream output) throws IOException {
        XDocReportSeamReport seamReport = (XDocReportSeamReport) report;
        IXDocReport delegate = seamReport.getDelegate();
        IContext context = seamReport.getContext();
        try {
            delegate.process(context, output);
        } catch (XDocReportException e) {
            throw new ReportException(e);
        }
    }

}
