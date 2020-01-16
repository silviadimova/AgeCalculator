package com.calculator.runner;

import android.os.Bundle;

import com.calculator.BuildConfig;

import cucumber.api.android.CucumberAndroidJUnitRunner;


@SuppressWarnings("unused")
public class CucumberTestRunner extends CucumberAndroidJUnitRunner {

    private static final String CUCUMBER_TAGS_KEY = "tags";
    private static final String CUCUMBER_SCENARIO_KEY = "name";

    @Override
    public void onCreate(final Bundle bundle) {

        final String tags = BuildConfig.TEST_TAGS;
        String scenario = BuildConfig.TEST_SCENARIO;

        if (!tags.isEmpty()) {
            bundle.putString(CUCUMBER_TAGS_KEY, tags.replaceAll("\\s", ""));
        }
        if (!scenario.isEmpty()) {
            scenario = scenario.replaceAll(" ", "\\\\s");
            bundle.putString(CUCUMBER_SCENARIO_KEY, scenario);
        }
        super.onCreate(bundle);
    }

}
