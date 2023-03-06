@FunctuionalTest
Feature: FB Page Ttest

@Smoke
Scenario: This is the login test
Given Login Test

@Smoke @RegressionTest
Scenario: This is the sign in test
Given Sign Test

@Smoke @RegressionTest
Scenario: This is the Sign up test
Given Sign Up Test

@Smoke @RegressionTest
Scenario: This is the Reading test
Given Reading Test

@Smoke @SanityTest
Scenario: This is the watching test
Given Watching Test

@Smoke @SanityTest
Scenario: This is the weight test
Given weight Test

@SanityTest @RegressionTest
Scenario: This is the length test
Given Length Test

@Smoke @SanityTest @RegressionTest
Scenario: This is the Power test
Given Power Test