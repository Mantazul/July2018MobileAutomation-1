package PostsTest;

import PostsHomePage.Posts;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PostTest extends Posts{
    @BeforeMethod
    public void init(){
       PageFactory.initElements(ad,Posts.class);
    }
    @Test
    public void testClickOnFirstHeadLine(){
        clickOnFirstHeadline();
    }
}
