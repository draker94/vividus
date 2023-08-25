/*
 * Copyright 2019-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.vividus.converter.ui.web;

import org.vividus.converter.ui.AbstractExamplesTableToScreenshotConfigurationConverter;
import org.vividus.ui.web.screenshot.WebScreenshotConfiguration;

import jakarta.inject.Named;

@Named
public class ExamplesTableToWebScreenshotConfigurationConverter
        extends AbstractExamplesTableToScreenshotConfigurationConverter<WebScreenshotConfiguration>
{
    protected ExamplesTableToWebScreenshotConfigurationConverter()
    {
        super(WebScreenshotConfiguration.class);
    }
}
