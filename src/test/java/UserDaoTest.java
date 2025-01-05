import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserDaoTest {
    @Test
    public void testRegisterUser() {
        UserDao userDao = new UserDao();
        User user = new User("testuser", "testpass", "test@example.com");
        userDao.registerUser(user);
        
        // Add assertions to verify user registration
    }
}
