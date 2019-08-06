package sfgpetclinic;


import com.sun.glass.ui.Application;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = Application.class) //important its solve exeption
public class SfgPetClinicApplicationTests {

    @Test
    public void contextLoads() {
    }

}
