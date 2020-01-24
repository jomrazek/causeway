/**
 * JBoss, Home of Professional Open Source.
 * Copyright 2014 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.pnc.causeway.rest.pnc;

import org.jboss.pnc.dto.ArtifactImportError;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Author: Michal Szynkiewicz, michal.l.szynkiewicz@gmail.com Date: 8/25/16 Time: 2:48 PM
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Deprecated
public class BuildImportResultRest {

    /**
     * id of pnc build record
     */
    private Integer buildRecordId;

    /**
     * build id assigned by brew
     */
    private Integer brewBuildId;
    /**
     * link to brew
     */
    private String brewBuildUrl;

    private BuildImportStatus status;
    /**
     * global errors
     */
    private String errorMessage;

    /**
     * list of errors for artifact imports
     */
    private List<ArtifactImportError> errors;
}
