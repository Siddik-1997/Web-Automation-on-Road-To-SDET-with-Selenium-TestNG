import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class TestRunner extends Setup {
    CreateUser createUser;
    @Test
    public void userRegistration() throws InterruptedException {
        createUser= new CreateUser(driver);
        Faker faker= new Faker();
        String firstName=faker.name().firstName();
        String lastName=faker.name().lastName();
        int randomValue=Utils.generateRandomNumber(10,15);
        String email=firstName+randomValue+"@gmail.com";
        String password=firstName+randomValue;
        String phoneNumber=faker.phoneNumber().cellPhone();
        String address=faker.address().fullAddress();
        createUser.createUser(firstName,lastName,email,password,phoneNumber,address);

    }
}
