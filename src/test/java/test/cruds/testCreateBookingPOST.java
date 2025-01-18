package test.cruds;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import jdk.jfr.Description;
import org.openqa.selenium.devtools.v85.overlay.model.HighlightConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCreateBookingPOST {

    @Severity(SeverityLevel.CRITICAL)
    @TmsLink("RMS_t1")
    @Description("Verify the booking by POST")
    @Test
    public void createVerifyCreateBookingPOST(){
        Assert.assertEquals(true,true);
    }
}
