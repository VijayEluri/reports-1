package org.jboss.seam.reports.jasperreports.renderer;

import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.export.JRPdfExporter;

import org.jboss.seam.reports.annotations.frameworks.JasperReports;
import org.jboss.seam.reports.annotations.output.PDF;

@JasperReports
@PDF
public class JasperPDFReportRenderer extends AbstractJasperReportRenderer {
    @Override
    protected JRExporter getExporter() {
        return new JRPdfExporter();
    }
}