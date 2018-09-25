package mx.gob.cnbv.cucumber.stepdefs;

import mx.gob.cnbv.CnbvApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = CnbvApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
