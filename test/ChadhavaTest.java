package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.ChadhavaPage;

public class ChadhavaTest extends BaseTest {

    @Test
    public void verifyInvalidAmountShowsError() {
        ChadhavaPage p = new ChadhavaPage(driver);

        p.openChadhava();
        p.selectSeva("Abhishek Seva");
        p.pickDate("2025-09-10");
        p.enterAmount("abc");   // invalid input
        p.clickProceed();

        String err = p.getError();
        Assert.assertTrue(err.contains("Please enter valid amount"), "Invalid amount error expected");
    }
}
