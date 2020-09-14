/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dromara.athena.core.config;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Getter;
import org.dromara.athena.core.enums.MetricType;

/**
 * The type Metric.
 *
 * @author xiaoyu
 */
@Getter
public class Metric {
    
    private final MetricType type;
    
    private final String name;
    
    private final String doc;
    
    private final List<String> labels;
    
    /**
     * Instantiates a new Metric.
     *
     * @param type   the type
     * @param name   the name
     * @param doc    the doc
     * @param labels the labels
     */
    @JsonCreator
    Metric(@JsonProperty("type") MetricType type,
           @JsonProperty("name") String name,
           @JsonProperty("doc") String doc,
           @JsonProperty("labels") List<String> labels) {
        this.type = type;
        this.name = name;
        this.doc = doc;
        this.labels = labels;
    }
}
