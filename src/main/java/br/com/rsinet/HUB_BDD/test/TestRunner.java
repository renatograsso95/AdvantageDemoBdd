package br.com.rsinet.HUB_BDD.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "target/feature/",
		glue = { "br.com.rsinet.HUB_BDD.stepDefinition" },plugin = { "pretty", "html:reports" })

public class TestRunner {

}