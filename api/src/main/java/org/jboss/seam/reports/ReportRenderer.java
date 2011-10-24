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

import java.io.IOException;
import java.io.OutputStream;

/**
 * Renders a report to a specific output
 * 
 * @author george
 * 
 */
public interface ReportRenderer
{

   /**
    * Renders a report to the supplied {@link OutputStream}.
    * 
    * Implementations should close the {@link OutputStream} after writing to it.
    * 
    * @param report - Report to be rendered
    * @param output - Output for the report
    * @throws IOException if writing to the {@link OutputStream} fails
    */
   void render(Report report, OutputStream output) throws IOException;
}
