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
package org.jboss.seam.reports.jasper;

import java.io.InputStream;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

import org.jboss.seam.reports.ReportLoader;
import org.jboss.seam.reports.exceptions.ReportException;
import org.jboss.seam.reports.jasper.annotations.Jasper;

@Jasper
public class JasperSeamReportLoader implements ReportLoader
{
   @Override
   public JasperSeamReportDefinition loadReportDefinition(InputStream input) throws ReportException
   {
      try
      {
         JasperReport report = (JasperReport) JRLoader.loadObject(input);
         return new JasperSeamReportDefinition(report);
      }
      catch (JRException e)
      {
         throw new ReportException(e);
      }
   }

   @Override
   public JasperSeamReport loadReport(InputStream input) throws ReportException
   {
      try
      {
         JasperPrint print = (JasperPrint) JRLoader.loadObject(input);
         return new JasperSeamReport(print);
      }
      catch (JRException e)
      {
         throw new ReportException(e);
      }
   }

   @Override
   public JasperSeamReportDefinition loadReportDefinition(String name) throws ReportException
   {
      try
      {
         JasperReport report = (JasperReport) JRLoader.loadObjectFromFile(name);
         return new JasperSeamReportDefinition(report);
      }
      catch (JRException e)
      {
         throw new ReportException(e);
      }
   }

   @Override
   public JasperSeamReport loadReport(String name) throws ReportException
   {
      try
      {
         JasperPrint print = (JasperPrint) JRLoader.loadObjectFromFile(name);
         return new JasperSeamReport(print);
      }
      catch (JRException e)
      {
         throw new ReportException(e);
      }
   }
}