package stepDefinition;

import core.DSL;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends DSL {

    @Before
    public void setUp(){

    }

    @After
    public void teardown(){
        closeBrowser();
    }

}
