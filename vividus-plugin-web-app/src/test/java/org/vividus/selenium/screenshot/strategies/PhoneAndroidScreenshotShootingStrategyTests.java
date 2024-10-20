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

package org.vividus.selenium.screenshot.strategies;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import ru.yandex.qatools.ashot.shooting.ShootingStrategy;
import ru.yandex.qatools.ashot.shooting.SimpleShootingStrategy;

class PhoneAndroidScreenshotShootingStrategyTests
{
    private final PhoneAndroidScreenshotShootingStrategy strategy = new PhoneAndroidScreenshotShootingStrategy();

    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    void shouldCreateCorrectStrategy(boolean isLandscape)
    {
        ShootingStrategy decoratedShootingStrategy = strategy.getDecoratedShootingStrategy(new SimpleShootingStrategy(),
            isLandscape, null);
        assertThat(decoratedShootingStrategy, instanceOf(ViewportWithCorrectionPastingDecorator.class));
    }
}
