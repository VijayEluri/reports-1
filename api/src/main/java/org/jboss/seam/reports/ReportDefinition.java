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
package org.jboss.seam.reports;

import java.util.Map;

import org.jboss.seam.reports.exceptions.ReportException;

/**
 * A report definition object (normally called a "template").
 * 
 * This object is normally created using a {@link ReportLoader}.
 * 
 * @author George Gastaldi
 * 
 */
public interface ReportDefinition
{

   /**
    * Produces {@link Report} objects by filling them with a object that this definition can handle and some optional
    * parameters
    * 
    * @param dataSource
    * @param parameters
    * @return
    * @throws ReportException
    */
   Report fill(Object dataSource, Map<String, Object> parameters) throws ReportException;
}
