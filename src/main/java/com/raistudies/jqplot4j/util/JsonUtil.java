/*
 * Copyright 2013 @ www.raistudies.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.raistudies.jqplot4j.util;

import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 *
 * @author Rahul
 */
public class JsonUtil {

    private static final ObjectWriter jsonWriter = new ObjectMapper()
            .setSerializationInclusion(JsonSerialize.Inclusion.NON_DEFAULT)
            .writer();

    private static final ObjectWriter jsonWriterPretty = new ObjectMapper()
            .setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL)
            .writerWithDefaultPrettyPrinter();

    public static String convertToJson(Object object, boolean pretty) throws IOException {
        if (pretty) {
            return jsonWriterPretty.writeValueAsString(object);
        } else {
            return jsonWriter.writeValueAsString(object);
        }
    }
}
