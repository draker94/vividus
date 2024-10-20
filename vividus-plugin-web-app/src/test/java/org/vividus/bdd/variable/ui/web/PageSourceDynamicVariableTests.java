/*
 * Copyright 2019-2021 the original author or authors.
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

package org.vividus.bdd.variable.ui.web;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import com.github.valfirst.slf4jtest.LoggingEvent;
import com.github.valfirst.slf4jtest.TestLogger;
import com.github.valfirst.slf4jtest.TestLoggerFactory;
import com.github.valfirst.slf4jtest.TestLoggerFactoryExtension;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.vividus.bdd.variable.ui.SourceCodeDynamicVariable;

@ExtendWith({ MockitoExtension.class, TestLoggerFactoryExtension.class})
class PageSourceDynamicVariableTests
{
    private static final TestLogger LOGGER = TestLoggerFactory.getTestLogger(PageSourceDynamicVariable.class);

    @Mock
    private SourceCodeDynamicVariable appSourceVariable;

    @InjectMocks
    private PageSourceDynamicVariable pageSourceDynamicVariable;

    @Test
    void shouldLogDeprecation()
    {
        String source = "</html>";
        when(appSourceVariable.getValue()).thenReturn(source);
        assertEquals(source, pageSourceDynamicVariable.getValue());
        assertEquals(List.of(LoggingEvent.error("Dynamice variable `page-source` is deprecated and will be"
                + " removed in VIVIDUS 0.4.0, please use `source-code` instead")), LOGGER.getLoggingEvents());
    }
}
