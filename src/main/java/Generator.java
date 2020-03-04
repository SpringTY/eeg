import com.spring.eeg.mbg.dao.UserloginMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Generator {
    @Autowired
    UserloginMapper userloginMapper;

    @Test
    public void get() {
        userloginMapper.selectByExample(null);
    }


    public static void main(String[] args) throws Exception {
//        try {
//            Generator generatorSqlmap = new Generator();
//            generatorSqlmap.generator();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        UserloginMapper userloginMapper

    }

}
