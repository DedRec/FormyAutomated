import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

    private final String FIRST_NAME = "First Name";
    private final String LAST_NAME = "Last Name";
    private final String JOB_TITLE = "Job Title";

    @FindBy(id = "first-name")
    private WebElement first_name;

    @FindBy(id = "last-name")
    private WebElement last_name;

    @FindBy(id = "job-title")
    private WebElement job_title;

    @FindBy(id = "radio-button-1")
    private WebElement radio_button_1;

    @FindBy(id = "radio-button-2")
    private WebElement radio_button_2;

    @FindBy(id = "radio-button-3")
    private WebElement radio_button_3;

    @FindBy(xpath = "//a[contains(text(),'Submit')]")
    private WebElement submit_button;

    @FindBy(xpath = "//div[contains(text(),'The form was successfully submitted!')]")
    private WebElement alertSuccess;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(){
        this.first_name.sendKeys(FIRST_NAME);
    }

    public void enterLastName(){
        this.last_name.sendKeys(LAST_NAME);
    }

    public void enterJobTitle(){
        this.job_title.sendKeys(JOB_TITLE);
    }

    public void selectRadioButton1(){
        this.radio_button_1.click();
    }

    public void selectRadioButton2(){
        this.radio_button_2.click();
    }

    public void selectRadioButton3(){
        this.radio_button_3.click();
    }

    public void pressSubmitButton(){
        this.submit_button.click();
    }

    public void verifyAlertSuccess(){
        this.alertSuccess.isDisplayed();
    }
}